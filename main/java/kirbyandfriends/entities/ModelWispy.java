package kirbyandfriends.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWispy extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape2_1;
    ModelRenderer Shape2_2;
    ModelRenderer Shape3;
    ModelRenderer Shape3_1;
    ModelRenderer Shape3_2;
    ModelRenderer Shape3_3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape5_1;
    ModelRenderer Shape5_2;
    ModelRenderer Shape5_3;
    ModelRenderer Shape5_4;
    ModelRenderer Shape5_5;
    ModelRenderer Shape5_6;
    ModelRenderer Shape5_7;
    ModelRenderer Shape6;
  
  public ModelWispy()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      Shape1 = new ModelRenderer(this, 300, 0);
      Shape1.addBox(0F, 0F, 0F, 25, 55, 25);
      Shape1.setRotationPoint(-12F, -36F, -12F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 28, 103);
      Shape2.addBox(0F, 0F, 0F, 50, 23, 50);
      Shape2.setRotationPoint(-25F, -61F, -25F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape2_1 = new ModelRenderer(this, 0, 0);
      Shape2_1.addBox(0F, 0F, 0F, 40, 4, 40);
      Shape2_1.setRotationPoint(-19F, -38F, -19F);
      Shape2_1.setTextureSize(64, 32);
      Shape2_1.mirror = true;
      setRotation(Shape2_1, 0F, 0F, 0F);
      
      Shape2_2 = new ModelRenderer(this, 0, 0);
      Shape2_2.addBox(0F, 0F, 0F, 45, 4, 46);
      Shape2_2.setRotationPoint(-22.5F, -64F, -22.5F);
      Shape2_2.setTextureSize(64, 32);
      Shape2_2.mirror = true;
      setRotation(Shape2_2, 0F, 0F, 0F);
      
      
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 3, 17, 40);
      Shape3.setRotationPoint(-28F, -58F, -20F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      
      
      Shape3_1 = new ModelRenderer(this, 0, 0);
      Shape3_1.addBox(0F, 0F, 0F, 3, 17, 40);
      Shape3_1.setRotationPoint(25F, -58F, -20F);
      Shape3_1.setTextureSize(64, 32);
      Shape3_1.mirror = true;
      setRotation(Shape3_1, 0F, 0F, 0F);
      
      Shape3_2 = new ModelRenderer(this, 0, 0);
      Shape3_2.addBox(0F, 0F, 0F, 40, 17, 3);
      Shape3_2.setRotationPoint(-20F, -58F, 25F);
      Shape3_2.setTextureSize(64, 32);
      Shape3_2.mirror = true;
      setRotation(Shape3_2, 0F, 0F, 0F);
      
      
      Shape3_3 = new ModelRenderer(this, 0, 0);
      Shape3_3.addBox(0F, 0F, 0F, 40, 17, 3);
      Shape3_3.setRotationPoint(-19F, -58F, -27F);
      Shape3_3.setTextureSize(64, 32);
      Shape3_3.mirror = true;
      setRotation(Shape3_3, 0F, 0F, 0F);
      
      
      Shape4 = new ModelRenderer(this, 100, 60);
      Shape4.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape4.setRotationPoint(-0.5F, -17F, -23F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      
      Shape5 = new ModelRenderer(this, 100, 200);
      Shape5.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5.setRotationPoint(-3F, 19F, 5F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      
      
      Shape5_1 = new ModelRenderer(this, 100, 200);
      Shape5_1.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5_1.setRotationPoint(-3F, 19F, -27F);
      Shape5_1.setTextureSize(64, 32);
      Shape5_1.mirror = true;
      setRotation(Shape5_1, 0F, 0F, 0F);
      
      Shape5_2 = new ModelRenderer(this, 100, 200);
      Shape5_2.addBox(0F, 19F, 5F, 5, 5, 25);
      Shape5_2.setRotationPoint(0F, 0F, 0F);
      Shape5_2.setTextureSize(64, 32);
      Shape5_2.mirror = true;
      setRotation(Shape5_2, 0F, 0.6632251F, 0F);
      
      Shape5_3 = new ModelRenderer(this, 100, 200);
      Shape5_3.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5_3.setRotationPoint(-7F, 19F, 2F);
      Shape5_3.setTextureSize(64, 32);
      Shape5_3.mirror = true;
      setRotation(Shape5_3, 0F, -0.5934119F, 0F);
      
      Shape5_4 = new ModelRenderer(this, 100, 200);
      Shape5_4.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5_4.setRotationPoint(-5F, 19F, -3F);
      Shape5_4.setTextureSize(64, 32);
      Shape5_4.mirror = true;
      setRotation(Shape5_4, 0F, -1.570796F, 0F);
      
      
      Shape5_5 = new ModelRenderer(this, 100, 200);
      Shape5_5.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5_5.setRotationPoint(5F, 19F, 3F);
      Shape5_5.setTextureSize(64, 32);
      Shape5_5.mirror = true;
      setRotation(Shape5_5, 0F, 1.570796F, 0F);
      Shape5_6 = new ModelRenderer(this, 100, 200);
      Shape5_6.addBox(0F, 0F, 0F, 5, 5, 25);
      Shape5_6.setRotationPoint(6F, 19F, -3F);
      Shape5_6.setTextureSize(64, 32);
      Shape5_6.mirror = true;
      setRotation(Shape5_6, 0F, 2.216568F, 0F);
      Shape5_7 = new ModelRenderer(this, 100, 200);
      Shape5_7.addBox(0F, 19F, 5F, 5, 5, 25);
      Shape5_7.setRotationPoint(0F, 0F, 0F);
      Shape5_7.setTextureSize(64, 32);
      Shape5_7.mirror = true;
      setRotation(Shape5_7, 0F, -2.530727F, 0F);
      Shape6 = new ModelRenderer(this, 150, 65);
      Shape6.addBox(0F, 0F, 0F, 27, 4, 27);
      Shape6.setRotationPoint(-13F, 17F, -13F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape2_1.render(f5);
    Shape2_2.render(f5);
    Shape3.render(f5);
    Shape3_1.render(f5);
    Shape3_2.render(f5);
    Shape3_3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape5_1.render(f5);
    Shape5_2.render(f5);
    Shape5_3.render(f5);
    Shape5_4.render(f5);
    Shape5_5.render(f5);
    Shape5_6.render(f5);
    Shape5_7.render(f5);
    Shape6.render(f5);
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
