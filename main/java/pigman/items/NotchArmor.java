package pigman.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import pigman.PigmanMod;

public class NotchArmor extends ItemArmor {
	public NotchArmor(ArmorMaterial par2EnumArmorMaterial,
			int par4, String name) {
			super(par2EnumArmorMaterial,0, par4);
			this.maxStackSize = 1;
			setUnlocalizedName(name);
			setTextureName(PigmanMod.modid + ":" + getUnlocalizedName().substring(5));
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem()== PigmanMod.NotchHelmet) 
			{
			return "pigman:textures/armor/NotchMask_1.png";
			}
			else {
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == PigmanMod.NotchHelmet) {
				this.itemIcon = reg.registerIcon("pigman:NotchHelmet"); 
				}


			}
			}
