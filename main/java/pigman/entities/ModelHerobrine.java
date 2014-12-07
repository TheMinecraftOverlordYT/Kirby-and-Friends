package pigman.entities;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelHerobrine extends ModelBiped
{

            public ModelHerobrine()
            {
               this(0.0F);
            }

            public ModelHerobrine(float par1)
            {
                this(par1, 0.0F);
            }

            public ModelHerobrine(float par1, float par2)
            {
                heldItemLeft = 0;
                heldItemRight = 0;
                isSneak = false;
                aimedBow = false;
                HerobrineCloak = new ModelRenderer(this, 0, 0);
                HerobrineCloak.addBox(-5F, 0.0F, -1F, 10, 16, 1, par1);
                HerobrineEars = new ModelRenderer(this, 24, 0);
                HerobrineEars.addBox(-3F, -6F, -1F, 6, 6, 1, par1);
                HerobrineHead = new ModelRenderer(this, 0, 0);
                HerobrineHead.addBox(-4F, -8F, -4F, 8, 8, 8, par1);
                HerobrineHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                HerobrineHeadwear = new ModelRenderer(this, 32, 0);
                HerobrineHeadwear.addBox(-4F, -8F, -4F, 8, 8, 8, par1 + 0.5F);
                HerobrineHeadwear.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                HerobrineBody = new ModelRenderer(this, 16, 16);
                HerobrineBody.addBox(-4F, 0.0F, -2F, 8, 12, 4, par1);
                HerobrineBody.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
                HerobrineRightArm = new ModelRenderer(this, 40, 16);
                HerobrineRightArm.addBox(-3F, -2F, -2F, 4, 12, 4, par1);
                HerobrineRightArm.setRotationPoint(-5F, 2.0F + par2, 0.0F);
                HerobrineLeftArm = new ModelRenderer(this, 40, 16);
                HerobrineLeftArm.mirror = true;
                HerobrineLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4, par1);
                HerobrineLeftArm.setRotationPoint(5F, 2.0F + par2, 0.0F);
                HerobrineRightLeg = new ModelRenderer(this, 0, 16);
                HerobrineRightLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
                HerobrineRightLeg.setRotationPoint(-2F, 12F + par2, 0.0F);
                HerobrineLeftLeg = new ModelRenderer(this, 0, 16);
                HerobrineLeftLeg.mirror = true;
                HerobrineLeftLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
                HerobrineLeftLeg.setRotationPoint(2.0F, 12F + par2, 0.0F);
            }

            public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
            {
                //render(par1Entity, par2, par3, par4, par5, par6, par7);
                HerobrineHead.render(par7);
                HerobrineBody.render(par7);
                HerobrineRightArm.render(par7);
                HerobrineLeftArm.render(par7);
                HerobrineRightLeg.render(par7);
                HerobrineLeftLeg.render(par7);
                HerobrineHeadwear.render(par7);
            }

            public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
            {
                HerobrineHead.rotateAngleY = par4 / 57.29578F;
                HerobrineHead.rotateAngleX = par5 / 57.29578F;
                HerobrineHeadwear.rotateAngleY = HerobrineHead.rotateAngleY;
                HerobrineHeadwear.rotateAngleX = HerobrineHead.rotateAngleX;
                HerobrineRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 2.0F * par2 * 0.5F;
                HerobrineLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
                HerobrineRightArm.rotateAngleZ = 0.0F;
                HerobrineLeftArm.rotateAngleZ = 0.0F;
                HerobrineRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
                HerobrineLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 1.4F * par2;
                HerobrineRightLeg.rotateAngleY = 0.0F;
                HerobrineLeftLeg.rotateAngleY = 0.0F;
                if(isRiding)
                {
                	HerobrineRightArm.rotateAngleX += -0.6283185F;
                	HerobrineLeftArm.rotateAngleX += -0.6283185F;
                	HerobrineRightLeg.rotateAngleX = -1.256637F;
                	HerobrineLeftLeg.rotateAngleX = -1.256637F;
                	HerobrineRightLeg.rotateAngleY = 0.3141593F;
					HerobrineLeftLeg.rotateAngleY = -0.3141593F;
                }
                if(heldItemLeft != 0)
                  HerobrineLeftArm.rotateAngleX = HerobrineLeftArm.rotateAngleX * 0.5F - 0.3141593F * (float)heldItemLeft;
                if(heldItemRight != 0)
                HerobrineRightArm.rotateAngleX = HerobrineRightArm.rotateAngleX * 0.5F - 0.3141593F * (float)heldItemRight;
                HerobrineRightArm.rotateAngleY = 0.0F;
                HerobrineLeftArm.rotateAngleY = 0.0F;
                if(this.onGround > -9990F)
                {
                    float var7 = this.onGround;
                    HerobrineBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var7) * 3.141593F * 2.0F) * 0.2F;
                    HerobrineRightArm.rotationPointZ = MathHelper.sin(HerobrineBody.rotateAngleY) * 5F;
                    HerobrineRightArm.rotationPointX = -MathHelper.cos(HerobrineBody.rotateAngleY) * 5F;
                    HerobrineLeftArm.rotationPointZ = -MathHelper.sin(HerobrineBody.rotateAngleY) * 5F;
                    HerobrineLeftArm.rotationPointX = MathHelper.cos(HerobrineBody.rotateAngleY) * 5F;
                    HerobrineRightArm.rotateAngleY += HerobrineBody.rotateAngleY;
                    HerobrineLeftArm.rotateAngleY += HerobrineBody.rotateAngleY;
                    HerobrineLeftArm.rotateAngleX += HerobrineBody.rotateAngleY;
                    var7 = 1.0F - this.onGround;    
                    var7 *= var7;
		            var7 *= var7;
					var7 = 1.0F - var7;
                    float var8 = MathHelper.sin(var7 * 3.141593F);
                    float var9 = MathHelper.sin(this.onGround * 3.141593F) * -(HerobrineHead.rotateAngleX - 0.7F) * 0.75F;
                    HerobrineRightArm.rotateAngleX = (float)((double)HerobrineRightArm.rotateAngleX - ((double)var8 * 1.2D + (double)var9));
                    HerobrineRightArm.rotateAngleY += HerobrineBody.rotateAngleY * 2.0F;
                    HerobrineRightArm.rotateAngleZ = MathHelper.sin(this.onGround * 3.141593F) * -0.4F;
                }
                 if(isSneak)
                {
                    HerobrineBody.rotateAngleX = 0.5F;
                    HerobrineRightArm.rotateAngleX += 0.4F;
                    HerobrineLeftArm.rotateAngleX += 0.4F;
                    HerobrineRightLeg.rotationPointZ = 4F;
                    HerobrineLeftLeg.rotationPointZ = 4F;
                    HerobrineRightLeg.rotationPointY = 9F;
                    HerobrineLeftLeg.rotationPointY = 9F;
                    HerobrineHead.rotationPointY = 1.0F;
                } else
                {
                    HerobrineBody.rotateAngleX = 0.0F;
					HerobrineRightLeg.rotationPointZ = 0.0F;
					HerobrineLeftLeg.rotationPointZ = 0.0F;
					HerobrineRightLeg.rotationPointY = 12F;
                    HerobrineLeftLeg.rotationPointY = 12F;
                    HerobrineHead.rotationPointY = 0.0F;
                }
                HerobrineRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                HerobrineLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                HerobrineRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
                HerobrineLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
                if(aimedBow)
                {
                    float var7 = 0.0F;
                    float var8 = 0.0F;
                    HerobrineRightArm.rotateAngleZ = 0.0F;
                    HerobrineLeftArm.rotateAngleZ = 0.0F;
					HerobrineRightArm.rotateAngleY = -(0.1F - var7 * 0.6F) + HerobrineHead.rotateAngleY;
					HerobrineLeftArm.rotateAngleY = (0.1F - var7 * 0.6F) + HerobrineHead.rotateAngleY + 0.4F;
					HerobrineRightArm.rotateAngleX = -1.570796F + HerobrineHead.rotateAngleX;
					HerobrineLeftArm.rotateAngleX = -1.570796F + HerobrineHead.rotateAngleX;
					HerobrineRightArm.rotateAngleX -= var7 * 1.2F - var8 * 0.4F;
					HerobrineLeftArm.rotateAngleX -= var7 * 1.2F - var8 * 0.4F;
					HerobrineRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                    HerobrineLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                    HerobrineRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
                    HerobrineLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
                }
            }

            public void renderEars(float par1)
            {
                HerobrineEars.rotateAngleY = HerobrineHead.rotateAngleY;
                HerobrineEars.rotateAngleX = HerobrineHead.rotateAngleX;
                HerobrineEars.rotationPointX = 0.0F;
                HerobrineEars.rotationPointY = 0.0F;
                HerobrineEars.render(par1);
            }

            public void renderCloak(float par1)
            {
               HerobrineCloak.render(par1);
            }

            public ModelRenderer HerobrineHead;
            public ModelRenderer HerobrineHeadwear;
            public ModelRenderer HerobrineBody;
            public ModelRenderer HerobrineRightArm;
            public ModelRenderer HerobrineLeftArm;
            public ModelRenderer HerobrineRightLeg;
            public ModelRenderer HerobrineLeftLeg;
            public ModelRenderer HerobrineEars;
            public ModelRenderer HerobrineCloak;
            public int heldItemLeft;
            public int heldItemRight;
            public boolean isSneak;
            public boolean aimedBow;
}
