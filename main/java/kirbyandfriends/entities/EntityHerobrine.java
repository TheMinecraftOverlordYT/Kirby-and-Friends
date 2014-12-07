package kirbyandfriends.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityHerobrine extends EntityMob
{

            public EntityHerobrine(World par1World)
            {
				super(par1World);		
                this.tasks.addTask(0, new EntityAISwimming(this));
                this.tasks.addTask(1, new EntityAIBreakDoor(this));
                this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityHuman.class, 1.0D, true));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPigman.class, 1.0D, true));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityNotch.class, 1.0D, true));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityKillerKirby.class, 1.0D, true));
                this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
                this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
                this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
                this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8F));
                this.tasks.addTask(7, new EntityAILookIdle(this));
                this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHuman.class, 0, false));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPigman.class, 0, false));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityNotch.class, 0, false));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKillerKirby.class, 0, false));
            }
    
            {
                this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(120.0D);
                this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2D);
                }


            protected boolean IsAIEnabled()
            {
				return true;
            }

            public void onLivingUpdate()
            {
                if (this.worldObj.isDaytime() && !this.worldObj.isRemote && !this.isChild())
                {
                    float f = this.getBrightness(1.0F);

                    if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
                    {
                        boolean flag = true;
                        ItemStack itemstack = this.getEquipmentInSlot(4);

                        if (itemstack != null)
                        {
                            if (itemstack.isItemStackDamageable())
                            {
                                itemstack.setItemDamage(itemstack.getItemDamageForDisplay() + this.rand.nextInt(2));

                                if (itemstack.getItemDamageForDisplay() >= itemstack.getMaxDamage())
                                {
                                    this.renderBrokenItemStack(itemstack);
                                    this.setCurrentItemOrArmor(4, (ItemStack)null);
                                }
                            }

                            flag = false;
                        }

                        if (flag)
                        {
                            this.setFire(8);
                        }
                    }
                }

                super.onLivingUpdate();
            }
            public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
            {
                if (!super.attackEntityFrom(par1DamageSource, par2))
                {
                    return false;
                }
                else
                {
                    EntityLivingBase entitylivingbase = this.getAttackTarget();

                    if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase)
                    {
                        entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
                    }

                    if (entitylivingbase == null && par1DamageSource.getEntity() instanceof EntityLivingBase)
                    {
                        entitylivingbase = (EntityLivingBase)par1DamageSource.getEntity();
                    }

                    MathHelper.floor_double(this.posX);
                    MathHelper.floor_double(this.posY);
                    MathHelper.floor_double(this.posZ);
                    return true;
                    }
                }

            protected String getLivingSound()
            {
				return "random.hurt";
            }

            protected String getDeathSound()
            {
            	return "damage.hurtflesh";
            }

            protected Item getDropItemId()
            {
            	return Items.rotten_flesh;
            }
            
           

          
            public EnumCreatureAttribute getCreatureAttribute()
            {
                return EnumCreatureAttribute.UNDEAD;
            }

            protected void dropRareDrop(int par1)
            {
            	 {
            	        switch (this.rand.nextInt(3))
            	        {
            	            case 0:
            	                this.dropItem(Items.iron_ingot, 1);
            	                break;
            	            case 1:
            	                this.dropItem(Items.carrot, 1);
            	                break;
            	            case 2:
            	                this.dropItem(Items.diamond,1 );
            	        }
            	    }
            }
}
