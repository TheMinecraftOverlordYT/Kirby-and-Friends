package pigman.items;
import pigman.PigmanMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyChestPlate extends Item 
{
	public RubyChestPlate()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(PigmanMod.modid + ":" + "RubyChestPlate");
	setUnlocalizedName(PigmanMod.modid + "_" + "RubyChestPlate");
}
}
