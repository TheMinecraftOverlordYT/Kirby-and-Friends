package kirbyandfriends.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WishStar extends Item {
	

	@SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack itemstack)
	    {
	        return true;
	    }
}
