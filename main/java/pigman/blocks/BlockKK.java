package pigman.blocks;
import pigman.PigmanMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKK extends Block 
{
	public BlockKK()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(PigmanMod.tabCustom); 
		 setBlockName(PigmanMod.modid + "_" + "KKBlock"); 
		 setBlockTextureName(PigmanMod.modid + ":" + "KKBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
	
}
