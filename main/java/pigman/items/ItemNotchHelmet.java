package pigman.items;

import pigman.PigmanMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNotchHelmet extends Item 
{
public ItemNotchHelmet()
{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
}
}
