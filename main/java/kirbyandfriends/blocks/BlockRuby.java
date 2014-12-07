package kirbyandfriends.blocks;
import kirbyandfriends.KirbyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block 
{
	public BlockRuby()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(KirbyMod.tabCustom); 
		 setBlockName(KirbyMod.modid + "_" + "RubyBlock"); 
		 setBlockTextureName(KirbyMod.modid + ":" + "RubyBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
}
