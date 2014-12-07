package pigman.entities;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityQuark extends EntityMob implements IRangedAttackMob
{

	public EntityQuark(World par1World)
    {
        super(par1World);
        this.setSize(0.4F, 1.8F);
        this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
        this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 0.2F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAIWander(this, newPosX));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true));
    }

    public boolean IsAIEnabled()
    {
      return true;
    }
{
    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4D);
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
}

    protected Item getDropItemId()
    {
    	return Items.iron_ingot;
    }
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(16);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.redstone, 1);
        }
    }

    public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLivingBase, float par2)
    {
        EntityLaser entitylaser = new EntityLaser(this.worldObj, this, par2);
        double d0 = par1EntityLivingBase.posX - this.posX;
        double d1 = par1EntityLivingBase.posY + (double)par1EntityLivingBase.getEyeHeight() - 1.100000023841858D - entitylaser.posY;
        double d2 = par1EntityLivingBase.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitylaser.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entitylaser);
    }
}
