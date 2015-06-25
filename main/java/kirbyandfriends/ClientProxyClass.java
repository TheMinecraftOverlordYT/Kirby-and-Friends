package kirbyandfriends;

import kirbyandfriends.entities.EntityBlipper;
import kirbyandfriends.entities.EntityCreepy;
import kirbyandfriends.entities.EntityDedede;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.EntityThrownApple;
import kirbyandfriends.entities.EntityThrownEmerald;
import kirbyandfriends.entities.EntityWaddleDee;
import kirbyandfriends.entities.EntityWaddleDoo;
import kirbyandfriends.entities.EntityWispy;
import kirbyandfriends.entities.ModelBlipper;
import kirbyandfriends.entities.ModelDedede;
import kirbyandfriends.entities.ModelKirby;
import kirbyandfriends.entities.ModelWaddleDee;
import kirbyandfriends.entities.ModelWispy;
import kirbyandfriends.render.RenderBlipper;
import kirbyandfriends.render.RenderCreepy;
import kirbyandfriends.render.RenderDedede;
import kirbyandfriends.render.RenderKirbyPaletteA;
import kirbyandfriends.render.RenderWaddleDee;
import kirbyandfriends.render.RenderWispy;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxyClass extends MyCommonProxy {
	
/*	public ClientProxyClassClient()
	{
	}

	@Override
	public void load()
	{		
		super.load();
				
		// Setup renderers
		//Billund.Blocks.billund.blockRenderID = RenderingRegistry.getNextAvailableRenderId();
				
		// Setup client forge handlers
		registerRenderInformation(); 
	}
	
	@Override
	public boolean isClient()
	{
		return true;
	}

	@Override
	public void openOrderFormGUI( EntityPlayer player )
	{
	    GuiScreen gui = new GuiOrderForm( player );
	    FMLClientHandler.instance().displayGuiScreen( player, gui );
	}
		
	private void registerForgeHandlers()
	{
		//ForgeHandlers handlers = new ForgeHandlers();
		//MinecraftForge.EVENT_BUS.register( handlers );
		//TickRegistry.registerTickHandler( handlers, Side.CLIENT );
		
		//BillundBlockRenderingHandler billundHandler = new BillundBlockRenderingHandler();
		//RenderingRegistry.registerBlockHandler( billundHandler );
		
		//BrickRenderer brickHandler = new BrickRenderer();
		//MinecraftForgeClient.registerItemRenderer( Billund.ModItems.brick, brickHandler );
*/
	//}
	
	
	
	
	
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityThrownApple.class, new RenderSnowball(Items.apple));
	RenderingRegistry.registerEntityRenderingHandler(EntityThrownEmerald.class, new RenderSnowball(Items.emerald));
	  RenderingRegistry.registerEntityRenderingHandler(EntityKirby.class, new RenderKirbyPaletteA(new ModelKirby(), 0.3F));
	  RenderingRegistry.registerEntityRenderingHandler(EntityCreepy.class, new RenderCreepy(new ModelWaddleDee(), 0.3F));
	  RenderingRegistry.registerEntityRenderingHandler(EntityBlipper.class, new RenderBlipper(new ModelBlipper(), 0.3F));
	  RenderingRegistry.registerEntityRenderingHandler(EntityDedede.class, new RenderDedede(new ModelDedede(), 0.3F));
	  RenderingRegistry.registerEntityRenderingHandler(EntityWaddleDee.class, new RenderWaddleDee(new ModelWaddleDee(), 0.3F));
	  RenderingRegistry.registerEntityRenderingHandler(EntityWispy.class, new RenderWispy(new ModelWispy(), 0.3F));
      RenderingRegistry.registerEntityRenderingHandler(EntityWaddleDoo.class, new RenderWaddleDee(new ModelWaddleDee(), 0.3F));
	}
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
	public void registerTiles(){
		
	}
	public void registerBlocks(){
		
	}
	public void registerItems(){	
		
	}
	public void registerArmor(){
	}
	public void registerEntities(){
	}
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}
	


	
	}
