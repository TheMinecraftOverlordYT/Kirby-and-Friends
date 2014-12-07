package pigman.items;

import pigman.PigmanMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class KKArmor extends ItemArmor {
	public KKArmor(ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par2EnumArmorMaterial, par3, par4);
			par2EnumArmorMaterial.getDamageReductionAmount(par4);
			this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
			this.maxStackSize = 1;
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
			public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem() == PigmanMod.KKHelmet
			|| stack.getItem() == PigmanMod.KKChestPlate
			|| stack.getItem() == PigmanMod.KKBoots) {
			return "pigman:textures/armor/KK_1.png";
			}
			if (stack.getItem() == PigmanMod.KKLeggings) {
			return "pigman:textures/armor/KK_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == PigmanMod.KKChestPlate) {
				this.itemIcon = reg.registerIcon("pigman:KKChestPlate");
				}

				if (this == PigmanMod.KKLeggings) {
				this.itemIcon = reg.registerIcon("pigman:KKLeggings"); 
				}

				if (this == PigmanMod.KKBoots) {
				this.itemIcon = reg.registerIcon("pigman:KKBoots"); 
				}

				if (this == PigmanMod.KKHelmet) {
				this.itemIcon = reg.registerIcon("pigman:KKHelmet"); 
				}
			}
			}
