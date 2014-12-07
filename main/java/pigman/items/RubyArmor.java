package pigman.items;

import pigman.PigmanMod;
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
			if (stack.getItem() == PigmanMod.RubyHelmet
			|| stack.getItem() == PigmanMod.RubyChestPlate
			|| stack.getItem() == PigmanMod.RubyBoots) {
			return "pigman:textures/armor/RubyArmor_1.png";
			}
			if (stack.getItem() == PigmanMod.RubyLeggings) {
			return "pigman:textures/armor/RubyArmor_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == PigmanMod.RubyChestPlate) {
				this.itemIcon = reg.registerIcon("pigman:RubyChestPlate");
				}

				if (this == PigmanMod.RubyLeggings) {
				this.itemIcon = reg.registerIcon("pigman:RubyLeggings"); 
				}

				if (this == PigmanMod.RubyBoots) {
				this.itemIcon = reg.registerIcon("pigman:RubyBoots"); 
				}

				if (this == PigmanMod.RubyHelmet) {
				this.itemIcon = reg.registerIcon("pigman:RubyHelmet"); 
				}
			}
			}

