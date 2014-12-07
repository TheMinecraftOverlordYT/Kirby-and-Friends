package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.item.Item;
public class Ruby extends Item 
{
	public Ruby()
	{
	super();
	setTextureName(KirbyMod.modid + ":" + "Ruby");
	setUnlocalizedName(KirbyMod.modid + "_" + "Ruby");
	this.setCreativeTab(KirbyMod.tabCustom);
}
}

