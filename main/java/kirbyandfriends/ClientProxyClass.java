package kirbyandfriends;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ClientProxyClass extends MyCommonProxy {
	public void registerRenderInformation()
	{
		
		
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
		RenderingRegistry.addNewArmourRendererPrefix("KKArmor");
		RenderingRegistry.addNewArmourRendererPrefix("NotchArmor");
		RenderingRegistry.addNewArmourRendererPrefix("RubyArmor");
	}
	public void registerEntities(){
	}
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}
	}
