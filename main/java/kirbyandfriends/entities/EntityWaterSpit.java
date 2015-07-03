package kirbyandfriends.entities;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;





public class EntityWaterSpit extends EntityThrowable {

	private double damage = 2.0D;
	public int knockbackStrength;
	
public EntityWaterSpit(World world) {
super(world);
}

public EntityWaterSpit(World world, EntityLivingBase entity) {
super(world, entity);
}

public EntityWaterSpit(World world, double x, double y, double z) {
super(world, x, y, z);
}

public void setDamage(double p_70239_1_)
{
    this.damage = p_70239_1_;
}

public double getDamage()
{
    return this.damage;
}

/**
 * Sets the amount of knockback the arrow applies when it hits a mob.
 */
public void setKnockbackStrength(int p_70240_1_)
{
    this.knockbackStrength = p_70240_1_;
}



/**
* Called when this EntityThrowable hits a block or entity.
*/
@Override
protected void onImpact(MovingObjectPosition mop) {
if (mop.entityHit != null) {
// We changed this to type 'float' and set to '2'; note you could just put the damage in
// the method directly if you don't intend to change the damage variable
float rockDamage = 2;

// now in this line we don't need to cast as 'float', since our variable is already that type
mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), rockDamage);
}


// spawn 4 "crit" particles at the point of impact
for (int l = 0; l < 4; ++l) {
this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
}




// be sure to set the entity to 'dead' or it will keep updating forever and you'll end up with lots of
// leftover entities in your world
if (!worldObj.isRemote) {
setDead();
}
}


}