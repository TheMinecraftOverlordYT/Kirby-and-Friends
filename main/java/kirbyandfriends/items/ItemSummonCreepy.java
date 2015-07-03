package kirbyandfriends.items;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kirbyandfriends.entities.EntityBlipper;
import kirbyandfriends.entities.EntityCreepy;
import kirbyandfriends.entities.EntityDedede;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.EntityWaddleDee;
import kirbyandfriends.entities.EntityWispy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSummonCreepy extends Item {
	   @SideOnly(Side.CLIENT)
        static EntityCreepy entitycreepy;
	    
        public ItemSummonCreepy()
	    {
	       // this.setHasSubtypes(true);
	       // this.setCreativeTab(CreativeTabs.tabMisc);
	    }

	   
	   
	   public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
		   
		   
	        if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	        	
	        	
	        	IBlockState iblockstate = worldIn.getBlockState(pos);
	           // p_77648_4_ += Facing.offsetsXForSide[p_77648_7_];
	           // p_77648_5_ += Facing.offsetsYForSide[p_77648_7_];
	           // p_77648_6_ += Facing.offsetsZForSide[p_77648_7_];
	     
	            pos = pos.offset(side);
	            
	            double d0 = 0.0D;
	            if (side == EnumFacing.UP && iblockstate instanceof BlockFence)
	            {
	                d0 = 0.5D;
	            }

	            spawnCreature(worldIn,  (double)pos.getX() + 0.5D, (double)pos.getY() + d0, (double)pos.getZ() + 0.5D);

	            if (entitycreepy != null)
                {
                    if (entitycreepy instanceof EntityLivingBase && stack.hasDisplayName())
                    {
                        ((EntityLiving)entitycreepy).setCustomNameTag(stack.getDisplayName());
                    }
	            
	            
	                if (!playerIn.capabilities.isCreativeMode)
	                {
	                    --stack.stackSize;
	                }
	            }

	            return true;
	        }
	    }
public static void spawnCreature(World world, double x, double y, double z)
{

	entitycreepy = new EntityCreepy(world);
	entitycreepy.setLocationAndAngles(x, y, z,MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0);
	  entitycreepy.func_180482_a(world.getDifficultyForLocation(new BlockPos(entitycreepy)), (IEntityLivingData)null);
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
	    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        if (world.isRemote)
	        {
	            return itemstack;
	        }
	        else
	        {
	            MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, true);

	            if (movingobjectposition == null)
	            {
	                return itemstack;
	            }
	            else
	            {
	                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
	                {
	                	BlockPos blockpos = movingobjectposition.getBlockPos();
	                	
	                    if (!world.isBlockModifiable(player, blockpos))
	                    {
	                        return itemstack;
	                    }

	                    if (!player.canPlayerEdit(blockpos, movingobjectposition.sideHit, itemstack))
	                    {
	                        return itemstack;
	                    }

	                    if (world.getBlockState(blockpos).getBlock() instanceof BlockLiquid)
	                    {
	                        spawnCreature(world, (double)blockpos.getX(), (double)blockpos.getY(), (double)blockpos.getZ());

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
	                    }
	                }

	                return itemstack;
	            }
	        }
	    }
}