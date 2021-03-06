package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBrontoBurt extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Face;
    ModelRenderer Back;
    ModelRenderer Left;
    ModelRenderer Right;
    ModelRenderer Top;
    ModelRenderer LeftFoot;
    ModelRenderer RightFoot;
    ModelRenderer LeftWingTop;
    ModelRenderer RightWing;
    ModelRenderer LeftWingBottom;
    ModelRenderer RightWingBottom;
  
  public ModelBrontoBurt()
  {
    textureWidth = 180;
    textureHeight = 180;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-10F, 0F, -10F, 20, 20, 20);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(180, 180);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 0, 41);
      Face.addBox(-9.5F, -9.5F, -1F, 19, 19, 1);
      Face.setRotationPoint(0F, 10F, -10F);
      Face.setTextureSize(180, 180);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 40, 41);
      Back.addBox(-9.5F, -9.5F, 0F, 19, 19, 1);
      Back.setRotationPoint(0F, 10F, 10F);
      Back.setTextureSize(180, 180);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      Left = new ModelRenderer(this, 0, 61);
      Left.addBox(-1F, -9.5F, -9.5F, 1, 19, 19);
      Left.setRotationPoint(-10F, 10F, 0F);
      Left.setTextureSize(180, 180);
      Left.mirror = true;
      setRotation(Left, 0F, 0F, 0F);
      Right = new ModelRenderer(this, 40, 61);
      Right.addBox(0F, -9.5F, -9.5F, 1, 19, 19);
      Right.setRotationPoint(10F, 10F, 0F);
      Right.setTextureSize(180, 180);
      Right.mirror = true;
      setRotation(Right, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 100);
      Top.addBox(-9.5F, -1F, -9.5F, 19, 1, 19);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(180, 180);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      LeftFoot = new ModelRenderer(this, 20, 121);
      LeftFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      LeftFoot.setRotationPoint(-8F, 20F, 0F);
      LeftFoot.setTextureSize(180, 180);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0.2974289F, 0F);
      RightFoot = new ModelRenderer(this, 20, 121);
      RightFoot.addBox(-3.5F, 0F, -8F, 7, 4, 9);
      RightFoot.setRotationPoint(8F, 20F, 0F);
      RightFoot.setTextureSize(180, 180);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, -0.2974216F, 0F);
      LeftWingTop = new ModelRenderer(this, 94, 0);
      LeftWingTop.addBox(0F, 0F, 0F, 3, 10, 7);
      LeftWingTop.setRotationPoint(3F, 8F, 11F);
      LeftWingTop.setTextureSize(180, 180);
      LeftWingTop.mirror = true;
      setRotation(LeftWingTop, 1.9F, 0F, 0F);
      RightWing = new ModelRenderer(this, 90, 59);
      RightWing.addBox(0F, 0F, 0F, 3, 10, 7);
      RightWing.setRotationPoint(-7F, 8F, 11F);
      RightWing.setTextureSize(180, 180);
      RightWing.mirror = true;
      setRotation(RightWing, 1.9F, 0F, 0F);
      LeftWingBottom = new ModelRenderer(this, 0, 143);
      LeftWingBottom.addBox(0F, 0F, 0F, 3, 14, 7);
      LeftWingBottom.setRotationPoint(3F, 14.5F, 13F);
      LeftWingBottom.setTextureSize(180, 180);
      LeftWingBottom.mirror = true;
      setRotation(LeftWingBottom, 1.9F, 0F, 0F);
      RightWingBottom = new ModelRenderer(this, 0, 143);
      RightWingBottom.addBox(0F, 0F, 0F, 3, 14, 7);
      RightWingBottom.setRotationPoint(-7F, 14.5F, 13F);
      RightWingBottom.setTextureSize(180, 180);
      RightWingBottom.mirror = true;
      setRotation(RightWingBottom, 1.9F, 0F, 0F);
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
    LeftFoot.render(f5);
    RightFoot.render(f5);
    LeftWingTop.render(f5);
    RightWing.render(f5);
    LeftWingBottom.render(f5);
    RightWingBottom.render(f5);
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
