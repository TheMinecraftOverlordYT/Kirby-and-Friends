package kirbyandfriends;
import kirbyandfriends.entities.*;
import kirbyandfriends.render.RenderKirbyPaletteA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=KirbyMod.modid,name = "Kirby and Friends",version = "0.4")

public class KirbyMod {
	@SidedProxy(clientSide="kirbyandfriends.ClientProxyClass", serverSide="kirbyandfriends.MyCommonProxy")
	public static MyCommonProxy proxy;
	public static final String modid = "kirbyandfriends"; 
	public int NotchSpawnRate;
	public int KirbySpawnRate;

	
	

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
		  config.save();
		 
		  RenderingRegistry.registerEntityRenderingHandler(EntityKirby.class, new RenderKirbyPaletteA(new ModelKirby(), 0.3F));
		  
		 
		 

	 }
	@EventHandler

	public void load(FMLInitializationEvent event)
	{
		int entityid= 0;
		
	
		EntityRegistry.registerModEntity(EntityKirby.class, "Kirby", ++entityid, this, 43, 3, true);

      
	        EntityList.addMapping(EntityKirby.class, "Kirby", 401,15771042 , 14377823);
	
		
		 EntityRegistry.addSpawn(EntityKirby.class, 15, KirbySpawnRate, 4, EnumCreatureType.ambient, BiomeGenBase.plains);

			
	
			
			KirbyRecipes.addRecipes();
			 proxy.registerRenderers();
		
	}
	   @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    }
}
	
	 