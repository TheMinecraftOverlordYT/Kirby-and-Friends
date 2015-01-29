package kirbyandfriends;
import kirbyandfriends.entities.*;
import kirbyandfriends.items.CustomEntityList;
import kirbyandfriends.items.CustomMonsterPlacer;
import kirbyandfriends.render.RenderCreepy;
import kirbyandfriends.render.RenderKirbyPaletteA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=KirbyMod.modid,name = "Kirby and Friends",version = "0.4")

public class KirbyMod {
	@SidedProxy(clientSide="kirbyandfriends.ClientProxyClass", serverSide="kirbyandfriends.MyCommonProxy")
	public static MyCommonProxy proxy;
	public static final String modid = "kirbyandfriends"; 
	public int NotchSpawnRate;
	public int KirbySpawnRate;
	public int CreepyKirbySpawnRate;
	 public static Item custommonsterplacer;

	
	

	public static CreativeTabs tabCustom = new CreativeTabs("Pigman") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return (Items.apple);
	    }
	};
	
	@EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
		  Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		  
		  config.load();
	     KirbySpawnRate = config.get("Options", "Kirby spawn rate", 10).getInt();
	     CreepyKirbySpawnRate= config.get("Options", "Kirby spawn rate", 10).getInt();
		  config.save();
		 
		  RenderingRegistry.registerEntityRenderingHandler(EntityKirby.class, new RenderKirbyPaletteA(new ModelKirby(), 0.3F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityCreepy.class, new RenderCreepy(new ModelCreepyKirby(), 0.3F));
		 
		 

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
		
		
			
		EntityRegistry.registerModEntity(EntityKirby.class, "Kirby", ++entityid, this, 43, 3, true);
		EntityRegistry.registerModEntity(EntityCreepy.class, "Creepy Kirby", ++entityid, this, 43, 3, true);
		 EntityRegistry.addSpawn(EntityKirby.class, 15, KirbySpawnRate, 4, EnumCreatureType.ambient, BiomeGenBase.plains);
		 EntityRegistry.addSpawn(EntityCreepy.class, 10, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
		 custommonsterplacer = new CustomMonsterPlacer().setUnlocalizedName("custommonsterplacer").setTextureName("kirbyandfriends:custommonsterplacer").setCreativeTab(tabCustom);
		 GameRegistry.registerItem(custommonsterplacer, "custommonsterplacer");
			
			KirbyRecipes.addRecipes();
			 proxy.registerRenderers();
		
	}
	   @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    }
}
	
	 