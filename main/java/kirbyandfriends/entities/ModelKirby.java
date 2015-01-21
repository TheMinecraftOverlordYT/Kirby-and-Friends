package kirbyandfriends.entities;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

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
  
  public ModelKirby()
  {
    textureWidth = 512;
    textureHeight = 256;
      Body = new ModelRenderer(this, 0, 0);
    
      Body.addBox(-10F, 0F, -10F, 20, 20, 20);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(512, 256);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      
      Face = new ModelRenderer(this, 0, 41);
     
      Face.addBox(-9.5F, -9.5F, -1F, 19, 19, 1);
      Face.setRotationPoint(0F, 10F, -10F);
      Face.setTextureSize(512, 256);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
  
      Back = new ModelRenderer(this, 40, 41);

      Back.addBox(-9.5F, -9.5F, 0F, 19, 19, 1);
      Back.setRotationPoint(0F, 10F, 10F);
      Back.setTextureSize(512, 256);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);

      Left = new ModelRenderer(this, 0, 61);

      Left.addBox(-1F, -9.5F, -9.5F, 1, 19, 19);
      Left.setRotationPoint(-10F, 10F, 0F);
      Left.setTextureSize(512, 256);
      Left.mirror = true;
      setRotation(Left, 0F, 0F, 0F);
     
      Right = new ModelRenderer(this, 40, 61);

      Right.addBox(0F, -9.5F, -9.5F, 1, 19, 19);
      Right.setRotationPoint(10F, 10F, 0F);
      Right.setTextureSize(512, 256);
      Right.mirror = true;
      setRotation(Right, 0F, 0F, 0F);

      Top = new ModelRenderer(this, 0, 100);    

      Top.addBox(-9.5F, -1F, -9.5F, 19, 1, 19);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(512, 256);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
     
      LeftArm = new ModelRenderer(this, 0, 121);
 
      LeftArm.addBox(0F, -2.5F, -3.5F, 3, 10, 7);
      LeftArm.setRotationPoint(11F, 9F, -4F);
      LeftArm.setTextureSize(512, 256);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, -0.1487144F);
 
      RightArm = new ModelRenderer(this, 0, 121);
  
      RightArm.addBox(0F, -2.5F, -3.5F, 3, 10, 7);
      RightArm.setRotationPoint(-11F, 9F, -4F);
      RightArm.setTextureSize(512, 256);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 3.141593F, -0.1487144F);
   
      LeftFoot = new ModelRenderer(this, 20, 121);

      LeftFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      LeftFoot.setRotationPoint(-8F, 20F, 0F);
      LeftFoot.setTextureSize(512, 256);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0.2974289F, 0F);
      
      RightFoot = new ModelRenderer(this, 20, 121);
  
      RightFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      RightFoot.setRotationPoint(8F, 20F, 0F);
      RightFoot.setTextureSize(512, 256);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, -0.2974216F, 0F);
    
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
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
