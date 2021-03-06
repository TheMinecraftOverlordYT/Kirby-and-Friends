package kirbyandfriends.items;

import kirbyandfriends.entities.EntityCreepy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemSummonCreepy extends Item {
	   @SideOnly(Side.CLIENT)
	    private IIcon theIcon;
        static EntityCreepy entitycreepy;
	    
        public ItemSummonCreepy()
	    {
	       // this.setHasSubtypes(true);
	       // this.setCreativeTab(CreativeTabs.tabMisc);
	    }

	   
	   
	   public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
	    {
		   
		   
	        if (world.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	        	
	        	
	            Block block = world.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
	            p_77648_4_ += Facing.offsetsXForSide[p_77648_7_];
	            p_77648_5_ += Facing.offsetsYForSide[p_77648_7_];
	            p_77648_6_ += Facing.offsetsZForSide[p_77648_7_];
	     
	            double d0 = 0.0D;

	            if (p_77648_7_ == 1 && block.getRenderType() == 11)
	            {
	                d0 = 0.5D;
	            }

	            spawnCreature(world,  (double)p_77648_4_ + 0.5D, (double)p_77648_5_ + d0, (double)p_77648_6_ + 0.5D);

	            if (entitycreepy != null)
                {
                    if (entitycreepy instanceof EntityLivingBase && itemstack.hasDisplayName())
                    {
                        ((EntityLiving)entitycreepy).setCustomNameTag(itemstack.getDisplayName());
                    }
	            
	            
	                if (!player.capabilities.isCreativeMode)
	                {
	                    --itemstack.stackSize;
	                }
	            }

	            return true;
	        }
	    }
public static void spawnCreature(World world, double x, double y, double z)
{

	entitycreepy = new EntityCreepy(world);
	entitycreepy.setLocationAndAngles(x, y, z,MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0);
	entitycreepy.onSpawnWithEgg((IEntityLivingData)null);
	world.spawnEntityInWorld(entitycreepy);
       
           /*     EntityLiving entityliving = (EntityLiving)entity;
                entity.setLocationAndAngles(p_77840_2_, p_77840_4_, p_77840_6_, MathHelper.wrapAngleTo180_float(p_77840_0_.rand.nextFloat() * 360.0F), 0.0F);
                entityliving.rotationYawHead = entityliving.rotationYaw;
                entityliving.renderYawOffset = entityliving.rotationYaw;
                entityliving.onSpawnWithEgg((IEntityLivingData)null);
                p_77840_0_.spawnEntityInWorld(entity);
                entityliving.playLivingSound();*/
                
                /*
                
                entitybrows = new EntityBrows(this.worldObj);
        		entitybrows.copyLocationAndAnglesFrom(this);
        		entitybrows.onSpawnWithEgg((IEntityLivingData)null);


        	        this.worldObj.removeEntity(this);
        	        this.worldObj.spawnEntityInWorld(entitybrows);
                */
         
	}
	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	        if (p_77659_2_.isRemote)
	        {
	            return p_77659_1_;
	        }
	        else
	        {
	            MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(p_77659_2_, p_77659_3_, true);

	            if (movingobjectposition == null)
	            {
	                return p_77659_1_;
	            }
	            else
	            {
	                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
	                {
	                    int i = movingobjectposition.blockX;
	                    int j = movingobjectposition.blockY;
	                    int k = movingobjectposition.blockZ;

	                    if (!p_77659_2_.canMineBlock(p_77659_3_, i, j, k))
	                    {
	                        return p_77659_1_;
	                    }

	                    if (!p_77659_3_.canPlayerEdit(i, j, k, movingobjectposition.sideHit, p_77659_1_))
	                    {
	                        return p_77659_1_;
	                    }

	                    if (p_77659_2_.getBlock(i, j, k) instanceof BlockLiquid)
	                    {
	                        spawnCreature(p_77659_2_, (double)i, (double)j, (double)k);

	                        if (entitycreepy != null)
	                        {
	                            if (entitycreepy instanceof EntityLivingBase && p_77659_1_.hasDisplayName())
	                            {
	                                ((EntityLiving)entitycreepy).setCustomNameTag(p_77659_1_.getDisplayName());
	                            }

	                            if (!p_77659_3_.capabilities.isCreativeMode)
	                            {
	                                --p_77659_1_.stackSize;
	                            }
	                        }
	                    }
	                }

	                return p_77659_1_;
	            }
	        }
	    }
}