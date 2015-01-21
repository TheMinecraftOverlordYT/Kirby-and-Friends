package kirbyandfriends.entities;


import kirbyandfriends.KirbyMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityKirby extends EntityGolem 
{

    public EntityKirby(World world)
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
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
    }
    
    private String Path;
    private static final String[] horseTextures = new String[] {KirbyMod.modid + ":textures/entities/DefaultKirby.png",KirbyMod.modid + ":textures/entities/BlackKirby.png",KirbyMod.modid + ":textures/entities/WhiteKirby.png", KirbyMod.modid + ":textures/entities/RedKirby.png", KirbyMod.modid + ":textures/entities/GreenKirby.png",KirbyMod.modid + ":textures/entities/BlueKirby.png", KirbyMod.modid + ":textures/entities/PurpleKirby.png"};
    private static final String[] textureA= new String[] {"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] textureB= new String[] {"", "wo_", "wmo", "wdo", "bdo"};
    private static final String[] textureC = new String[] {"", "meo", "goo", "dio"};
    private String field_110286_bQ;
    private String[] HorseTexture = new String[3];
   
    public int getHorseType()
    {
        return this.dataWatcher.getWatchableObjectByte(19);
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Integer.valueOf(0));
        this.dataWatcher.addObject(19, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(20, Integer.valueOf(0));
        this.dataWatcher.addObject(21, String.valueOf(""));
        this.dataWatcher.addObject(22, Integer.valueOf(0));
    }

    @SideOnly(Side.CLIENT)
    public boolean HorseReader()
    {
        return this.getHorseType() == 0 || this.GetData() > 0;
    }
    
    public void setHorseType(int p_110214_1_)
    {
        this.dataWatcher.updateObject(19, Byte.valueOf((byte)p_110214_1_));
        this.NullChecker();
    }
    
    @SideOnly(Side.CLIENT)
    public String[] getVariantTexturePaths()
    {
        if (this.field_110286_bQ == null)
        {
            this.setHorseTexturePaths();
        }

        return this.HorseTexture;
    }
    
    public boolean func_110256_cu()
    {
        int i = this.getHorseType();
        return i == 3 || i == 4;
    }

    public boolean func_110222_cv()
    {
        return this.func_110256_cu() || this.getHorseType() == 2;
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

    @SideOnly(Side.CLIENT)
    public String getHorseTexture()
    {
        if (this.Path == null)
        {
            this.setHorseTexturePaths();
        }

        return this.Path;
    }
    
    public int GetData()
    {
        return this.dataWatcher.getWatchableObjectInt(22);
    }
    
    public void setHorseVariant(int i)
    {
        this.dataWatcher.updateObject(20, Integer.valueOf(i));
        this.NullChecker();
    }
    
    private void NullChecker()
    {
        this.Path = null;
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
        return Item.getItemFromBlock(Blocks.wool);
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


    protected float getSoundVolume()
    {
        return 0.4F;
    }
    
    @SideOnly(Side.CLIENT)
    private void setHorseTexturePaths()
    {
        this.Path = KirbyMod.modid + ":textures/entities/";
        this.HorseTexture[0] = null;
        this.HorseTexture[1] = null;
        this.HorseTexture[2] = null;
        int i = this.getHorseType();
        int j = this.getHorseVariant();
        int k;

        if (i == 0)
        {
            k = j & 255;
            int l = (j & 65280) >> 8;
            this.HorseTexture[0] = horseTextures[k];
            this.Path = this.Path + textureA[k];
            this.Path = this.Path + textureB[l];
        }
        else
        {
            this.HorseTexture[0] = "";
            this.Path = this.Path + "_" + i + "_";
        }

        k = this.GetData();
        this.Path = this.Path + textureC[k];
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
    
    public EntityKirby createChild(EntityAnimal par1EntityAnimal)
    {
      return new EntityKirby(worldObj);
    }
   
    }
    
