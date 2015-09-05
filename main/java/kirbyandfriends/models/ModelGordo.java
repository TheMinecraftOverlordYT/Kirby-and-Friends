package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGordo extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Body;
    ModelRenderer BottomPlate;
    ModelRenderer Back;
    ModelRenderer BackPlate;
    ModelRenderer Top;
    ModelRenderer TopPlate;
    ModelRenderer Right;
    ModelRenderer RightPlate;
    ModelRenderer Face;
    ModelRenderer Righteye;
    ModelRenderer Left;
    ModelRenderer LeftPlate;
    ModelRenderer UpperLeft;
    ModelRenderer TopSpike;
    ModelRenderer BottomSpike;
    ModelRenderer MiddleLeft;
    ModelRenderer MiddleRight;
    ModelRenderer LowerLeft;
    ModelRenderer LowerRight;
    ModelRenderer UpperRight;
    ModelRenderer FacePad;
    ModelRenderer LeftEye;
  
  public ModelGordo()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Bottom = new ModelRenderer(this, 32, 8);
      Bottom.addBox(0F, 0F, 0F, 7, 1, 7);
      Bottom.setRotationPoint(-3.5F, 11.5F, -3.5F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 8, 8, 8);
      Body.setRotationPoint(-4F, 4F, -4F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      BottomPlate = new ModelRenderer(this, 60, 5);
      BottomPlate.addBox(0F, 0F, 0F, 4, 1, 4);
      BottomPlate.setRotationPoint(-2F, 12F, -2F);
      BottomPlate.setTextureSize(64, 32);
      BottomPlate.mirror = true;
      setRotation(BottomPlate, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 0, 16);
      Back.addBox(0F, 0F, 0F, 7, 7, 1);
      Back.setRotationPoint(-3.5F, 4.5F, 3.5F);
      Back.setTextureSize(64, 32);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      BackPlate = new ModelRenderer(this, 60, 10);
      BackPlate.addBox(0F, 0F, 0F, 4, 4, 1);
      BackPlate.setRotationPoint(-2F, 6F, 4F);
      BackPlate.setTextureSize(64, 32);
      BackPlate.mirror = true;
      setRotation(BackPlate, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 32, 0);
      Top.addBox(0F, 0F, 0F, 7, 1, 7);
      Top.setRotationPoint(-3.5F, 3.5F, -3.5F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      TopPlate = new ModelRenderer(this, 60, 0);
      TopPlate.addBox(0F, 0F, 0F, 4, 1, 4);
      TopPlate.setRotationPoint(-2F, 3F, -2F);
      TopPlate.setTextureSize(64, 32);
      TopPlate.mirror = true;
      setRotation(TopPlate, 0F, 0F, 0F);
      Right = new ModelRenderer(this, 76, 15);
      Right.addBox(0F, 0F, 0F, 1, 7, 7);
      Right.setRotationPoint(3.5F, 4.5F, -3.5F);
      Right.setTextureSize(64, 32);
      Right.mirror = true;
      setRotation(Right, 0F, 0F, 0F);
      RightPlate = new ModelRenderer(this, 40, 16);
      RightPlate.addBox(0F, 0F, 0F, 1, 4, 4);
      RightPlate.setRotationPoint(4F, 6F, -2F);
      RightPlate.setTextureSize(64, 32);
      RightPlate.mirror = true;
      setRotation(RightPlate, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 16, 16);
      Face.addBox(0F, 0F, 0F, 7, 7, 1);
      Face.setRotationPoint(-3.5F, 4.5F, -4.5F);
      Face.setTextureSize(64, 32);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      Righteye = new ModelRenderer(this, 76, 4);
      Righteye.addBox(0F, 0F, 0F, 2, 3, 1);
      Righteye.setRotationPoint(0.5F, 6.5F, -6F);
      Righteye.setTextureSize(64, 32);
      Righteye.mirror = true;
      setRotation(Righteye, 0F, -0.1745329F, 0F);
      Left = new ModelRenderer(this, 60, 15);
      Left.addBox(0F, 0F, 0F, 1, 7, 7);
      Left.setRotationPoint(-4.5F, 4.5F, -3.5F);
      Left.setTextureSize(64, 32);
      Left.mirror = true;
      setRotation(Left, 0F, 0F, 0F);
      LeftPlate = new ModelRenderer(this, 50, 16);
      LeftPlate.addBox(0F, 0F, 0F, 1, 4, 4);
      LeftPlate.setRotationPoint(-5F, 6F, -2F);
      LeftPlate.setTextureSize(64, 32);
      LeftPlate.mirror = true;
      setRotation(LeftPlate, 0F, 0F, 0F);
      UpperLeft = new ModelRenderer(this, 46, 26);
      UpperLeft.addBox(0F, 0F, 0F, 6, 1, 1);
      UpperLeft.setRotationPoint(-7.833333F, 0.1F, -0.7F);
      UpperLeft.setTextureSize(64, 32);
      UpperLeft.mirror = true;
      setRotation(UpperLeft, 0.7853982F, 0F, 0.7853982F);
      TopSpike = new ModelRenderer(this, 32, 16);
      TopSpike.addBox(0F, 0F, 0F, 1, 2, 1);
      TopSpike.setRotationPoint(-0.7F, 1F, 0F);
      TopSpike.setTextureSize(64, 32);
      TopSpike.mirror = true;
      setRotation(TopSpike, 0F, 0.7853982F, 0F);
      BottomSpike = new ModelRenderer(this, 36, 16);
      BottomSpike.addBox(0F, 0F, 0F, 1, 2, 1);
      BottomSpike.setRotationPoint(-0.7F, 13F, 0F);
      BottomSpike.setTextureSize(64, 32);
      BottomSpike.mirror = true;
      setRotation(BottomSpike, 0F, 0.7853982F, 0F);
      MiddleLeft = new ModelRenderer(this, 32, 19);
      MiddleLeft.addBox(0F, 0F, 0F, 2, 1, 1);
      MiddleLeft.setRotationPoint(-7F, 8F, -0.7F);
      MiddleLeft.setTextureSize(64, 32);
      MiddleLeft.mirror = true;
      setRotation(MiddleLeft, 0.7853982F, 0F, 0F);
      MiddleRight = new ModelRenderer(this, 32, 21);
      MiddleRight.addBox(0F, 0F, 0F, 2, 1, 1);
      MiddleRight.setRotationPoint(5F, 8F, -0.7F);
      MiddleRight.setTextureSize(64, 32);
      MiddleRight.mirror = true;
      setRotation(MiddleRight, 0.7853982F, 0F, 0F);
      LowerLeft = new ModelRenderer(this, 36, 24);
      LowerLeft.addBox(0F, 0F, 0F, 4, 1, 1);
      LowerLeft.setRotationPoint(-6.5F, 14.5F, -0.7F);
      LowerLeft.setTextureSize(64, 32);
      LowerLeft.mirror = true;
      setRotation(LowerLeft, 0.7853982F, 0F, -0.7853982F);
      LowerRight = new ModelRenderer(this, 46, 24);
      LowerRight.addBox(0F, 0F, 0F, 6, 1, 1);
      LowerRight.setRotationPoint(3.5F, 11.5F, -0.7F);
      LowerRight.setTextureSize(64, 32);
      LowerRight.mirror = true;
      setRotation(LowerRight, 0.7853982F, 0F, 0.7853982F);
      UpperRight = new ModelRenderer(this, 36, 24);
      UpperRight.addBox(0F, 0F, 0F, 4, 1, 1);
      UpperRight.setRotationPoint(3.5F, 4.5F, -0.7F);
      UpperRight.setTextureSize(64, 32);
      UpperRight.mirror = true;
      setRotation(UpperRight, 0.7853982F, 0F, -0.7853982F);
      FacePad = new ModelRenderer(this, 70, 10);
      FacePad.addBox(0F, 0F, 0F, 4, 4, 1);
      FacePad.setRotationPoint(-2F, 6F, -5F);
      FacePad.setTextureSize(64, 32);
      FacePad.mirror = true;
      setRotation(FacePad, 0F, 0F, 0F);
      LeftEye = new ModelRenderer(this, 76, 0);
      LeftEye.addBox(0F, 0F, 0F, 2, 3, 1);
      LeftEye.setRotationPoint(-2.5F, 6.5F, -6F);
      LeftEye.setTextureSize(64, 32);
      LeftEye.mirror = true;
      setRotation(LeftEye, 0F, 0.1745329F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Bottom.render(f5);
    Body.render(f5);
    BottomPlate.render(f5);
    Back.render(f5);
    BackPlate.render(f5);
    Top.render(f5);
    TopPlate.render(f5);
    Right.render(f5);
    RightPlate.render(f5);
    Face.render(f5);
    Righteye.render(f5);
    Left.render(f5);
    LeftPlate.render(f5);
    UpperLeft.render(f5);
    TopSpike.render(f5);
    BottomSpike.render(f5);
    MiddleLeft.render(f5);
    MiddleRight.render(f5);
    LowerLeft.render(f5);
    LowerRight.render(f5);
    UpperRight.render(f5);
    FacePad.render(f5);
    LeftEye.render(f5);
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
