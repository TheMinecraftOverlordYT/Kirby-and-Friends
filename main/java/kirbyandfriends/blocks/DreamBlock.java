package kirbyandfriends.blocks;

import kirbyandfriends.KirbyMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class DreamBlock extends Block {
	public DreamBlock()
	 {              
		 super(Material.rock);              
		 this.setCreativeTab(KirbyMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 } 
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon otherIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon frontIcon;

	@SideOnly(Side.CLIENT) 
	public void registerBlockIcons(IIconRegister IIconRegister) {
	otherIcon = IIconRegister.registerIcon(KirbyMod.modid + ":" + "DreamBlock");
	frontIcon = IIconRegister.registerIcon(KirbyMod.modid + ":" + "DreamBlock_Front");
	}
@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata) {
if(side==3){
	return frontIcon;
} else {
return otherIcon;
}
}
}
