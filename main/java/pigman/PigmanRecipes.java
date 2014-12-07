package pigman;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class PigmanRecipes 
{
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(PigmanMod.KKHelmet,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	'K',PigmanMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(PigmanMod.KKChestPlate,1), new Object[]
				{
		        	"K K",
		        	"KKK",
		        	"KKK",
		        	'K',PigmanMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(PigmanMod.KKLeggings,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	"K K",
		        	'K',PigmanMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(PigmanMod.KKBoots,1), new Object[]
				{
		        	"K K",
		        	"K K",
		        	'K',PigmanMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(PigmanMod.BlockCryingObsidian), new Object[]{

            "XXX",
            "XZX",
            "XXX",
            'X', Blocks.obsidian, 'Z', new ItemStack(Items.dye, 1, 15)
     });
		GameRegistry.addRecipe(new ItemStack(PigmanMod.Beam,1), new Object[]
				{
		        	"KK",
		        	"KK",
		        	'K',Items.iron_ingot });
		GameRegistry.addShapelessRecipe(new ItemStack(PigmanMod.Ruby), new Object[]{

            new ItemStack(Items.emerald), new ItemStack(Items.dye, 1, 1)
     });

	GameRegistry.addRecipe(new ItemStack(PigmanMod.BlockRuby,1),new Object[]
	{
	"RRR",
	"RRR",
	"RRR",
	'R', PigmanMod.Ruby});
	GameRegistry.addRecipe(new ItemStack (PigmanMod.BlockKK,1),new Object[]
	{
	"KKK",
	"KKK",
	"KKK",
	'K', PigmanMod.KKShard});
	GameRegistry.addRecipe(new ItemStack(PigmanMod.RubyHelmet,1),new Object[]
	{
	"RRR",
	"R R",
	'R' , PigmanMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(PigmanMod.RubyChestPlate,1), new Object[]
	{
	"R R",
	"RRR",
	"RRR",
	'R', PigmanMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(PigmanMod.RubyLeggings,1), new Object[]
	{
	"RRR", 
	"R R",
	"R R",
	'R', PigmanMod.Ruby});
	GameRegistry.addRecipe( new ItemStack(PigmanMod.RubyBoots,1), new Object[]{
	"R R",
	"R R",
	'R', PigmanMod.Ruby});

}
}
