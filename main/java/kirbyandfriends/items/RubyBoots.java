package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyBoots extends Item 
{
	public RubyBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(KirbyMod.modid + ":" + "RubyBoots");
	setUnlocalizedName(KirbyMod.modid + "_" + "RubyBoots");
}
}
