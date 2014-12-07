package pigman.blocks;
import pigman.PigmanMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCryingObsidian extends Block 
{
	public BlockCryingObsidian()    
	 {              
		 super(Material.rock);           
		 setBlockName(PigmanMod.modid + "_" + "CryingObsidian"); 
		 setBlockTextureName(PigmanMod.modid + ":" + "CryingObsidian");
		 this.setCreativeTab(PigmanMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
	
}