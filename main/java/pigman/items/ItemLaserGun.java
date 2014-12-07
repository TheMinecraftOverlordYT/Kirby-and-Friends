package pigman.items;

import pigman.PigmanMod;
import pigman.entities.EntityLaser;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemLaserGun extends Item {
	@SideOnly(Side.CLIENT) 
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(PigmanMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	public ItemLaserGun()
	{
	super();
	this.setCreativeTab(PigmanMod.tabCustom);
	setMaxStackSize(18);
}
	 public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	    {
	        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

	        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

	        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

	        if (flag || par3EntityPlayer.inventory.hasItem(Items.arrow))
	        {
	            float f = (float)j / 20.0F;
	            f = (f * f + f * 2.0F) / 3.0F;

	            if ((double)f < 0.1D)
	            {
	                return;
	            }

	            if (f > 1.0F)
	            {
	                f = 1.0F;
	            }

	            EntityLaser entitylaser = new EntityLaser(par2World, par3EntityPlayer, f * 2.0F);

	            if (f == 1.0F)
	            {
	                entitylaser.setIsCritical(true);
	            }

	            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

	            if (k > 0)
	            {
	                entitylaser.setDamage(entitylaser.getDamage() + (double)k * 0.5D + 0.5D);
	            }

	            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

	            if (l > 0)
	            {
	                entitylaser.setKnockbackStrength(l);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
	            {
	                entitylaser.setFire(100);
	            }

	            par1ItemStack.damageItem(1, par3EntityPlayer);
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	            if (flag)
	            {
	                entitylaser.canBePickedUp = 2;
	            }
	            else
	            {
	                par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow);
	            }

	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(entitylaser);
	            }
	        }
	    }
	
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Items.arrow))
	        {
	            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        }

	        return par1ItemStack;
	    }
	 
	 {

		
		}
}
