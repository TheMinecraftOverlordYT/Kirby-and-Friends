package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyChestPlate extends Item 
{
	public RubyChestPlate()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(KirbyMod.modid + ":" + "RubyChestPlate");
	setUnlocalizedName(KirbyMod.modid + "_" + "RubyChestPlate");
}
}
