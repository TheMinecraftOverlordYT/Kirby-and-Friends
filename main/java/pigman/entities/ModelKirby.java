package pigman.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKirby extends ModelBase
{

    ModelRenderer Head;
    ModelRenderer LegR;
    ModelRenderer LegL;
    ModelRenderer ArmR;
    ModelRenderer ArmL;
  
  public ModelKirby()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-5F, 0F, -5F, 10, 10, 10);
      Head.setRotationPoint(8.881784E-16F, 12F, 1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, -0.0349066F, 0F, 0F);
      LegR = new ModelRenderer(this, 40, 10);
      LegR.addBox(-1F, 0F, -6F, 3, 2, 8);
      LegR.setRotationPoint(-4F, 22F, 0.5F);
      LegR.setTextureSize(64, 32);
      LegR.mirror = true;
      setRotation(LegR, 0F, 0.2617994F, 0F);
      LegL = new ModelRenderer(this, 40, 0);
      LegL.addBox(-1F, 0F, -6F, 3, 2, 8);
      LegL.setRotationPoint(3F, 22F, 0.5F);
      LegL.setTextureSize(64, 32);
      LegL.mirror = true;
      setRotation(LegL, 0F, -0.2617994F, 0F);
      ArmR = new ModelRenderer(this, 12, 20);
      ArmR.addBox(-3F, -1.5F, -1.5F, 3, 3, 3);
      ArmR.setRotationPoint(-4F, 18F, -1F);
      ArmR.setTextureSize(64, 32);
      ArmR.mirror = true;
      setRotation(ArmR, 0F, 0F, -0.1745329F);
      ArmL = new ModelRenderer(this, 0, 20);
      ArmL.addBox(0F, -1.5F, -1.5F, 3, 3, 3);
      ArmL.setRotationPoint(4F, 18F, -1F);
      ArmL.setTextureSize(64, 32);
      ArmL.mirror = true;
      setRotation(ArmL, 0F, 0F, 0.1745329F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    LegR.render(f5);
    LegL.render(f5);
    ArmR.render(f5);
    ArmL.render(f5);
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
