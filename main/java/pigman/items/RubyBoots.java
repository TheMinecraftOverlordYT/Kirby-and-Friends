package pigman.items;
import pigman.PigmanMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyBoots extends Item 
{
	public RubyBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(PigmanMod.modid + ":" + "RubyBoots");
	setUnlocalizedName(PigmanMod.modid + "_" + "RubyBoots");
}
}
