package kirbyandfriends.items;

import kirbyandfriends.KirbyMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor {
	public RubyArmor(ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par2EnumArmorMaterial, par3, par4);
			par2EnumArmorMaterial.getDamageReductionAmount(par4);
			this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
			this.maxStackSize = 1;
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
			public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem() == KirbyMod.RubyHelmet
			|| stack.getItem() == KirbyMod.RubyChestPlate
			|| stack.getItem() == KirbyMod.RubyBoots) {
			return "kirbyandfriends:textures/armor/RubyArmor_1.png";
			}
			if (stack.getItem() == KirbyMod.RubyLeggings) {
			return "kirbyandfriends:textures/armor/RubyArmor_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == KirbyMod.RubyChestPlate) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:RubyChestPlate");
				}

				if (this == KirbyMod.RubyLeggings) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:RubyLeggings"); 
				}

				if (this == KirbyMod.RubyBoots) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:RubyBoots"); 
				}

				if (this == KirbyMod.RubyHelmet) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:RubyHelmet"); 
				}
			}
			}

