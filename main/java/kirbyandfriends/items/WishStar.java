package kirbyandfriends.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WishStar extends Item {
	

	@SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack itemstack)
	    {
	        return true;
	    }
}
