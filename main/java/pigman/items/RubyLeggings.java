package pigman.items;
import pigman.PigmanMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyLeggings extends Item 
{
	public RubyLeggings()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(PigmanMod.modid + ":" + "RubyLeggings");
	setUnlocalizedName(PigmanMod.modid + "_" + "RubyLeggings");
}
}
