package pigman.blocks;
import pigman.PigmanMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block 
{
	public BlockRuby()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(PigmanMod.tabCustom); 
		 setBlockName(PigmanMod.modid + "_" + "RubyBlock"); 
		 setBlockTextureName(PigmanMod.modid + ":" + "RubyBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
}
