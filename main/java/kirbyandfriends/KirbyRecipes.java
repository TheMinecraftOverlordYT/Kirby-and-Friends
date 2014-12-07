package kirbyandfriends;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class KirbyRecipes 
{
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(KirbyMod.KKHelmet,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	'K',KirbyMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(KirbyMod.KKChestPlate,1), new Object[]
				{
		        	"K K",
		        	"KKK",
		        	"KKK",
		        	'K',KirbyMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(KirbyMod.KKLeggings,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	"K K",
		        	'K',KirbyMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(KirbyMod.KKBoots,1), new Object[]
				{
		        	"K K",
		        	"K K",
		        	'K',KirbyMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(KirbyMod.BlockCryingObsidian), new Object[]{

            "XXX",
            "XZX",
            "XXX",
            'X', Blocks.obsidian, 'Z', new ItemStack(Items.dye, 1, 15)
     });
		GameRegistry.addRecipe(new ItemStack(KirbyMod.Beam,1), new Object[]
				{
		        	"KK",
		        	"KK",
		        	'K',Items.iron_ingot });
		GameRegistry.addShapelessRecipe(new ItemStack(KirbyMod.Ruby), new Object[]{

            new ItemStack(Items.emerald), new ItemStack(Items.dye, 1, 1)
     });

	GameRegistry.addRecipe(new ItemStack(KirbyMod.BlockRuby,1),new Object[]
	{
	"RRR",
	"RRR",
	"RRR",
	'R', KirbyMod.Ruby});
	GameRegistry.addRecipe(new ItemStack (KirbyMod.BlockKK,1),new Object[]
	{
	"KKK",
	"KKK",
	"KKK",
	'K', KirbyMod.KKShard});
	GameRegistry.addRecipe(new ItemStack(KirbyMod.RubyHelmet,1),new Object[]
	{
	"RRR",
	"R R",
	'R' , KirbyMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(KirbyMod.RubyChestPlate,1), new Object[]
	{
	"R R",
	"RRR",
	"RRR",
	'R', KirbyMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(KirbyMod.RubyLeggings,1), new Object[]
	{
	"RRR", 
	"R R",
	"R R",
	'R', KirbyMod.Ruby});
	GameRegistry.addRecipe( new ItemStack(KirbyMod.RubyBoots,1), new Object[]{
	"R R",
	"R R",
	'R', KirbyMod.Ruby});

}
}
