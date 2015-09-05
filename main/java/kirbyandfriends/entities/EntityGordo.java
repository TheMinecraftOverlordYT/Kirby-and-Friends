package kirbyandfriends.entities;

import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityGordo extends EntityMob{

	public EntityGordo(World world) {
		super(world);
		 this.tasks.addTask(1, new EntityAISwimming(this));
		
	}

	  public void onUpdate()
	    {
	        super.onUpdate();
	            this.motionY *= 0.6000000238418579D;
	        }
	    
	
}
