package pigman.items;
import pigman.PigmanMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class KKBoots extends Item 
{
	public KKBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setUnlocalizedName(PigmanMod.modid + "_" + "KKBoots");
	setTextureName(PigmanMod.modid + ":" + "KKBoots");
}
}
