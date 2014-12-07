package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyLeggings extends Item 
{
	public RubyLeggings()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(KirbyMod.modid + ":" + "RubyLeggings");
	setUnlocalizedName(KirbyMod.modid + "_" + "RubyLeggings");
}
}
