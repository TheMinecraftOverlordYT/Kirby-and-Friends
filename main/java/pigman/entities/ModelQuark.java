
package pigman.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelQuark extends ModelBase
{

	  ModelRenderer Leftarm;
	    ModelRenderer head;
	    ModelRenderer Shape7;
	    ModelRenderer body;
	    ModelRenderer rightleg;
	    ModelRenderer leftleg;
	    ModelRenderer Leftknee;
	    ModelRenderer Rightknee;
	    ModelRenderer Rightfoot;
	    ModelRenderer Arm2;
	    ModelRenderer Arm1;
	    ModelRenderer Piece7;
	    ModelRenderer Piece8;
	    ModelRenderer Piece9;
	    ModelRenderer Piece10;
	    ModelRenderer Piece11;
	    ModelRenderer Piece12;
	    ModelRenderer Piece13;
	    ModelRenderer Piece14;
	    ModelRenderer Piece15;
	    ModelRenderer Piece16;
	    ModelRenderer Piece17;
	    ModelRenderer Piece19;
	    ModelRenderer Piece20;
	    ModelRenderer Piece21;
	    ModelRenderer Piece22;
	    ModelRenderer Leftfoot;
	  
	  public ModelQuark()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      Leftarm = new ModelRenderer(this, 72, 0);
	      Leftarm.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
	      Leftarm.setRotationPoint(4F, 8F, -6F);
	      Leftarm.setTextureSize(128, 64);
	      Leftarm.mirror = true;
	      setRotation(Leftarm, 0F, 0F, 0F);
	      head = new ModelRenderer(this, 0, 27);
	      head.addBox(-2.5F, -5F, -2.5F, 6, 6, 6);
	      head.setRotationPoint(-0.5F, -2F, -0.5F);
	      head.setTextureSize(128, 64);
	      head.mirror = true;
	      setRotation(head, 0F, 0F, 0F);
	      Shape7 = new ModelRenderer(this, 72, 0);
	      Shape7.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
	      Shape7.setRotationPoint(-4F, 8F, -6F);
	      Shape7.setTextureSize(128, 64);
	      Shape7.mirror = true;
	      setRotation(Shape7, 0F, 0F, 0F);
	      body = new ModelRenderer(this, 0, 0);
	      body.addBox(-4F, -1F, -2F, 12, 15, 12);
	      body.setRotationPoint(-2F, 0F, -4F);
	      body.setTextureSize(128, 64);
	      body.mirror = true;
	      setRotation(body, 0F, 0F, 0F);
	      rightleg = new ModelRenderer(this, 48, 21);
	      rightleg.addBox(-2F, 0F, -2F, 3, 9, 4);
	      rightleg.setRotationPoint(-2.5F, 14F, 0F);
	      rightleg.setTextureSize(128, 64);
	      rightleg.mirror = true;
	      setRotation(rightleg, 0F, 0F, 0F);
	      leftleg = new ModelRenderer(this, 48, 21);
	      leftleg.addBox(-1F, 0F, -2F, 3, 9, 4);
	      leftleg.setRotationPoint(2.5F, 14F, 0F);
	      leftleg.setTextureSize(128, 64);
	      leftleg.mirror = true;
	      setRotation(leftleg, 0F, 0F, 0F);
	      Leftknee = new ModelRenderer(this, 48, 10);
	      Leftknee.addBox(-2F, 0F, -3F, 4, 5, 6);
	      Leftknee.setRotationPoint(3F, 16F, 0F);
	      Leftknee.setTextureSize(128, 64);
	      Leftknee.mirror = true;
	      setRotation(Leftknee, 0F, 0F, 0F);
	      Rightknee = new ModelRenderer(this, 48, 10);
	      Rightknee.addBox(-2F, 0F, -3F, 4, 5, 6);
	      Rightknee.setRotationPoint(-3F, 16F, 0F);
	      Rightknee.setTextureSize(128, 64);
	      Rightknee.mirror = true;
	      setRotation(Rightknee, 0F, 0F, 0F);
	      Rightfoot = new ModelRenderer(this, 48, 0);
	      Rightfoot.addBox(-2F, 0F, -4F, 5, 2, 7);
	      Rightfoot.setRotationPoint(-3.5F, 22F, 0F);
	      Rightfoot.setTextureSize(128, 64);
	      Rightfoot.mirror = true;
	      setRotation(Rightfoot, 0F, 0F, 0F);
	      Arm2 = new ModelRenderer(this, 24, 27);
	      Arm2.addBox(-1F, -1F, -8F, 2, 2, 9);
	      Arm2.setRotationPoint(4F, 5F, -6F);
	      Arm2.setTextureSize(128, 64);
	      Arm2.mirror = true;
	      setRotation(Arm2, 0F, 0.1092638F, 0F);
	      Arm1 = new ModelRenderer(this, 24, 27);
	      Arm1.addBox(-1F, -1F, -8F, 2, 2, 9);
	      Arm1.setRotationPoint(-4F, 2F, -6F);
	      Arm1.setTextureSize(128, 64);
	      Arm1.mirror = true;
	      setRotation(Arm1, 0F, -0.1092638F, 0F);
	      Piece7 = new ModelRenderer(this, 72, 0);
	      Piece7.addBox(-1.5F, -1F, -1.5F, 3, 1, 3);
	      Piece7.setRotationPoint(0F, -7F, 0F);
	      Piece7.setTextureSize(128, 64);
	      Piece7.mirror = true;
	      setRotation(Piece7, 0F, 0F, 0F);
	      Piece8 = new ModelRenderer(this, 76, 0);
	      Piece8.addBox(-1F, -1F, -1F, 2, 1, 2);
	      Piece8.setRotationPoint(0F, -8F, 0F);
	      Piece8.setTextureSize(128, 64);
	      Piece8.mirror = true;
	      setRotation(Piece8, 0F, 0F, 0F);
	      Piece9 = new ModelRenderer(this, 72, 0);
	      Piece9.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
	      Piece9.setRotationPoint(0F, -9F, 0F);
	      Piece9.setTextureSize(128, 64);
	      Piece9.mirror = true;
	      setRotation(Piece9, 0F, 0F, 0F);
	      Piece10 = new ModelRenderer(this, 72, 0);
	      Piece10.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
	      Piece10.setRotationPoint(0F, -4F, 4F);
	      Piece10.setTextureSize(128, 64);
	      Piece10.mirror = true;
	      setRotation(Piece10, -1.570796F, 0F, 0F);
	      Piece11 = new ModelRenderer(this, 72, 0);
	      Piece11.addBox(-1F, 0F, -1F, 2, 1, 2);
	      Piece11.setRotationPoint(0F, -4F, 5F);
	      Piece11.setTextureSize(128, 64);
	      Piece11.mirror = true;
	      setRotation(Piece11, -1.570796F, 0F, 0F);
	      Piece12 = new ModelRenderer(this, 72, 0);
	      Piece12.addBox(-0.5F, -1F, -0.5F, 1, 1, 1);
	      Piece12.setRotationPoint(0F, -4F, 5F);
	      Piece12.setTextureSize(128, 64);
	      Piece12.mirror = true;
	      setRotation(Piece12, -1.570796F, 0F, 0F);
	      Piece13 = new ModelRenderer(this, 72, 0);
	      Piece13.addBox(-1F, -1F, -1F, 2, 1, 2);
	      Piece13.setRotationPoint(5F, -4F, 0F);
	      Piece13.setTextureSize(128, 64);
	      Piece13.mirror = true;
	      setRotation(Piece13, -1.570796F, -1.570796F, 0F);
	      Piece14 = new ModelRenderer(this, 72, 0);
	      Piece14.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
	      Piece14.setRotationPoint(3F, -4F, 0F);
	      Piece14.setTextureSize(128, 64);
	      Piece14.mirror = true;
	      setRotation(Piece14, -1.570796F, -1.570796F, 0F);
	      Piece15 = new ModelRenderer(this, 72, 0);
	      Piece15.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
	      Piece15.setRotationPoint(5F, -4F, 0F);
	      Piece15.setTextureSize(128, 64);
	      Piece15.mirror = true;
	      setRotation(Piece15, -1.570796F, -1.570796F, 0F);
	      Piece16 = new ModelRenderer(this, 72, 0);
	      Piece16.addBox(-0.5F, -1F, -0.5F, 1, 1, 1);
	      Piece16.setRotationPoint(-5F, -4F, 0F);
	      Piece16.setTextureSize(128, 64);
	      Piece16.mirror = true;
	      setRotation(Piece16, -1.570796F, -1.570796F, 0F);
	      Piece17 = new ModelRenderer(this, 72, 0);
	      Piece17.addBox(-1F, 0F, -1F, 2, 1, 2);
	      Piece17.setRotationPoint(-5F, -4F, 0F);
	      Piece17.setTextureSize(128, 64);
	      Piece17.mirror = true;
	      setRotation(Piece17, -1.570796F, -1.570796F, 0F);
	      Piece19 = new ModelRenderer(this, 72, 0);
	      Piece19.addBox(-1.5F, -1F, -1.5F, 3, 1, 3);
	      Piece19.setRotationPoint(-3F, -4F, 0F);
	      Piece19.setTextureSize(128, 64);
	      Piece19.mirror = true;
	      setRotation(Piece19, -1.570796F, -1.570796F, 0F);
	      Piece20 = new ModelRenderer(this, 72, 0);
	      Piece20.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
	      Piece20.setRotationPoint(0F, -4F, -5F);
	      Piece20.setTextureSize(128, 64);
	      Piece20.mirror = true;
	      setRotation(Piece20, -1.570796F, 0F, 0F);
	      Piece21 = new ModelRenderer(this, 72, 0);
	      Piece21.addBox(-1F, 0F, -1F, 2, 1, 2);
	      Piece21.setRotationPoint(0F, -4F, -4F);
	      Piece21.setTextureSize(128, 64);
	      Piece21.mirror = true;
	      setRotation(Piece21, -1.570796F, 0F, 0F);
	      Piece22 = new ModelRenderer(this, 72, 0);
	      Piece22.addBox(-1.5F, -1F, -1.5F, 3, 1, 3);
	      Piece22.setRotationPoint(0F, -4F, -4F);
	      Piece22.setTextureSize(128, 64);
	      Piece22.mirror = true;
	      setRotation(Piece22, -1.570796F, 0F, 0F);
	      Leftfoot = new ModelRenderer(this, 48, 0);
	      Leftfoot.addBox(-2.5F, 0F, -4F, 5, 2, 7);
	      Leftfoot.setRotationPoint(3F, 22F, 0F);
	      Leftfoot.setTextureSize(128, 64);
	      Leftfoot.mirror = true;
	      setRotation(Leftfoot, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Leftarm.render(f5);
	    head.render(f5);
	    Shape7.render(f5);
	    body.render(f5);
	    rightleg.render(f5);
	    leftleg.render(f5);
	    Leftknee.render(f5);
	    Rightknee.render(f5);
	    Rightfoot.render(f5);
	    Arm2.render(f5);
	    Arm1.render(f5);
	    Piece7.render(f5);
	    Piece8.render(f5);
	    Piece9.render(f5);
	    Piece10.render(f5);
	    Piece11.render(f5);
	    Piece12.render(f5);
	    Piece13.render(f5);
	    Piece14.render(f5);
	    Piece15.render(f5);
	    Piece16.render(f5);
	    Piece17.render(f5);
	    Piece19.render(f5);
	    Piece20.render(f5);
	    Piece21.render(f5);
	    Piece22.render(f5);
	    Leftfoot.render(f5);
	  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
