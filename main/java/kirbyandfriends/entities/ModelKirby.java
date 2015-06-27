package kirbyandfriends.entities;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelKirby extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Face;
    ModelRenderer Back;
    ModelRenderer Left;
    ModelRenderer Right;
    ModelRenderer Top;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer LeftFoot;
    ModelRenderer RightFoot;
    private float partialTicks;
  
  public ModelKirby()
  {
    textureWidth = 80;
    textureHeight = 138;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-10F, 0F, -10F, 20, 20, 20);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(80, 138);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 0, 41);
      Face.addBox(-9.5F, -9.5F, -1F, 19, 19, 1);
      Face.setRotationPoint(0F, 10F, -10F);
      Face.setTextureSize(80, 138);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 40, 41);
      Back.addBox(-9.5F, -9.5F, 0F, 19, 19, 1);
      Back.setRotationPoint(0F, 10F, 10F);
      Back.setTextureSize(80, 138);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      Left = new ModelRenderer(this, 0, 61);
      Left.addBox(-1F, -9.5F, -9.5F, 1, 19, 19);
      Left.setRotationPoint(-10F, 10F, 0F);
      Left.setTextureSize(80, 138);
      Left.mirror = true;
      setRotation(Left, 0F, 0F, 0F);
      Right = new ModelRenderer(this, 40, 61);
      Right.addBox(0F, -9.5F, -9.5F, 1, 19, 19);
      Right.setRotationPoint(10F, 10F, 0F);
      Right.setTextureSize(80, 138);
      Right.mirror = true;
      setRotation(Right, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 100);
      Top.addBox(-9.5F, -1F, -9.5F, 19, 1, 19);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(80, 138);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 0, 121);
      LeftArm.addBox(0F, -2.5F, -3.5F, 3, 10, 7);
      LeftArm.setRotationPoint(11F, 9F, -4F);
      LeftArm.setTextureSize(80, 138);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, -0.1487144F);
      RightArm = new ModelRenderer(this, 0, 121);
      RightArm.addBox(0F, -2.5F, -3.5F, 3, 10, 7);
      RightArm.setRotationPoint(-11F, 9F, -4F);
      RightArm.setTextureSize(80, 138);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 3.141593F, -0.1487144F);
      LeftFoot = new ModelRenderer(this, 20, 121);
      LeftFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      LeftFoot.setRotationPoint(-8F, 20F, 0F);
      LeftFoot.setTextureSize(80, 138);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0.2974289F, 0F);
      RightFoot = new ModelRenderer(this, 20, 121);
      RightFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      RightFoot.setRotationPoint(8F, 20F, 0F);
      RightFoot.setTextureSize(80, 138);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, -0.2974216F, 0F);
  }
  
  /**
   * Used for easily adding entity-dependent animations. The second and third float params here are the same second
   * and third as in the setRotationAngles method.
   */
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
  {
      this.partialTicks = p_78086_4_;
  }
  /**
   * Sets the models various rotation angles then renders the model.
   */
<<<<<<< HEAD
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
=======
  public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float f5)
  {
      GL11.glPushMatrix();
      EntityKirby entitykirby = (EntityKirby)p_78088_1_;
      float f6 = entitykirby.prevAnimTime + (entitykirby.animTime - entitykirby.prevAnimTime) * this.partialTicks;
      //this.jaw.rotateAngleX = (float)(Math.sin((double)(f6 * (float)Math.PI * 2.0F)) + 1.0D) * 0.2F;
      float f7 = (float)(Math.sin((double)(f6 * (float)Math.PI * 2.0F - 1.0F)) + 1.0D);
      f7 = (f7 * f7 * 1.0F + f7 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, f7 - 2.0F, -3.0F);
      GL11.glRotatef(f7 * 2.0F, 1.0F, 0.0F, 0.0F);
      float f8 = -30.0F;
      float f10 = 0.0F;
      float f11 = 1.5F;
      double[] adouble = entitykirby.getMovementOffsets(6, this.partialTicks);
      float f12 = this.updateRotations(entitykirby.getMovementOffsets(5, this.partialTicks)[0] - entitykirby.getMovementOffsets(10, this.partialTicks)[0]);
      float f13 = this.updateRotations(entitykirby.getMovementOffsets(5, this.partialTicks)[0] + (double)(f12 / 2.0F));
      f8 += 2.0F;
      float f14 = f6 * (float)Math.PI * 2.0F;
      f8 = 20.0F;
      float f9 = -12.0F;
      float f15;

   
          double[] adouble1 = entitykirby.getMovementOffsets(5, this.partialTicks);
          f15 = (float)Math.cos((double)(0.45F + f14)) * 0.15F;
    /*      this.Body.rotateAngleY = this.updateRotations(adouble1[0] - adouble[0]) * (float)Math.PI / 180.0F * f11;
          this.Body.rotateAngleX = f15 + (float)(adouble1[1] - adouble[1]) * (float)Math.PI / 180.0F * f11 * 5.0F;
          this.Body.rotateAngleZ = -this.updateRotations(adouble1[0] - (double)f13) * (float)Math.PI / 180.0F * f11;
          this.Body.rotationPointY = f8;
          this.Body.rotationPointZ = f9;
          this.Body.rotationPointX = f10;*/
          f8 = (float)((double)f8 + Math.sin((double)this.Body.rotateAngleX) * 10.0D);
          f9 = (float)((double)f9 - Math.cos((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          f10 = (float)((double)f10 - Math.sin((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          //this.Body.render(f5);

    /*  double[] adouble2 = entitykirby.getMovementOffsets(0, this.partialTicks);
      
     this.Body.rotationPointY = f8;
      this.Body.rotationPointZ = f9;
      this.Body.rotationPointX = f10;
    
      this.Body.rotateAngleY = this.updateRotations(adouble2[0] - adouble[0]) * (float)Math.PI / 180.0F * 1.0F;
      this.Body.rotateAngleZ = -this.updateRotations(adouble2[0] - (double)f13) * (float)Math.PI / 180.0F * 1.0F;*/
      //this.Body.render(f5);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f12 * f11 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.Body.rotateAngleZ = 0.0F;

      
         GL11.glEnable(GL11.GL_CULL_FACE);
          f15 = f6 * (float)Math.PI * 2.0F;
          this.LeftArm.rotateAngleX = 0.125F - (float)Math.cos((double)f15) * 0.2F;
          this.LeftArm.rotateAngleY = 0.25F;
          this.LeftArm.rotateAngleZ = (float)(Math.sin((double)f15) + 0.125D) * 0.8F;
         // this.wingTip.rotateAngleZ = -((float)(Math.sin((double)(f15 + 2.0F)) + 0.5D)) * 0.75F;
         // this.rearLeg.rotateAngleX = 1.0F + f7 * 0.1F;
         // this.rearLegTip.rotateAngleX = 0.5F + f7 * 0.1F;
          this.RightFoot.rotateAngleX = 0.75F + f7 * 0.1F;
         //this.frontLeg.rotateAngleX = 1.3F + f7 * 0.1F;
         // this.frontLegTip.rotateAngleX = -0.5F - f7 * 0.1F;
          this.LeftFoot.rotateAngleX = 0.75F + f7 * 0.1F;
         // this.LeftArm.render(f5);
         // this.frontLeg.render(f5);
         // this.rearLeg.render(f5);
          GL11.glScalef(-1.0F, 1.0F, 1.0F);
          GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);

      GL11.glPopMatrix();
    GL11.glCullFace(GL11.GL_BACK);
      GL11.glDisable(GL11.GL_CULL_FACE);
      float f16 = -((float)Math.sin((double)(f6 * (float)Math.PI * 2.0F))) * 0.0F;
      f14 = f6 * (float)Math.PI * 2.0F;
      f8 = 10.0F;
      f9 = 60.0F;
      f10 = 0.0F;
      adouble = entitykirby.getMovementOffsets(11, this.partialTicks);

   
          /*adouble2 = entitykirby.getMovementOffsets(12, this.partialTicks);
          f16 = (float)((double)f16 + Math.sin((double)(0.45F + f14)) * 0.05000000074505806D);
          this.Body.rotateAngleY = (this.updateRotations(adouble2[0] - adouble[0]) * f11 + 180.0F) * (float)Math.PI / 180.0F;
          this.Body.rotateAngleX = f16 + (float)(adouble2[1] - adouble[1]) * (float)Math.PI / 180.0F * f11 * 5.0F;
          this.Body.rotateAngleZ = this.updateRotations(adouble2[0] - (double)f13) * (float)Math.PI / 180.0F * f11;
          this.Body.rotationPointY = f8;
          this.Body.rotationPointZ = f9;
          this.Body.rotationPointX = f10;*/
          f8 = (float)((double)f8 + Math.sin((double)this.Body.rotateAngleX) * 10.0D);
          f9 = (float)((double)f9 - Math.cos((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          f10 = (float)((double)f10 - Math.sin((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D); 
          this.Body.render(f5);
          this.Face.render(f5);
          this.Back.render(f5);
          this.Left.render(f5);
          this.Right.render(f5);
          this.Top.render(f5);
          this.LeftArm.render(f5);
          this.RightArm.render(f5);
          this.LeftFoot.render(f5);
          this.RightFoot.render(f5);

      GL11.glPopMatrix();
  }

  
  
  
  /**
   * Updates the rotations in the parameters for rotations greater than 180 degrees or less than -180 degrees. It adds
   * or subtracts 360 degrees, so that the appearance is the same, although the numbers are then simplified to range -
   * 180 to 180
   */
  private float updateRotations(double p_78214_1_)
  {
      while (p_78214_1_ >= 180.0D)
      {
          p_78214_1_ -= 360.0D;
      }

      while (p_78214_1_ < -180.0D)
      {
          p_78214_1_ += 360.0D;
      }

      return (float)p_78214_1_;
  }
  
  
  

  
/*  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
>>>>>>> origin/master
  {
      EntityKirby entitykirby = (EntityKirby)entity;
	     if (entitykirby.isFlying) {
      GL11.glPushMatrix();

 

      float f6 = entitykirby.prevAnimTime + (entitykirby.animTime - entitykirby.prevAnimTime) * this.partialTicks;
      //this.jaw.rotateAngleX = (float)(Math.sin((double)(f6 * (float)Math.PI * 2.0F)) + 1.0D) * 0.2F;
      float f7 = (float)(Math.sin((double)(f6 * (float)Math.PI * 2.0F - 1.0F)) + 1.0D);
      f7 = (f7 * f7 * 1.0F + f7 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, f7 - 2.0F, -3.0F);
      GL11.glRotatef(f7 * 2.0F, 1.0F, 0.0F, 0.0F);
      float f8 = -30.0F;
      float f10 = 0.0F;
      float f11 = 1.5F;
      double[] adouble = entitykirby.getMovementOffsets(6, this.partialTicks);
      float f12 = this.updateRotations(entitykirby.getMovementOffsets(5, this.partialTicks)[0] - entitykirby.getMovementOffsets(10, this.partialTicks)[0]);
      float f13 = this.updateRotations(entitykirby.getMovementOffsets(5, this.partialTicks)[0] + (double)(f12 / 2.0F));
      f8 += 2.0F;
      float f14 = f6 * (float)Math.PI * 2.0F;
      f8 = 20.0F;
      float f9 = -12.0F;
      float f15;

   
          double[] adouble1 = entitykirby.getMovementOffsets(5, this.partialTicks);
          f15 = (float)Math.cos((double)(0.45F + f14)) * 0.15F;
    /*      this.Body.rotateAngleY = this.updateRotations(adouble1[0] - adouble[0]) * (float)Math.PI / 180.0F * f11;
          this.Body.rotateAngleX = f15 + (float)(adouble1[1] - adouble[1]) * (float)Math.PI / 180.0F * f11 * 5.0F;
          this.Body.rotateAngleZ = -this.updateRotations(adouble1[0] - (double)f13) * (float)Math.PI / 180.0F * f11;
          this.Body.rotationPointY = f8;
          this.Body.rotationPointZ = f9;
          this.Body.rotationPointX = f10;*/
          f8 = (float)((double)f8 + Math.sin((double)this.Body.rotateAngleX) * 10.0D);
          f9 = (float)((double)f9 - Math.cos((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          f10 = (float)((double)f10 - Math.sin((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          //this.Body.render(f5);

    /*  double[] adouble2 = entitykirby.getMovementOffsets(0, this.partialTicks);
      
     this.Body.rotationPointY = f8;
      this.Body.rotationPointZ = f9;
      this.Body.rotationPointX = f10;
    
      this.Body.rotateAngleY = this.updateRotations(adouble2[0] - adouble[0]) * (float)Math.PI / 180.0F * 1.0F;
      this.Body.rotateAngleZ = -this.updateRotations(adouble2[0] - (double)f13) * (float)Math.PI / 180.0F * 1.0F;*/
      //this.Body.render(f5);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f12 * f11 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.Body.rotateAngleZ = 0.0F;

      
         GL11.glEnable(GL11.GL_CULL_FACE);
          f15 = f6 * (float)Math.PI * 2.0F;
          this.LeftArm.rotateAngleX = 0.125F - (float)Math.cos((double)f15) * 0.2F;
          this.LeftArm.rotateAngleY = 0.25F;
          this.LeftArm.rotateAngleZ = (float)(Math.sin((double)f15) + 0.125D) * 0.8F;
         // this.wingTip.rotateAngleZ = -((float)(Math.sin((double)(f15 + 2.0F)) + 0.5D)) * 0.75F;
         // this.rearLeg.rotateAngleX = 1.0F + f7 * 0.1F;
         // this.rearLegTip.rotateAngleX = 0.5F + f7 * 0.1F;
          this.RightFoot.rotateAngleX = 0.75F + f7 * 0.1F;
         //this.frontLeg.rotateAngleX = 1.3F + f7 * 0.1F;
         // this.frontLegTip.rotateAngleX = -0.5F - f7 * 0.1F;
          this.LeftFoot.rotateAngleX = 0.75F + f7 * 0.1F;
         // this.LeftArm.render(f5);
         // this.frontLeg.render(f5);
         // this.rearLeg.render(f5);
          GL11.glScalef(-1.0F, 1.0F, 1.0F);
          GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);

      GL11.glPopMatrix();
    GL11.glCullFace(GL11.GL_BACK);
      GL11.glDisable(GL11.GL_CULL_FACE);
      float f16 = -((float)Math.sin((double)(f6 * (float)Math.PI * 2.0F))) * 0.0F;
      f14 = f6 * (float)Math.PI * 2.0F;
      f8 = 10.0F;
      f9 = 60.0F;
      f10 = 0.0F;
      adouble = entitykirby.getMovementOffsets(11, this.partialTicks);

   
          /*adouble2 = entitykirby.getMovementOffsets(12, this.partialTicks);
          f16 = (float)((double)f16 + Math.sin((double)(0.45F + f14)) * 0.05000000074505806D);
          this.Body.rotateAngleY = (this.updateRotations(adouble2[0] - adouble[0]) * f11 + 180.0F) * (float)Math.PI / 180.0F;
          this.Body.rotateAngleX = f16 + (float)(adouble2[1] - adouble[1]) * (float)Math.PI / 180.0F * f11 * 5.0F;
          this.Body.rotateAngleZ = this.updateRotations(adouble2[0] - (double)f13) * (float)Math.PI / 180.0F * f11;
          this.Body.rotationPointY = f8;
          this.Body.rotationPointZ = f9;
          this.Body.rotationPointX = f10;*/
          f8 = (float)((double)f8 + Math.sin((double)this.Body.rotateAngleX) * 10.0D);
          f9 = (float)((double)f9 - Math.cos((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D);
          f10 = (float)((double)f10 - Math.sin((double)this.Body.rotateAngleY) * Math.cos((double)this.Body.rotateAngleX) * 10.0D); 
          this.Body.render(f5);
          this.Face.render(f5);
          this.Back.render(f5);
          this.Left.render(f5);
          this.Right.render(f5);
          this.Top.render(f5);
          this.LeftArm.render(f5);
          this.RightArm.render(f5);
          this.LeftFoot.render(f5);
          this.RightFoot.render(f5);

      GL11.glPopMatrix();
      }
      else {
    	    super.render(entity, f, f1, f2, f3, f4, f5);
    	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	    Body.render(f5);
    	    Face.render(f5);
    	    Back.render(f5);
    	    Left.render(f5);
    	    Right.render(f5);
    	    Top.render(f5);
    	    LeftArm.render(f5);
    	    RightArm.render(f5);
    	    LeftFoot.render(f5);
    	    RightFoot.render(f5);
      }
      
  }
<<<<<<< HEAD

  
  
  
  /**
   * Updates the rotations in the parameters for rotations greater than 180 degrees or less than -180 degrees. It adds
   * or subtracts 360 degrees, so that the appearance is the same, although the numbers are then simplified to range -
   * 180 to 180
   */
  private float updateRotations(double p_78214_1_)
  {
      while (p_78214_1_ >= 180.0D)
      {
          p_78214_1_ -= 360.0D;
      }

      while (p_78214_1_ < -180.0D)
      {
          p_78214_1_ += 360.0D;
      }

      return (float)p_78214_1_;
  }
  
  
  

  
/*  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {

  }
=======
>>>>>>> origin/master
*/
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
  {
         float var7 = MathHelper.sin(par2 * 3.141593F);
         float var8 = MathHelper.sin((1.0F - (1.0F - par2) * (1.0F - par2)) * 3.141593F);
         this.RightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
         this.LeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
         this.RightArm.rotateAngleZ = 0.0F;
         this.LeftArm.rotateAngleZ = 0.0F;
         this.RightFoot.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
         this.LeftFoot.rotateAngleY = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
         this.RightFoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.7F * par2;
         this.LeftFoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.7F * par2;
  }

}
