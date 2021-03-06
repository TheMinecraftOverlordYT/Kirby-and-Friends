package kirbyandfriends.entities;


import java.util.Random;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.models.ModelKirby;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;



public class EntityCreepy extends EntityMob implements IRangedAttackMob,IBossDisplayData
{
 	 public double targetX;
     public double targetY;
     public double targetZ;
 	public  float timecount;
     public boolean disableDamage;
     /** Sets/indicates whether the player is flying. */
     public boolean isFlying;
     /** whether or not to allow the player to fly when they double jump. */
     public boolean allowFlying;
     private float flySpeed = 0.05F;
     private float walkSpeed = 0.1F;
 	
 	
 	  /** Animation time at previous tick. */
    public float prevAnimTime;
	/** Animation time, used to control the speed of the animation cycles (wings flapping, jaw opening, etc.) */
    public float animTime;
    
    /** Force selecting a new flight target at next tick if set to true. */
    public boolean forceNewTarget;
    
    
    /** Ring buffer array for the last 64 Y-positions and yaw rotations. Used to calculate offsets for the animations. */
    public double[][] ringBuffer = new double[64][3];
    /** Index into the ring buffer. Incremented once per tick and restarts at 0 once it reaches the end of the buffer. */
    public int ringBufferIndex = -1;
    /** The body bounding box of Kirby */
    public ModelKirby kirbyModel;
    
    
    static boolean fly = false;
    static boolean speed = false;
    static boolean nofall = false;
    static boolean flyfallfix = false;
    
    public boolean slowed;
    private Entity target;
    public int deathTicks;
    private int jumpTicks;
 	
    public EntityCreepy(World world)
    {
        super(world);
        this.setSize(0.5F, 0.5F);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.wheat, false));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true));
        this.tasks.addTask(9, new EntityAIPanic(this, newPosX));
        this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
 

    }
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(20, Integer.valueOf(0));
    }
    
    
    public void setHorseType(int i)
    {
        this.dataWatcher.updateObject(20, Integer.valueOf(i)); 
    }
    
    protected boolean canDespawn()
    {
        return true;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    
    
    public void setHorseVariant(int i)
    {
        this.dataWatcher.updateObject(20, Integer.valueOf(i));
    }
    

    public int getHorseVariant()
    {
        return this.dataWatcher.getWatchableObjectInt(20);
    }
    
    
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
    }


    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
   

    protected Item getDropItem()
    {
        return KirbyMod.wishstar;
    }


  /*  public void onLivingUpdate()
    {
        float f;
        float f1;

        
        if (this.worldObj.isRemote)
        {
            f = MathHelper.cos(this.animTime * (float)Math.PI * 2.0F);
            f1 = MathHelper.cos(this.prevAnimTime * (float)Math.PI * 2.0F);

            if (f1 <= -0.3F && f >= -0.3F)
            {
                //this.worldObj.playSound(this.posX, this.posY, this.posZ, "mob.enderdragon.wings", 5.0F, 0.8F + this.rand.nextFloat() * 0.3F, false);
            }
            if(onGround && this.isFlying)
            {
                this.isFlying = false;
            }
        }

        
        
        
        
        
        this.prevAnimTime = this.animTime;
        float f2;

        if (this.getHealth() <= 0.0F)
        {
            f = (this.rand.nextFloat() - 0.5F) * 8.0F;
            f1 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            f2 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("love", this.posX + (double)f, this.posY + 2.0D + (double)f1, this.posZ + (double)f2, 0.0D, 0.0D, 0.0D);
        }
        else
        {
        	
        	if(this.isFlying == false){
        	if(this.getLastAttacker() != null){
        		
            f = 0.2F / (MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 10.0F + 1.0F);
            f *= (float)Math.pow(2.0D, this.motionY);

            if (this.slowed)
            {
                this.animTime += f * 0.5F;
            }
            else
            {
                this.animTime += f;
            }

            this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);

            if (this.ringBufferIndex < 0)
            {
                for (int i = 0; i < this.ringBuffer.length; ++i)
                {
                    this.ringBuffer[i][0] = (double)this.rotationYaw;
                    this.ringBuffer[i][1] = this.posY;
                }
            }

            if (++this.ringBufferIndex == this.ringBuffer.length)
            {
                this.ringBufferIndex = 0;
            }

            this.ringBuffer[this.ringBufferIndex][0] = (double)this.rotationYaw;
            this.ringBuffer[this.ringBufferIndex][1] = this.posY;
            double d0;
            double d1;
            double d2;
            double d10;
            float f12;

            if (this.worldObj.isRemote)
            {
                if (this.newPosRotationIncrements > 0)
                {
                    d10 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
                    d0 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
                    d1 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
                    d2 = MathHelper.wrapAngleTo180_double(this.newRotationYaw - (double)this.rotationYaw);
                    this.rotationYaw = (float)((double)this.rotationYaw + d2 / (double)this.newPosRotationIncrements);
                    this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
                    --this.newPosRotationIncrements;
                    this.setPosition(d10, d0, d1);
                    this.setRotation(this.rotationYaw, this.rotationPitch);
                }
            }
            else
            {
                d10 = this.targetX - this.posX;
                d0 = this.targetY - this.posY;
                d1 = this.targetZ - this.posZ;
                d2 = d10 * d10 + d0 * d0 + d1 * d1;
                double d8;

                if (this.target != null)
                {
                    this.targetX = this.target.posX;
                    this.targetZ = this.target.posZ;
                    double d3 = this.targetX - this.posX;
                    double d5 = this.targetZ - this.posZ;
                    double d7 = Math.sqrt(d3 * d3 + d5 * d5);
                    d8 = 0.4000000059604645D + d7 / 80.0D - 1.0D;

                    if (d8 > 10.0D)
                    {
                        d8 = 10.0D;
                    }

                 // this.targetY = this.target.getEntityBoundingBox().minY + d8;
                }
                else
                {
                    this.targetX += this.rand.nextGaussian() * 2.0D;
                    this.targetZ += this.rand.nextGaussian() * 2.0D;
                }

                if (this.forceNewTarget || d2 < 100.0D || d2 > 22500.0D || this.isCollidedHorizontally || this.isCollidedVertically)
                {
                    this.setNewTarget();
                }

                d0 /= (double)MathHelper.sqrt_double(d10 * d10 + d1 * d1);
                f12 = 0.6F;
                d0 = MathHelper.clamp_double(d0, (double)(-f12), (double)f12);
                this.motionY += d0 * 0.10000000149011612D;
                this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);
                double d4 = 180.0D - Math.atan2(d10, d1) * 180.0D / Math.PI;
                double d6 = MathHelper.wrapAngleTo180_double(d4 - (double)this.rotationYaw);

                if (d6 > 50.0D)
                {
                    d6 = 50.0D;
                }

                if (d6 < -50.0D)
                {
                    d6 = -50.0D;
                }
                Vec3 vec3 = Vec3.createVectorHelper(this.targetX - this.posX, this.targetY - this.posY, this.targetZ - this.posZ).normalize();
                Vec3 vec31 = Vec3.createVectorHelper(this.motionX, this.motionY, this.motionZ).normalize();
                //Vec3 vec3 = (new Vec3(this.targetX - this.posX, this.targetY - this.posY, this.targetZ - this.posZ)).normalize();
                d8 = (double)(-MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F));
                //Vec3 vec31 = (new Vec3((double)MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F), this.motionY, d8)).normalize();
                float f5 = ((float)vec31.dotProduct(vec3) + 0.5F) / 1.5F;

                if (f5 < 0.0F)
                {
                    f5 = 0.0F;
                }

                this.randomYawVelocity *= 0.8F;
                float f6 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0F + 1.0F;
                double d9 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0D + 1.0D;

                if (d9 > 40.0D)
                {
                    d9 = 40.0D;
                }

                this.randomYawVelocity = (float)((double)this.randomYawVelocity + d6 * (0.699999988079071D / d9 / (double)f6));
                this.rotationYaw += this.randomYawVelocity * 0.1F;
                float f7 = (float)(2.0D / (d9 + 1.0D));
                float f8 = 0.06F;
                this.moveFlying(0.0F, -1.0F, f8 * (f5 * f7 + (1.0F - f7)));

                if (this.slowed)
                {
                    this.moveEntity(this.motionX * 0.800000011920929D, this.motionY * 0.800000011920929D, this.motionZ * 0.800000011920929D);
                }
                else
                {
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                }

              
                Vec3 vec32 = Vec3.createVectorHelper((double)MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F), this.motionY, (double)(-MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F))).normalize();
                float f9 = ((float)vec32.dotProduct(vec31) + 1.0F) / 2.0F;
                f9 = 0.8F + 0.15F * f9;
                this.motionX *= (double)f9;
                this.motionZ *= (double)f9;
                this.motionY *= 0.9100000262260437D;
            }

            this.renderYawOffset = this.rotationYaw;
            this.kirbyModel.Head.width = this.kirbyModel.Head.height = 3.0F;
            this.kirbyModelTail1.width = this.kirbyModelTail1.height = 2.0F;
            this.kirbyModelTail2.width = this.kirbyModelTail2.height = 2.0F;
            this.kirbyModelTail3.width = this.kirbyModelTail3.height = 2.0F;
            this.kirbyModel.Body.height = 3.0F;
            this.kirbyModel.Body.width = 5.0F;
            this.kirbyModelWing1.height = 2.0F;
            this.kirbyModelWing1.width = 4.0F;
            this.kirbyModelWing2.height = 3.0F;
            this.kirbyModelWing2.width = 4.0F;
            f1 = (float)(this.getMovementOffsets(5, 1.0F)[1] - this.getMovementOffsets(10, 1.0F)[1]) * 10.0F / 180.0F * (float)Math.PI;
            f2 = MathHelper.cos(f1);
            float f10 = -MathHelper.sin(f1);
            float f3 = this.rotationYaw * (float)Math.PI / 180.0F;
            float f11 = MathHelper.sin(f3);
            float f4 = MathHelper.cos(f3);
           // this.kirbyModel.Body.onUpdate();
            //this.kirbyModel.Body.setLocationAndAngles(this.posX + (double)(f11 * 0.5F), this.posY, this.posZ - (double)(f4 * 0.5F), 0.0F, 0.0F);
            //this.kirbyModelWing1.onUpdate();
            //this.kirbyModel.Wing1.setLocationAndAngles(this.posX + (double)(f4 * 4.5F), this.posY + 2.0D, this.posZ + (double)(f11 * 4.5F), 0.0F, 0.0F);
            //this.kirbyModelWing2.onUpdate();
            //this.kirbyModel.Wing2.setLocationAndAngles(this.posX - (double)(f4 * 4.5F), this.posY + 2.0D, this.posZ - (double)(f11 * 4.5F), 0.0F, 0.0F);

            if (!this.worldObj.isRemote && this.hurtTime == 0)
            {
               // this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.kirbyModel.Wing1.getEntityBoundingBox().expand(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
                //this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.kirbyModel.Wing2.getEntityBoundingBox().expand(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
                //this.attackEntitiesInList(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.kirbyModel.Body.().expand(1.0D, 1.0D, 1.0D)));
            }

            double[] adouble1 = this.getMovementOffsets(5, 1.0F);
            double[] adouble = this.getMovementOffsets(0, 1.0F);
            f12 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F - this.randomYawVelocity * 0.01F);
            float f13 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F - this.randomYawVelocity * 0.01F);
           // this.kirbyModel.Head.onUpdate();
            //this.kirbyModel.Head.setLocationAndAngles(this.posX + (double)(f12 * 5.5F * f2), this.posY + (adouble[1] - adouble1[1]) * 1.0D + (double)(f10 * 5.5F), this.posZ - (double)(f13 * 5.5F * f2), 0.0F, 0.0F);
        	}
            if((this.isFlying == false) && (this.getAttackTarget() == null)){
            	super.onLivingUpdate();
            	   if (this.jumpTicks > 0)
                   {
                       --this.jumpTicks;
                   }

                   if (this.newPosRotationIncrements > 0)
                   {
                      double d02 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
                       double d12 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
                     	double d22 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
                       double d3 = MathHelper.wrapAngleTo180_double(this.newRotationYaw - (double)this.rotationYaw);
                       this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
                       this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
                       --this.newPosRotationIncrements;
                       this.setPosition(d02, d12, d22);
                       this.setRotation(this.rotationYaw, this.rotationPitch);
                   }
                   else if (!this.isClientWorld())
                   {
                       this.motionX *= 0.98D;
                       this.motionY *= 0.98D;
                       this.motionZ *= 0.98D;
                   }

                   if (Math.abs(this.motionX) < 0.005D)
                   {
                       this.motionX = 0.0D;
                   }

                   if (Math.abs(this.motionY) < 0.005D)
                   {
                       this.motionY = 0.0D;
                   }

                   if (Math.abs(this.motionZ) < 0.005D)
                   {
                       this.motionZ = 0.0D;
                   }

                   this.worldObj.theProfiler.startSection("ai");

                   if (this.isMovementBlocked())
                   {
                       this.isJumping = false;
                       this.moveStrafing = 0.0F;
                       this.moveForward = 0.0F;
                       this.randomYawVelocity = 0.0F;
                   }
                   else if (this.isClientWorld())
                   {
                       if (this.isAIEnabled())
                       {
                           this.worldObj.theProfiler.startSection("newAi");
                           this.updateAITasks();
                           this.worldObj.theProfiler.endSection();
                       }
                       else
                       {
                           this.worldObj.theProfiler.startSection("oldAi");
                           this.updateEntityActionState();
                           this.worldObj.theProfiler.endSection();
                           this.rotationYawHead = this.rotationYaw;
                       }
                   }

                   this.worldObj.theProfiler.endSection();
                   this.worldObj.theProfiler.startSection("jump");

                   if (this.isJumping)
                   {
                       if (!this.isInWater() && !this.handleLavaMovement())
                       {
                           if (this.onGround && this.jumpTicks == 0)
                           {
                               this.jump();
                               this.jumpTicks = 10;
                           }
                       }
                       else
                       {
                           this.motionY += 0.03999999910593033D;
                           this.fly = true; 
                       }
                   }
                   else
                   {
                       this.jumpTicks = 0;
                   }

                   this.worldObj.theProfiler.endSection();
                   this.worldObj.theProfiler.startSection("travel");
                   this.moveStrafing *= 0.98F;
                   this.moveForward *= 0.98F;
                   this.randomYawVelocity *= 0.9F;
                   this.moveEntityWithHeading(this.moveStrafing, this.moveForward);
                   this.worldObj.theProfiler.endSection();
                   this.worldObj.theProfiler.startSection("push");

                   if (!this.worldObj.isRemote)
                   {
                       this.collideWithNearbyEntities();
                   }

                   this.worldObj.theProfiler.endSection();
               }
            	
            }
            
            if (!this.worldObj.isRemote)
            {
               // this.slowed = this.destroyBlocksInAABB(this.kirbyModel.Head.getEntityBoundingBox()) | this.destroyBlocksInAABB(this.kirbyModel.Body.getEntityBoundingBox());
            }
            
        }
    }*/
    
    
    
    public double[] getMovementOffsets(int p_70974_1_, float p_70974_2_)
    {
        if (this.getHealth() <= 0.0F)
        {
            p_70974_2_ = 0.0F;
        }

        p_70974_2_ = 1.0F - p_70974_2_;
        int j = this.ringBufferIndex - p_70974_1_ * 1 & 63;
        int k = this.ringBufferIndex - p_70974_1_ * 1 - 1 & 63;
        double[] adouble = new double[3];
        double d0 = this.ringBuffer[j][0];
        double d1 = MathHelper.wrapAngleTo180_double(this.ringBuffer[k][0] - d0);
        adouble[0] = d0 + d1 * (double)p_70974_2_;
        d0 = this.ringBuffer[j][1];
        d1 = this.ringBuffer[k][1] - d0;
        adouble[1] = d0 + d1 * (double)p_70974_2_;
        adouble[2] = this.ringBuffer[j][2] + (this.ringBuffer[k][2] - this.ringBuffer[j][2]) * (double)p_70974_2_;
        return adouble;
    }
    
    
    
    
    /**
     * Sets a new target for the flight AI. It can be a random coordinate or a nearby player.
     */
    private void setNewTarget()
    {
        this.forceNewTarget = false;

        if (this.rand.nextInt(2) == 0 && !this.worldObj.playerEntities.isEmpty())
        {
            this.target = (Entity)this.worldObj.playerEntities.get(this.rand.nextInt(this.worldObj.playerEntities.size()));
        }
        else
        {
            boolean flag = false;

            do
            {
                this.targetX = 0.0D;
                this.targetY = (double)(70.0F + this.rand.nextFloat() * 50.0F);
                this.targetZ = 0.0D;
                this.targetX += (double)(this.rand.nextFloat() * 120.0F - 60.0F);
                this.targetZ += (double)(this.rand.nextFloat() * 120.0F - 60.0F);
                double d0 = this.posX - this.targetX;
                double d1 = this.posY - this.targetY;
                double d2 = this.posZ - this.targetZ;
                flag = d0 * d0 + d1 * d1 + d2 * d2 > 100.0D;
            }
            while (!flag);

            this.target = null;
        }
    }

    /**
     * Simplifies the value of a number by adding/subtracting 180 to the point that the number is between -180 and 180.
     */
    private float simplifyAngle(double p_70973_1_)
    {
        return (float)MathHelper.wrapAngleTo180_double(p_70973_1_);
    }
    
    public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_)
    {

        if (this.isFlying && this.ridingEntity == null)
        {
            double d3 = this.motionY;
            float f2 = this.jumpMovementFactor;
            this.jumpMovementFactor = this.getFlySpeed();
            super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
            this.motionY = d3 * 0.6D;
            this.jumpMovementFactor = f2;
        }
        else
        {
            super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
        }
    }

   
    public float getFlySpeed()
    {
        return this.flySpeed;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "kirbyandfriends:mob.KirbySound2";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "kirbyandfriends:mob.KirbySound1";
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
        int i = 5;
        return entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)i);
    }

    public boolean canBreatheUnderwater()
    {
        return true;
    }

    protected float getSoundVolume()
    {
        return 0.4F;
    }
    
    
  
    
    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "kirbyandfriends:mob.KirbyDeath";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.sheep.step", 0.15F, 1.0F);
    }
    
    public EntityCreepy createChild(EntityAnimal par1EntityAnimal)
    {
      return new EntityCreepy(worldObj);
    }
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase par1LivingBase, float par2) {
		EntityThrownWishStar entitylaser = new EntityThrownWishStar(this.worldObj, this, par2);
        double d0 = par1LivingBase.posX - this.posX;
        double d1 = par1LivingBase.posY + (double)par1LivingBase.getEyeHeight() - 1.100000023841858D - entitylaser.posY;
        double d2 = par1LivingBase.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitylaser.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entitylaser);
		
	}
   
    }
    
