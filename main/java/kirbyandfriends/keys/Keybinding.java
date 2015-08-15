package kirbyandfriends.keys;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;
import cpw.mods.fml.common.FMLCommonHandler;

/**
 * @author      Joshua Powers <jsh.powers@yahoo.com>
 * @version     1.0
 * @since       2012-12-27
 */
public class Keybinding {
	/**
	 * Minecraft keybindings for camera functions
	 */
	public static final KeyBinding KEYBIND_LAUNCH_PROJECTILE  = new KeyBinding("Camera adj left"    , Keyboard.KEY_J, "key.categories.shouldersurfing");
	
	private static KeyBinding[] keyBindings = {
			KEYBIND_LAUNCH_PROJECTILE, 
	}; 
	/**
	 * Whether or not each keybinding repeats
	 */
	private static boolean[] isKeyBindingRepeat = {
			true};
	
	/**
	 * Registers the ShoulderSurfing keybindings with minecraft.
	 * Should only be called once!
	 * 
	 * @return Returns a {@link ShoulderKeyHandler} 
	 */
	public static ShoulderKeyHandler registerKeybindings(){
		ShoulderKeyHandler skh = new ShoulderKeyHandler(keyBindings, isKeyBindingRepeat);
		FMLCommonHandler.instance().bus().register(skh);
		return skh;
	}
}
