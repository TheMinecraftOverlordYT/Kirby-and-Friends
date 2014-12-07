package pigman.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityRana extends EntityMob
{

            public EntityRana(World par1World)
            {
				super(par1World);
				this.setSize(0.4F, 3.2F); 
				this.tasks.addTask(0, new EntityAISwimming(this));
				this.tasks.addTask(1, new EntityAIWander(this, 0.38F));
				this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 0.2F));
				this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityPlayer.class, 0.2F, 0.38F, 5.10));
				this.tasks.addTask(4, new EntityAIMoveIndoors(this));
				this.tasks.addTask(2, new EntityAILookIdle(this));
            }

            public boolean enableAI()
            {
				return true;
            }

            
            {
            	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
            }

            protected void dropFewItems(boolean par1, int par2)
            {
                int j = this.rand.nextInt(3);

                for (int k = 0; k < j; ++k)
                {
                    this.dropItem(Items.apple, 1);
                }
            }

            public EntityMob spawnBabyAnimal(EntityMob var1)
            {
				return null;
            }
}
