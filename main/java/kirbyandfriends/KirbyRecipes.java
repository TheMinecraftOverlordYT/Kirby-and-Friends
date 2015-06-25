package kirbyandfriends;

import kirbyandfriends.items.CustomMonsterPlacer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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