package kirbyandfriends.items;

import kirbyandfriends.KirbyMod;
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
			if (stack.getItem() == KirbyMod.KKHelmet
			|| stack.getItem() == KirbyMod.KKChestPlate
			|| stack.getItem() == KirbyMod.KKBoots) {
			return "kirbyandfriends:textures/armor/KK_1.png";
			}
			if (stack.getItem() == KirbyMod.KKLeggings) {
			return "kirbyandfriends:textures/armor/KK_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == KirbyMod.KKChestPlate) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKChestPlate");
				}

				if (this == KirbyMod.KKLeggings) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKLeggings"); 
				}

				if (this == KirbyMod.KKBoots) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKBoots"); 
				}

				if (this == KirbyMod.KKHelmet) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKHelmet"); 
				}
			}
			}
