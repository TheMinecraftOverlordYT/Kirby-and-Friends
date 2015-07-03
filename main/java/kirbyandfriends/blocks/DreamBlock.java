package kirbyandfriends.blocks;

import kirbyandfriends.KirbyMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		// no need to figure out the right orientation again when the piston block can do it for us
		
		int direction = BlockPistonBase.determineOrientation(worldIn,pos.getX(),pos.getY(), pos.getZ(), placer);
		worldIn.setBlockMetadataWithNotify(pos.getX(), pos.getY(), pos.getZ(), direction, 2);
	}

/*	@SideOnly(Side.CLIENT)
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
}*/
}



