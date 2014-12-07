package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyHelmet extends Item 
{
	public RubyHelmet()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(KirbyMod.modid + ":" + "RubyHelmet");
	setUnlocalizedName(KirbyMod.modid + "_" + "RubyHelmet");
}
}
