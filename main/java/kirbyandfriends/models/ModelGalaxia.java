package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGalaxia extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape5;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape12;
    ModelRenderer Shape11;
    ModelRenderer Shape13;
    ModelRenderer Shape15;
  
  public ModelGalaxia()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 38, 17);
      Shape1.addBox(0F, 0F, 0F, 3, 10, 3);
      Shape1.setRotationPoint(2F, 0F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 7, 2, 11);
      Shape2.setRotationPoint(0F, -2F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 22);
      Shape3.addBox(0F, 0F, 0F, 7, 2, 2);
      Shape3.setRotationPoint(0F, -4.5F, -3.5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, -0.25F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 3, 17, 3);
      Shape5.setRotationPoint(2F, -19F, 0F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 22);
      Shape4.addBox(0F, 0F, 0F, 7, 2, 2);
      Shape4.setRotationPoint(0F, -3.5F, 4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0.5F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 24, 17);
      Shape6.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape6.setRotationPoint(2F, -6F, -2.5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0.5F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 24, 17);
      Shape7.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape7.setRotationPoint(2F, -11F, -2.5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0.5F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 24, 17);
      Shape8.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape8.setRotationPoint(2F, -15F, -2.5F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0.5F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 27);
      Shape9.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape9.setRotationPoint(2F, -7F, 4F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, -0.5F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 27);
      Shape10.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape10.setRotationPoint(2F, -12F, 4F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, -0.5F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 27);
      Shape12.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape12.setRotationPoint(2F, -16F, 4F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, -0.5F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 37, 7);
      Shape11.addBox(0F, 0F, 0F, 3, 2, 1);
      Shape11.setRotationPoint(2F, -21F, 1F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 37, 0);
      Shape13.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape13.setRotationPoint(2F, -20F, 0F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 23, 25);
      Shape15.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape15.setRotationPoint(2F, -20F, 2F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape5.render(f5);
    Shape4.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape12.render(f5);
    Shape11.render(f5);
    Shape13.render(f5);
    Shape15.render(f5);
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
