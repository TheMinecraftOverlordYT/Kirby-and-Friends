package kirbyandfriends.blocks;
import kirbyandfriends.KirbyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKK extends Block 
{
	public BlockKK()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(KirbyMod.tabCustom); 
		 setBlockName(KirbyMod.modid + "_" + "KKBlock"); 
		 setBlockTextureName(KirbyMod.modid + ":" + "KKBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
	
}
