package pigman.items;
import pigman.PigmanMod;
import net.minecraft.item.Item;
public class Ruby extends Item 
{
	public Ruby()
	{
	super();
	setTextureName(PigmanMod.modid + ":" + "Ruby");
	setUnlocalizedName(PigmanMod.modid + "_" + "Ruby");
	this.setCreativeTab(PigmanMod.tabCustom);
}
}

