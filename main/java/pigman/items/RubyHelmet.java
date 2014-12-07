package pigman.items;
import pigman.PigmanMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyHelmet extends Item 
{
	public RubyHelmet()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(PigmanMod.modid + ":" + "RubyHelmet");
	setUnlocalizedName(PigmanMod.modid + "_" + "RubyHelmet");
}
}
