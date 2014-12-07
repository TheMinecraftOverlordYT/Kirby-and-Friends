package kirbyandfriends.blocks;
import kirbyandfriends.KirbyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCryingObsidian extends Block 
{
	public BlockCryingObsidian()    
	 {              
		 super(Material.rock);           
		 setBlockName(KirbyMod.modid + "_" + "CryingObsidian"); 
		 setBlockTextureName(KirbyMod.modid + ":" + "CryingObsidian");
		 this.setCreativeTab(KirbyMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
	
}