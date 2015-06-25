package kirbyandfriends.entities;

import java.util.IdentityHashMap;

import kirbyandfriends.KirbyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWaddleDee extends EntityAnimal{

	
	public EntityWaddleDoo entitywaddledoo;
	
	
	 private static final IAttribute waddleJumpStrength = (new RangedAttribute("waddle.jumpStrength", 0.7D, 0.0D, 2.0D)).setDescription("Jump Strength").setShouldWatch(true);
	    protected boolean waddleJumping;
	    protected float jumpPower;
	    private int jumpRearingCounter;
	    private float rearingAmount;
	    private float prevRearingAmount;
	
	public EntityWaddleDee(World world) {
		super(world);
	     this.setSize(0.9F, 1.3F);
	      this.getNavigator().setAvoidsWater(true);
	      this.tasks.addTask(0, new EntityAISwimming(this));
	      this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	       this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	       this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.cookie, false));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
	        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	}

    public boolean isWaddleJumping()
    {
        return this.waddleJumping;
    }
	
    protected  void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
        this.dataWatcher.addObject(17, Byte.valueOf((byte) 0));
    }
        
    
    public void setWaddleJumping(boolean p_110255_1_)
    {
        this.waddleJumping = p_110255_1_;
    }
	
    public boolean interact(EntityPlayer var1){

            ItemStack itemstack = var1.inventory.getCurrentItem();

            if (itemstack != null && itemstack.getItem() == Items.spider_eye && !var1.capabilities.isCreativeMode)
            {
                if (itemstack.stackSize-- == 1)
                {
                    entitywaddledoo = new EntityWaddleDoo(this.worldObj);
               entitywaddledoo.copyLocationAndAnglesFrom(this);
                this.worldObj.removeEntity(this);
                this.worldObj.spawnEntityInWorld(entitywaddledoo);
                
                
                
                }
                else if (!var1.inventory.addItemStackToInventory(new ItemStack(Items.milk_bucket)))
                {
                    var1.dropPlayerItemWithRandomChoice(new ItemStack(Items.milk_bucket, 1, 0), false);
                }

                return true;
            }
            else
            {
                return super.interact(var1);
            
    }
    }
    
    
    
    
    public double getWaddleJumpStrength()
    {
        return this.getEntityAttribute(waddleJumpStrength).getAttributeValue();
    }
    
    
	  protected boolean isAIEnabled()
	    {
	        return true;
	    }
	  
	//   public void writeEntityToNBT(NBTTagCompound p_70014_1_)
	//    {
	     //   super.writeEntityToNBT(p_70014_1_);
	     //   p_70014_1_.setShort("carried", (short)Block.getIdFromBlock(this.func_146080_bZ()));
	        //p_70014_1_.setShort("carriedData", (short)this.getCarryingData());
	//    }

	    /**
	     * (abstract) Protected helper method to read subclass entity data from NBT.
	     */
	  //  public void readEntityFromNBT(NBTTagCompound p_70037_1_)
	   // {
	      //  super.readEntityFromNBT(p_70037_1_);
	  //      this.func_146081_a(Block.getBlockById(p_70037_1_.getShort("carried")));
	    //    this.setCarryingData(p_70037_1_.getShort("carriedData"));
	  //  }
	    
	    
	    
	//    public void setCarryingData(int p_70817_1_)
	//    {
	//        this.dataWatcher.updateObject(17, Byte.valueOf((byte)(p_70817_1_ & 255)));
	   // }

	    public void func_146081_a(Block p_146081_1_)
		{
		    this.dataWatcher.updateObject(16, Byte.valueOf((byte)(Block.getIdFromBlock(p_146081_1_) & 255)));
		}

		/**
	     * Get the metadata of the block an enderman carries
	     */
	    public int getCarryingData()
	    {
	        return this.dataWatcher.getWatchableObjectByte(17);
	    }
	    
	    
	    public Block func_146080_bZ()
	    {
	        return Block.getBlockById(this.dataWatcher.getWatchableObjectByte(17));
	    }

	  
	
	//    private static IdentityHashMap<Block, Boolean> carriable;
	 //   public static void setCarriable(Block block, boolean canCarry)
	//    {
	       // if (carriable == null) carriable = new IdentityHashMap<Block, Boolean>(4096);
	       // carriable.put(block, canCarry);
	 //   }
	 //   public static boolean getCarriable(Block block)
	  //  {
	 //       Boolean ret = carriable.get(block);
	       // return ret != null ? ret : false;
	 //   }
	    
	    
	    public void setRearing(boolean p_110219_1_)
	    {

	        this.setWaddleWatchableBoolean(64, p_110219_1_);
	    }
	    
	    
	    private boolean getWaddleWatchableBoolean(int p_110233_1_)
	    {
	        return (this.dataWatcher.getWatchableObjectInt(16) & p_110233_1_) != 0;
	    }
	    
	    private void setWaddleWatchableBoolean(int p_110208_1_, boolean p_110208_2_)
	    {
	        int j = this.dataWatcher.getWatchableObjectInt(16);

	        if (p_110208_2_)
	        {
	            this.dataWatcher.updateObject(16, Integer.valueOf(j | p_110208_1_));
	        }
	        else
	        {
	            this.dataWatcher.updateObject(16, Integer.valueOf(j & ~p_110208_1_));
	        }
	    }
	    
	 public void onLivingUpdate(){
		  
	        int k;

	        if (!this.worldObj.isRemote && this.jumpRearingCounter > 0 && ++this.jumpRearingCounter > 20)
	        {
	            this.jumpRearingCounter = 0;
	            this.setRearing(false);
	        }
	        
	        
	        
	        if (!this.worldObj.isRemote && this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
	        {
	            int i;
	            int j;
	            Block block;

	            if (this.func_146080_bZ().getMaterial() == Material.air)
	            {
	                if (this.rand.nextInt(20) == 0)
	                {
	                    k = MathHelper.floor_double(this.posX - 2.0D + this.rand.nextDouble() * 4.0D);
	                    i = MathHelper.floor_double(this.posY + this.rand.nextDouble() * 3.0D);
	                    j = MathHelper.floor_double(this.posZ - 2.0D + this.rand.nextDouble() * 4.0D);
	                    block = this.worldObj.getBlock(k, i, j);

	               //     if (EntityWaddleDee.getCarriable(block))
	               //     {
	                        this.func_146081_a(block);
	                     ///   this.setCarryingData(this.worldObj.getBlockMetadata(k, i, j));
	                        this.worldObj.setBlock(k, i, j, KirbyMod.DreamBlock);
	                    }
	                
	            else if (this.rand.nextInt(2000) == 0)
	            {
	                k = MathHelper.floor_double(this.posX - 1.0D + this.rand.nextDouble() * 2.0D);
	                i = MathHelper.floor_double(this.posY + this.rand.nextDouble() * 2.0D);
	                j = MathHelper.floor_double(this.posZ - 1.0D + this.rand.nextDouble() * 2.0D);
	                block = this.worldObj.getBlock(k, i, j);
	                Block block1 = this.worldObj.getBlock(k, i - 1, j);

	                if (block.getMaterial() == Material.air && block1.getMaterial() == Material.air && block1.renderAsNormalBlock())
	                {
	               //     this.worldObj.setBlock(k, i, j, this.func_146080_bZ(), this.getCarryingData(), 3);
	                    this.func_146081_a(KirbyMod.DreamBlock);
	                }
	            }
	            else {
	            	return;
	            }
	        }
	  }
	 
	 }
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
	        this.getAttributeMap().registerAttribute(waddleJumpStrength);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.33000000417232513D);
	    }
	
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityWaddleDee(this.worldObj);
	}

}
