package kirbyandfriends.keys;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import kirbyandfriends.entities.EntityThrownWishStar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class KeyHandler
{
/** Key index for easy handling */
public static final int CUSTOM_INV = 0;
/** Key descriptions; use a language file to localize the description later */
private static final String[] desc = {"key.tut_inventory.desc"};
/** Default key values */
private static final int[] keyValues = {Keyboard.KEY_P};
private final KeyBinding[] keys;

static World world; 
static Random random;
static EntityPlayer player = Minecraft.getMinecraft().thePlayer; 

public KeyHandler() {
keys = new KeyBinding[desc.length];
for (int i = 0; i < desc.length; ++i) {
keys[i] = new KeyBinding(desc[i], keyValues[i], "key.tutorial.category");
ClientRegistry.registerKeyBinding(keys[i]);
}
}
/**
* KeyInputEvent is in the FML package, so we must register to the FML event bus
*/
@SubscribeEvent
public void onKeyInput(KeyInputEvent event) {
// FMLClientHandler.instance().getClient().inGameHasFocus
if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
if (keys[CUSTOM_INV].isPressed()) {
	EntityThrownWishStar entitylaser = new EntityThrownWishStar(world);
    double d0 = player.posX ;
    double d1 = player.posY + (double)player.getEyeHeight() - 1.100000023841858D - entitylaser.posY;
    double d2 = player.posZ;
    float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
    entitylaser.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
    player.playSound("random.bow", 1.0F, 1.0F / (random).nextFloat() * 0.4F + 0.8F);
    world.spawnEntityInWorld(entitylaser);
	
		}

}
}

}