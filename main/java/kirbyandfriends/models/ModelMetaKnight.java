package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMetaKnight extends ModelBase
{
  //fields
    ModelRenderer Main_Body;
    ModelRenderer Foot_1;
    ModelRenderer Foot_2;
    ModelRenderer Shoulder_1;
    ModelRenderer Shoulder_2;
    ModelRenderer Hand_1;
    ModelRenderer Hand_2;
    ModelRenderer Cape;
  
  public ModelMetaKnight()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Main_Body = new ModelRenderer(this, 0, 0);
      Main_Body.addBox(0F, 0F, 0F, 18, 18, 18);
      Main_Body.setRotationPoint(-9F, 0F, -8F);
      Main_Body.setTextureSize(256, 256);
      Main_Body.mirror = true;
      setRotation(Main_Body, 0F, 0F, 0F);
      Foot_1 = new ModelRenderer(this, 59, 50);
      Foot_1.addBox(3F, 0F, -13F, 10, 6, 14);
      Foot_1.setRotationPoint(0F, 18F, 0F);
      Foot_1.setTextureSize(256, 256);
      Foot_1.mirror = true;
      setRotation(Foot_1, 0F, 0F, 0F);
      Foot_2 = new ModelRenderer(this, 59, 50);
      Foot_2.addBox(-10F, 0F, -10F, 10, 6, 14);
      Foot_2.setRotationPoint(-2F, 18F, -3F);
      Foot_2.setTextureSize(256, 256);
      Foot_2.mirror = true;
      setRotation(Foot_2, 0F, 0F, 0F);
      Shoulder_1 = new ModelRenderer(this, 66, 100);
      Shoulder_1.addBox(0F, 0F, 0F, 10, 7, 8);
      Shoulder_1.setRotationPoint(-19F, 0F, -4F);
      Shoulder_1.setTextureSize(256, 256);
      Shoulder_1.mirror = true;
      setRotation(Shoulder_1, 0F, 0F, 0F);
      Shoulder_2 = new ModelRenderer(this, 66, 81);
      Shoulder_2.addBox(0F, 0F, 0F, 10, 7, 8);
      Shoulder_2.setRotationPoint(9F, 0F, -3F);
      Shoulder_2.setTextureSize(256, 256);
      Shoulder_2.mirror = true;
      setRotation(Shoulder_2, 0F, 0F, 0F);
      Hand_1 = new ModelRenderer(this, 0, 81);
      Hand_1.addBox(1F, 7F, 1F, 7, 7, 7);
      Hand_1.setRotationPoint(-19F, 0F, -4F);
      Hand_1.setTextureSize(256, 256);
      Hand_1.mirror = true;
      setRotation(Hand_1, 0F, 0F, 0F);
      Hand_2 = new ModelRenderer(this, 0, 52);
      Hand_2.addBox(2F, 7F, 1F, 7, 7, 7);
      Hand_2.setRotationPoint(9F, 0F, -3F);
      Hand_2.setTextureSize(256, 256);
      Hand_2.mirror = true;
      setRotation(Hand_2, 0F, 0F, 0F);
      Cape = new ModelRenderer(this, 78, 7);
      Cape.addBox(-4F, -8F, 0F, 39, 27, 1);
      Cape.setRotationPoint(-14F, 0F, 10F);
      Cape.setTextureSize(256, 256);
      Cape.mirror = true;
      setRotation(Cape, 0.418879F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Main_Body.render(f5);
    Foot_1.render(f5);
    Foot_2.render(f5);
    Shoulder_1.render(f5);
    Shoulder_2.render(f5);
    Hand_1.render(f5);
    Hand_2.render(f5);
    Cape.render(f5);
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
