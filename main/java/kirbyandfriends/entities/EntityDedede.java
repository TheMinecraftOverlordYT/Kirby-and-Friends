package kirbyandfriends.entities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class EntityDedede extends EntityMob implements IAnimals
{
	
	public EntityDedede(World world) {
		super(world);
	        this.setSize(1.4F, 2.9F);
	        ((PathNavigateGround)this.getNavigator()).func_179690_a(true);
	        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
	        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
	        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, false));
	    }
	
	private int attackTimer;

	    protected void entityInit()
	    {
	        super.entityInit();
	        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
	    }

	    /**
	     * Returns true if the newer Entity AI code should be run
	     */
	    public boolean isAIEnabled()
	    {
	        return true;
	    }

/*	    *//**
	     * main AI tick function, replaces updateEntityActionState
	     *//*
	    protected void updateAITick()
	    {
	        if (--this.homeCheckTimer <= 0)
	        {
	         

	            if (this.villageObj == null)
	            {
	                this.detachHome();
	            }
	            else
	            {
	                ChunkCoordinates chunkcoordinates = this.villageObj.getCenter();
	                this.setHomeArea(chunkcoordinates.posX, chunkcoordinates.posY, chunkcoordinates.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));
	            }
	        }

	        super.updateAITick();
	    }*/

	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }

	    /**
	     * Decrements the entity's air supply when underwater
	     */
	    protected int decreaseAirSupply(int p_70682_1_)
	    {
	        return p_70682_1_;
	    }

	    protected void collideWithEntity(Entity p_82167_1_)
	    {
	        if (p_82167_1_ instanceof IMob && this.getRNG().nextInt(20) == 0)
	        {
	            this.setAttackTarget((EntityLivingBase)p_82167_1_);
	        }

	        super.collideWithEntity(p_82167_1_);
	    }

	    /**
	     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	     * use this to react to sunlight and start to burn.
	     */
	    public void onLivingUpdate()
	    {
	        super.onLivingUpdate();

	        if (this.attackTimer > 0)
	        {
	            --this.attackTimer;
	        }

	        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D && this.rand.nextInt(5) == 0)
	        {
	            int i = MathHelper.floor_double(this.posX);
	            int j = MathHelper.floor_double(this.posY - 0.20000000298023224D);
	            int k = MathHelper.floor_double(this.posZ);
	            IBlockState iblockstate = this.worldObj.getBlockState(new BlockPos(i, j, k));
	            Block block = iblockstate.getBlock();
	            
	            if (block.getMaterial() != Material.air)
	            {
	                this.worldObj.spawnParticle(EnumParticleTypes.BLOCK_CRACK, this.posX + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, this.getEntityBoundingBox().minY + 0.1D, this.posZ + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, 4.0D * ((double)this.rand.nextFloat() - 0.5D), 0.5D, ((double)this.rand.nextFloat() - 0.5D) * 4.0D, new int[] {Block.getStateId(iblockstate)});
	            }
	        }
	    }

	 

	    /**
	     * (abstract) Protected helper method to write subclass entity data to NBT.
	     */
	    public void writeEntityToNBT(NBTTagCompound p_70014_1_)
	    {
	        super.writeEntityToNBT(p_70014_1_);
	    }

	    /**
	     * (abstract) Protected helper method to read subclass entity data from NBT.
	     */
	    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
	    {
	        super.readEntityFromNBT(p_70037_1_);
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

	        if (flag)
	        {
	            p_70652_1_.motionY += 0.4000000059604645D;
	        }

	        this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
	        return flag;
	    }

	    @SideOnly(Side.CLIENT)
	    public void handleHealthUpdate(byte p_70103_1_)
	    {
	        if (p_70103_1_ == 4)
	        {
	            this.attackTimer = 10;
	            this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
	        }
	      /*  else if (p_70103_1_ == 11)
	        {
	            this.holdRoseTick = 400;
	        }*/
	        else
	        {
	            super.handleHealthUpdate(p_70103_1_);
	        }
	    }


	    @SideOnly(Side.CLIENT)
	    public int getAttackTimer()
	    {
	        return this.attackTimer;
	    }

	 
	    

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "mob.irongolem.hit";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "mob.irongolem.death";
	    }

	    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
	    {
	        this.playSound("mob.irongolem.walk", 1.0F, 1.0F);
	    }

	    /**
	     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
	     * par2 - Level of Looting used to kill this mob.
	     */
	    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
	        int j = this.rand.nextInt(3);
	        int k;

	        for (k = 0; k < j; ++k)
	        {
	            this.dropItem(Item.getItemFromBlock(Blocks.red_flower), 1);
	        }

	        k = 3 + this.rand.nextInt(3);

	        for (int l = 0; l < k; ++l)
	        {
	            this.dropItem(Items.iron_ingot, 1);
	        }
	    }

}
