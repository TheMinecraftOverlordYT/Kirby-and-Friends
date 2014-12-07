package pigman.blocks;

import pigman.PigmanMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Beam extends Block 
{
	public Beam()
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(PigmanMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeMetal);
		 } 
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister IIconRegister) {
	topIcon = IIconRegister.registerIcon(PigmanMod.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
	bottomIcon = IIconRegister.registerIcon(PigmanMod.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_bottom");
	sideIcon = IIconRegister.registerIcon(PigmanMod.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side");
	}
@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata) {
if(side == 0) {
return bottomIcon;
} else if(side == 1) {
return topIcon;
} else {
return sideIcon;
}
}
}