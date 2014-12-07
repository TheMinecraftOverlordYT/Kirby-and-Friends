package pigman.items;
import pigman.PigmanMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
public class KKShard extends Item 
{
	public KKShard()
	{
	super();
	this.setCreativeTab(PigmanMod.tabCustom);
}
@SideOnly(Side.CLIENT) 
public void registerIcons(IIconRegister par1IconRegister)
{
    this.itemIcon = par1IconRegister.registerIcon(PigmanMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
}
}
