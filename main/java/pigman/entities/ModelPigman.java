package pigman.entities;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;




public class ModelPigman extends ModelBiped
{

            public ModelPigman()
            {
            }

            public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
            {
                   float var7 = MathHelper.sin(par2 * 3.141593F);
                   float var8 = MathHelper.sin((1.0F - (1.0F - par2) * (1.0F - par2)) * 3.141593F);
                   this.bipedRightArm.rotateAngleX= 0.0F;
                   this.bipedLeftArm.rotateAngleX= 0.0F;
                   this.bipedRightLeg.rotateAngleZ = -(0.1F - var7 * 0.6F);
                   this.bipedLeftLeg.rotateAngleZ = 0.1F - var7 * 0.6F;
                   this.bipedRightLeg.rotateAngleX+= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                   this.bipedLeftLeg.rotateAngleX-= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                   this.bipedRightLeg.rotateAngleY += MathHelper.sin(par3 * 0.067F) * 0.05F;
                   this.bipedLeftLeg.rotateAngleY -= MathHelper.sin(par3 * 0.067F) * 0.05F;
            }
}
