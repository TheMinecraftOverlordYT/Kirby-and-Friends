package kirbyandfriends;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class KirbyRecipes 
{
	
	static ItemStack spawnstack = new ItemStack(KirbyMod.custommonsterplacer,1,401);
	
	public static void addRecipes()
	{
		
GameRegistry.addSmelting(spawnstack, new ItemStack( KirbyMod.creepyspawn), 0);
	
}

}