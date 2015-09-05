package kirbyandfriends.entities;

import java.util.Calendar;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityScarfy extends EntityMob {
	  private ChunkCoordinates spawnPosition;
	public EntityScarfy(World world) {
		super(world);
		 this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	      this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(6, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }
    
    protected float getSoundVolume()
    {
        return 0.1F;
    }

    protected float getSoundPitch()
    {
        return super.getSoundPitch() * 0.95F;
    }
    
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.bat.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.bat.death";
    }
    
    public boolean canBePushed()
    {
        return false;
    }
    

    protected void collideWithEntity(Entity p_82167_1_) {}

    protected void collideWithNearbyEntities() {}

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
    }
    
    protected boolean isAIEnabled()
    {
        return true;
    }
    
    public void onUpdate()
    {

      
            this.motionY *= 0.6000000238418579D;
    }


    protected void updateAITasks()
    {
        super.updateAITasks();


            if (!this.worldObj.getBlock(MathHelper.floor_double(this.posX), (int)this.posY + 1, MathHelper.floor_double(this.posZ)).isNormalCube())
            {
                this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
            }
            else
            {
                if (this.rand.nextInt(200) == 0)
                {
                    this.rotationYawHead = (float)this.rand.nextInt(360);
                }

                if (this.worldObj.getClosestPlayerToEntity(this, 4.0D) != null)
                {
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
                }
            }
        }
        {
            if (this.spawnPosition != null && (!this.worldObj.isAirBlock(this.spawnPosition.posX, this.spawnPosition.posY, this.spawnPosition.posZ) || this.spawnPosition.posY < 1))
            {
                this.spawnPosition = null;
            }

            if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0F)
            {
                this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
            }

            double d0 = (double)this.spawnPosition.posX + 0.5D - this.posX;
            double d1 = (double)this.spawnPosition.posY + 0.1D - this.posY;
            double d2 = (double)this.spawnPosition.posZ + 0.5D - this.posZ;
            this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
            this.motionY += (Math.signum(d1) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
            this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
            float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
            float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
            this.moveForward = 0.5F;
            this.rotationYaw += f1;
        }
    
        protected void fall(float p_70069_1_) {}
        
        protected void updateFallState(double p_70064_1_, boolean p_70064_3_) {}
        
        public boolean doesEntityNotTriggerPressurePlate()
        {
            return true;
        }
        
        /**
         * Called when the entity is attacked.
         */
        public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
        {
      
          
                if (!this.worldObj.isRemote)
                {
                   
                }

                return super.attackEntityFrom(p_70097_1_, p_70097_2_);
            }
       
        public boolean getCanSpawnHere()
        {
            int i = MathHelper.floor_double(this.boundingBox.minY);

            if (i >= 63)
            {
                return false;
            }
            else
            {
                int j = MathHelper.floor_double(this.posX);
                int k = MathHelper.floor_double(this.posZ);
                int l = this.worldObj.getBlockLightValue(j, i, k);
                byte b0 = 4;
                Calendar calendar = this.worldObj.getCurrentDate();

                if ((calendar.get(2) + 1 != 10 || calendar.get(5) < 20) && (calendar.get(2) + 1 != 11 || calendar.get(5) > 3))
                {
                    if (this.rand.nextBoolean())
                    {
                        return false;
                    }
                }
                else
                {
                    b0 = 7;
                }

                return l > this.rand.nextInt(b0) ? false : super.getCanSpawnHere();
            }
        }
}
