package kirbyandfriends.items;

import kirbyandfriends.KirbyMod;
import net.minecraft.item.ItemFood;

public class Lollipop extends ItemFood{

	
	public Lollipop(){
		

	super(1,true);
this.setCreativeTab(KirbyMod.tabCustom);
this.setAlwaysEdible();
this.setUnlocalizedName("Lollipop");
this.setTextureName(KirbyMod.modid + ":Lollipop");
<<<<<<< HEAD
this.setPotionEffect(14,10,100,1.0f);
=======
this.setPotionEffect(14,1,100,1.0f);
>>>>>>> origin/master
	}
}
