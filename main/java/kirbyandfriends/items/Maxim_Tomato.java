package kirbyandfriends.items;

import kirbyandfriends.KirbyMod;
import net.minecraft.item.ItemFood;

public class Maxim_Tomato extends ItemFood {

	public Maxim_Tomato(int p_i45340_1_, boolean p_i45340_2_) {
		super(p_i45340_1_, p_i45340_2_);
		setCreativeTab(KirbyMod.tabCustom);
		this.setAlwaysEdible();
		this.setPotionEffect(6,1,100,1.0f);
		//this.setTextureName(KirbyMod.modid + ":maxim tomato" );
		/*    *//**
		     * returns the action that specifies what animation to play when the items is being used
		     *//*
		    EnumAction getItemUseAction(ItemStack p_77661_1_)
		    {
		        return EnumAction.eat;
		    }
		*/
		
		
	}

}
