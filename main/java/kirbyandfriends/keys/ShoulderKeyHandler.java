package kirbyandfriends.keys;

import java.util.EnumSet;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.gameevent.TickEvent.Type;
import kirbyandfriends.entities.EntityThrownWishStar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class ShoulderKeyHandler{	
	public ShoulderKeyHandler(KeyBinding[] keyBindings, boolean[] repeatings) {
		super();
	}
static World world; 
static Random random;
	public String getLabel() {
		return "Kirby";
	}
static EntityPlayer player; 
	public void keyDown(EnumSet<Type> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		/* minecraft ought to be running and with no gui up */
		if(Minecraft.getMinecraft() != null && Minecraft.getMinecraft().currentScreen == null){
			if(world.isRemote){
				if(kb == Keybinding.KEYBIND_LAUNCH_PROJECTILE){
				EntityThrownWishStar entitylaser = new EntityThrownWishStar(world);
		        double d0 = player.posX;
		        double d1 = player.posY + (double)player.getEyeHeight() - 1.100000023841858D - entitylaser.posY;
		        double d2 = player.posZ;
		        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
		        entitylaser.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
		        player.playSound("random.bow", 1.0F, 1.0F / (random.nextFloat() * 0.4F + 0.8F));
		        world.spawnEntityInWorld(entitylaser);
				}
			// Somewhere around here I think we spawn our projectile I believe and set the heading of it.
				//We would also have to check to see what the Player model is as well. I recommend holding that in a field. 
			
/*			if (ShoulderLoader.mc.gameSettings.thirdPersonView == 1){
				if(kb == ShoulderKeybindings.KEYBIND_ROTATE_CAMERA_LEFT){
					ShoulderCamera.adjustCameraLeft();
				}
				else if(kb == ShoulderKeybindings.KEYBIND_ROTATE_CAMERA_RIGHT){
					ShoulderCamera.adjustCameraRight();
				}
				else if(kb == ShoulderKeybindings.KEYBIND_ZOOM_CAMERA_IN){
					ShoulderCamera.adjustCameraIn();
				}
				else if(kb == ShoulderKeybindings.KEYBIND_ZOOM_CAMERA_OUT){
					ShoulderCamera.adjustCameraOut();
				}*/
				
				//SmashMod.writeConfig();
			}
		}
	}

	public void keyUp(EnumSet<Type> types, KeyBinding kb, boolean tickEnd) {
		//do nothing
	}

	public EnumSet<Type> ticks() {
		/**
		 * Allows keybind events to be listened by the client
		 */
		return EnumSet.of(Type.CLIENT);
	}
}
