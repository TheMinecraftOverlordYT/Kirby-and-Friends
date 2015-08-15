package kirbyandfriends;
import kirbyandfriends.entities.*;
import kirbyandfriends.items.CustomEntityList;
import kirbyandfriends.items.CustomMonsterPlacer;
import kirbyandfriends.items.ItemGalaxia;
import kirbyandfriends.items.ItemHammer;
import kirbyandfriends.items.ItemSummonCreepy;
import kirbyandfriends.items.Lollipop;
import kirbyandfriends.items.Maxim_Tomato;
import kirbyandfriends.items.WishStar;
import kirbyandfriends.keys.KeyHandler;
import kirbyandfriends.keys.ShoulderKeyHandler;
import kirbyandfriends.keys.Keybinding;
import kirbyandfriends.packet_handling.SpawnPacket;
import kirbyandfriends.packet_handling.SpawnPacket.SpawnPacketHandler;
import kirbyandfriends.schematics.hallberd.WorldGenerationHalberd;
import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.util.logging.Logger;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kirbyandfriends.blocks.DreamBlock;

@Mod(modid=KirbyMod.modid,name = "Kirby and Friends",version = "3")

public class KirbyMod {
	@SidedProxy(clientSide="kirbyandfriends.ClientProxyClass", serverSide="kirbyandfriends.MyCommonProxy")
	public static MyCommonProxy proxy;
	public static final String modid = "kirbyandfriends"; 

	public int KirbySpawnRate;
	public int CreepyKirbySpawnRate;
	public int WaddleDeeSpawnRate;
	public int WaddleDooSpawnRate;
	public int DededeSpawnRate;
	public int BlipperSpawnRate;
	public int WispySpawnRate;
	
	public static int KirbyPhoneColor;
	public static int WaddleDooPhoneColor;
	
	
	public static Item maxim_tomato;
	public static Item lollipop;
	public static Item custommonsterplacer;
	 public static Item wishstar;
	 public static Item creepyspawn;
	public static Item hammer; 
	 
	 public static Block DreamBlock;

	    public static SimpleNetworkWrapper network;
	 
        private ShoulderKeyHandler kbh;
		private int Key;
		public static Item galaxia;
        public static Configuration config;
        private static boolean enabled = true;
        public static Logger logger;
	    
	    
	    @Instance("kirbyandfriends")
	    public static KirbyMod instance;
	    
	  

	public static CreativeTabs tabCustom = new CreativeTabs("Kirby") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return (wishstar);
	    }
	};
	

	
	
	@EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
		
	     // proxy.initOther();
	
		//MinecraftForge.EVENT_BUS.register(new OverridePlayer());
		
		 network = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");
	       network.registerMessage(SpawnPacketHandler.class, SpawnPacket.class, 0, Side.SERVER);
		
		  Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		 
		  config.load();
	     KirbySpawnRate = config.get("Options", "Kirby spawn rate", 5).getInt();
	     CreepyKirbySpawnRate= config.get("Options", "Creepy Kirby spawn rate", 10).getInt();
	    WaddleDeeSpawnRate= config.get("Options", "Waddle Dee spawn rate", 10).getInt();
	    WaddleDooSpawnRate= config.get("Options", "Waddle Doo spawn rate", 10).getInt();
	    //DededeSpawnRate= config.get("Options", "Dedede spawn rate", 10).getInt();
	    BlipperSpawnRate= config.get("Options", "Blipper spawn rate", 10).getInt();
	    WispySpawnRate= config.get("Options", "Whispy spawn rate", 10).getInt();
	    KirbyPhoneColor = config.get("Options", "Color for Kirby`s phone(Use this calculation:(myColor.getRed() << 16) + (myColor.getGreen() << 8) + myColor.getBlue();",  15771042).getInt();
	 	WaddleDooPhoneColor = config.get("Options", "Color for Waddle Doo`s phone", 14377823).getInt(); 
	    Key = config.get("Options", "Key to shoot wishstars. Using keyboard codes.", Keyboard.KEY_P).getInt(); 
	 	config.save();
		 proxy.registerRenderers();
		 //RenderingRegistry.registerEntityRenderingHandler(EntityKirby.class, new RenderKirbyPaletteA(new ModelKirby(), 0.3F));
		  //RenderingRegistry.registerEntityRenderingHandler(EntityCreepy.class, new RenderCreepy(new ModelKirby(), 0.3F));
		 

	 }
	
	public static int getUniqueID(){
		int EntityId = 400;
		do{
		EntityId++;
		} while(CustomEntityList.getStringFromID(EntityId) != null);
			return EntityId;
		}

		public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		CustomEntityList.IDtoClassMapping.put(id, entity);
		CustomEntityList.entityEggs.put(id, new CustomEntityList.MyEntityEggInfo(id, primaryColor, secondaryColor));
		}
	
	@EventHandler

	public void load(FMLInitializationEvent event)
	{
		int entityid= 0;
		FMLCommonHandler.instance().bus().register(new KeyHandler());
		 // kbh = ShoulderKeybindings.registerKeybindings();
		  
	
		
		
		GameRegistry.registerWorldGenerator(new WorldGenerationHalberd(), 100);
			
		EntityRegistry.registerModEntity(EntityKirby.class, "Kirby", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityCreepy.class, "Creepy", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityBlipper.class, "Blipper", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityDedede.class, "Dedede", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityWaddleDee.class, "waddledee", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityThrownApple.class, "Thrown Apple", ++entityid, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityThrownEmerald.class, "Thrown Emerald" , ++entityid, this, 64,10, true);
		EntityRegistry.registerModEntity(EntityWaterSpit.class, "Spat water", ++entityid, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityThrownWishStar.class, "Thrown Wish Star" , ++entityid, this, 64,10, true);
		EntityRegistry.registerModEntity(EntityWispy.class, "Wispy", ++entityid, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWaddleDoo.class, "waddledoo", ++entityid, this, 64, 10, true);
		
		
		 EntityRegistry.addSpawn(EntityKirby.class, KirbySpawnRate,1 , 2, EnumCreatureType.ambient, BiomeGenBase.plains);
		 EntityRegistry.addSpawn(EntityCreepy.class, CreepyKirbySpawnRate, 1, 2, EnumCreatureType.monster, BiomeGenBase.plains);
		 EntityRegistry.addSpawn(EntityWaddleDee.class, WaddleDeeSpawnRate, 1, 2, EnumCreatureType.ambient, BiomeGenBase.plains);
		 EntityRegistry.addSpawn(EntityBlipper.class, BlipperSpawnRate, 1, 2, EnumCreatureType.ambient, BiomeGenBase.ocean);
		EntityRegistry.addSpawn(EntityDedede.class, DededeSpawnRate, 1, 2, EnumCreatureType.monster, BiomeGenBase.plains);
		 EntityRegistry.addSpawn(EntityWispy.class, WispySpawnRate, 1, 2, EnumCreatureType.monster, BiomeGenBase.forest);
		 
		 
		 
		 custommonsterplacer = new CustomMonsterPlacer().setUnlocalizedName("custommonsterplacer").setTextureName("kirbyandfriends:CellPhone").setCreativeTab(tabCustom);
		maxim_tomato = new Maxim_Tomato(50, false).setUnlocalizedName("maximtomato"); 
		lollipop= new Lollipop();
		wishstar = new WishStar().setCreativeTab(tabCustom).setUnlocalizedName("wishstar").setTextureName("kirbyandfriends:wish_star");
		 DreamBlock = new DreamBlock().setCreativeTab(tabCustom).setBlockName("DreamBlock");
		 creepyspawn = new ItemSummonCreepy().setUnlocalizedName("spawncreepy");
		hammer = new ItemHammer(ToolMaterial.WOOD).setUnlocalizedName("hammer").setCreativeTab(tabCustom).setTextureName("kirbyandfriends:hammer"); 
		 galaxia = new ItemGalaxia(ToolMaterial.GOLD); 
		 
		 GameRegistry.registerItem(creepyspawn,"spawncreeepy");
		 GameRegistry.registerItem(custommonsterplacer, "custommonsterplacer");
		 GameRegistry.registerItem(wishstar, "wishstar");
		GameRegistry.registerItem(maxim_tomato,"maxim_tomato");
		 GameRegistry.registerBlock(DreamBlock, "DreamBlock");
		 GameRegistry.registerItem(lollipop,"Lollipop");
		 GameRegistry.registerItem(hammer, "hammer");
			KirbyRecipes.addRecipes();
			 proxy.registerRenderers();
		
			
		
	}
	   @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    }
}
	
	 
