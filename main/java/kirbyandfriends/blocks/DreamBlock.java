package kirbyandfriends.blocks;

import kirbyandfriends.KirbyMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DreamBlock extends Block
{
	public DreamBlock()
	 {              
		 super(Material.rock);              
		 this.setCreativeTab(KirbyMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 } 
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	public IIcon frontIcon;

	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		// no need to figure out the right orientation again when the piston block can do it for us
		int direction = BlockPistonBase.determineOrientation(world, x, y, z, entity);
		world.setBlockMetadataWithNotify(x, y, z, direction, 2);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return (side == world.getBlockMetadata(x, y, z)) ? this.frontIcon : this.blockIcon;
	}
	
	
		

	
	
	
	@SideOnly(Side.CLIENT) 
	public void registerBlockIcons(IIconRegister IIconRegister) {
	blockIcon = IIconRegister.registerIcon(KirbyMod.modid + ":" + "DreamBlock");
	frontIcon = IIconRegister.registerIcon(KirbyMod.modid + ":" + "DreamBlock_Front");
	}
@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata) {
if(side==3){
	return frontIcon;
} else {
return blockIcon;
}
}





}
