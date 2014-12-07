package kirbyandfriends.items;
import kirbyandfriends.KirbyMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class KKBoots extends Item 
{
	public KKBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setUnlocalizedName(KirbyMod.modid + "_" + "KKBoots");
	setTextureName(KirbyMod.modid + ":" + "KKBoots");
}
}
