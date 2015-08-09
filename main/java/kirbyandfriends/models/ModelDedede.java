package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDedede extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape5;
    ModelRenderer Shape51;
    ModelRenderer Shape53;
    ModelRenderer Shape52;
    ModelRenderer Shape54;
    ModelRenderer Shape55;
    ModelRenderer Shape56;
    ModelRenderer Shape57;
    ModelRenderer Shape58;
    ModelRenderer Shape59;
    ModelRenderer Shape61;
    ModelRenderer Shape60;
    ModelRenderer Shape62;
    ModelRenderer Shape63;
    ModelRenderer Shape64;
    ModelRenderer Shape65;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer beak;
  
  public ModelDedede()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      Shape1 = new ModelRenderer(this, 200, 150);
      Shape1.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape1.setRotationPoint(-4F, -2F, -4F);
      Shape1.setTextureSize(512, 256);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 60, 60);
      Shape2.addBox(0F, -1F, 0F, 2, 2, 2);
      Shape2.setRotationPoint(-1F, -3F, -1F);
      Shape2.setTextureSize(512, 256);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape5 = new ModelRenderer(this, 100, 100);
      Shape5.addBox(0F, 0F, 0F, 4, 2, 1);
      Shape5.setRotationPoint(-2F, -3F, -5F);
      Shape5.setTextureSize(512, 256);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape51 = new ModelRenderer(this, 400, 2);
      Shape51.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape51.setRotationPoint(-4F, 4F, -6F);
      Shape51.setTextureSize(512, 256);
      Shape51.mirror = true;
      setRotation(Shape51, 0F, 0F, 0F);
      Shape53 = new ModelRenderer(this, 123, 234);
      Shape53.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape53.setRotationPoint(-2F, 7F, -6F);
      Shape53.setTextureSize(512, 256);
      Shape53.mirror = true;
      setRotation(Shape53, 0F, 0F, 0F);
      Shape52 = new ModelRenderer(this, 256, 100);
      Shape52.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape52.setRotationPoint(-4F, 5F, -6F);
      Shape52.setTextureSize(512, 256);
      Shape52.mirror = true;
      setRotation(Shape52, 0F, 0F, 0F);
      Shape54 = new ModelRenderer(this, 23, 245);
      Shape54.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape54.setRotationPoint(2F, 5F, -6F);
      Shape54.setTextureSize(512, 256);
      Shape54.mirror = true;
      setRotation(Shape54, 0F, 0F, 0F);
      Shape55 = new ModelRenderer(this, 400, 123);
      Shape55.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape55.setRotationPoint(-3F, 6F, -6F);
      Shape55.setTextureSize(512, 256);
      Shape55.mirror = true;
      setRotation(Shape55, 0F, 0F, 0F);
      Shape56 = new ModelRenderer(this, 200, 25);
      Shape56.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape56.setRotationPoint(1F, 6F, -6F);
      Shape56.setTextureSize(512, 256);
      Shape56.mirror = true;
      setRotation(Shape56, 0F, 0F, 0F);
      Shape57 = new ModelRenderer(this, 300, 9);
      Shape57.addBox(0F, 0F, 0F, 8, 5, 1);
      Shape57.setRotationPoint(-4F, 3F, 5F);
      Shape57.setTextureSize(512, 256);
      Shape57.mirror = true;
      setRotation(Shape57, 0F, 0F, 0F);
      Shape58 = new ModelRenderer(this, 200, 180);
      Shape58.addBox(0F, 0F, 0F, 3, 4, 1);
      Shape58.setRotationPoint(-7F, 4F, 5F);
      Shape58.setTextureSize(512, 256);
      Shape58.mirror = true;
      setRotation(Shape58, 0F, 0F, 0F);
      Shape59 = new ModelRenderer(this, 300, 189);
      Shape59.addBox(0F, 0F, 0F, 3, 4, 1);
      Shape59.setRotationPoint(4F, 4F, 5F);
      Shape59.setTextureSize(512, 256);
      Shape59.mirror = true;
      setRotation(Shape59, 0F, 0F, 0F);
      Shape61 = new ModelRenderer(this, 0, 0);
      Shape61.addBox(0F, 0F, 0F, 2, 3, 5);
      Shape61.setRotationPoint(-7F, 5F, 0F);
      Shape61.setTextureSize(512, 256);
      Shape61.mirror = true;
      setRotation(Shape61, 0F, 0F, 0F);
      Shape60 = new ModelRenderer(this, 0, 0);
      Shape60.addBox(0F, 0F, 0F, 2, 3, 5);
      Shape60.setRotationPoint(5F, 5F, 0F);
      Shape60.setTextureSize(512, 256);
      Shape60.mirror = true;
      setRotation(Shape60, 0F, 0F, 0F);
      Shape62 = new ModelRenderer(this, 0, 0);
      Shape62.addBox(-6F, 1F, -2F, 2, 2, 2);
      Shape62.setRotationPoint(-1F, 5F, 0F);
      Shape62.setTextureSize(512, 256);
      Shape62.mirror = true;
      setRotation(Shape62, 0F, 0F, 0F);
      Shape63 = new ModelRenderer(this, 0, 0);
      Shape63.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape63.setRotationPoint(5F, 6F, -2F);
      Shape63.setTextureSize(512, 256);
      Shape63.mirror = true;
      setRotation(Shape63, 0F, 0F, 0F);
      Shape64 = new ModelRenderer(this, 0, 0);
      Shape64.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape64.setRotationPoint(-7F, 7F, -5F);
      Shape64.setTextureSize(512, 256);
      Shape64.mirror = true;
      setRotation(Shape64, 0F, 0F, 0F);
      Shape65 = new ModelRenderer(this, 0, 0);
      Shape65.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape65.setRotationPoint(5F, 7F, -5F);
      Shape65.setTextureSize(512, 256);
      Shape65.mirror = true;
      setRotation(Shape65, 0F, 0F, 0F);
    
      head = new ModelRenderer(this, 300, 200);
      head.addBox(-4F, -8F, -4F, 10, 9, 10);
      head.setRotationPoint(-1F, 7F, -1F);
      head.setTextureSize(512, 256);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      body = new ModelRenderer(this, 200, 200);
      body.addBox(-4F, 0F, -2F, 14, 14, 12);
      body.setRotationPoint(-3F, 8F, -4F);
      body.setTextureSize(512, 256);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-8F, 10F, 0F);
      rightarm.setTextureSize(512, 256);
      rightarm.mirror = true;
      setRotation(rightarm, -1.264073F, 0F, 0F);
      leftarm = new ModelRenderer(this, 400, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(8F, 10F, 0F);
      leftarm.setTextureSize(512, 256);
      leftarm.mirror = true;
      setRotation(leftarm, -2.49169F, 0F, 0F);
      rightfoot = new ModelRenderer(this, 0, 16);
      rightfoot.addBox(-2F, 0F, -2F, 5, 2, 11);
      rightfoot.setRotationPoint(-5F, 22F, -7F);
      rightfoot.setTextureSize(512, 256);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0.3665191F, 0F);
      leftfoot = new ModelRenderer(this, 0, 16);
      leftfoot.addBox(-2F, 0F, -2F, 5, 2, 11);
      leftfoot.setRotationPoint(4F, 22F, -7F);
      leftfoot.setTextureSize(512, 256);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, -0.4363323F, 0F);
      beak = new ModelRenderer(this, 100, 200);
      beak.addBox(0F, 3F, 0F, 2, 2, 2);
      beak.setRotationPoint(-1F, -1F, -7F);
      beak.setTextureSize(512, 256);
      beak.mirror = true;
      setRotation(beak, 0F, 0F, 0F);
      
      //convertToChild(head,hat_top);
     // convertToChild(head,hatmain);
     // convertToChild(head,crown);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape5.render(f5);
    Shape51.render(f5);
    Shape53.render(f5);
    Shape52.render(f5);
    Shape54.render(f5);
    Shape55.render(f5);
    Shape56.render(f5);
    Shape57.render(f5);
    Shape58.render(f5);
    Shape59.render(f5);
    Shape61.render(f5);
    Shape60.render(f5);
    Shape62.render(f5);
    Shape63.render(f5);
    Shape64.render(f5);
    Shape65.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightfoot.render(f5);
    leftfoot.render(f5);
    beak.render(f5);
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
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    //this.hatmain.rotateAngleY = this.head.rotateAngleY;
    //this.hatmain.rotateAngleX = this.head.rotateAngleX;
 //   mouth_one.rotateAngleX = head.rotateAngleX;
    //mouth_top.rotateAngleX = head.rotateAngleX;
  //  mouthbottom.rotateAngleX = head.rotateAngleX;
    
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
  //  this.rightarm.rotateAngleZ = 0.0F;
   // this.leftarm.rotateAngleZ = 0.0F;
  //  this.stick.rotateAngleX = this.leftarm.rotateAngleX; 
   // this.stick.rotateAngleY = this.leftarm.rotateAngleY;
    
  //  this.hammer_top.rotateAngleX = this.leftarm.rotateAngleX;
    //this.hammer_top.rotateAngleY = this.leftarm.rotateAngleY;
  
    this.rightfoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftfoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
   // this.rightfoot.rotateAngleY = 0.0F;
    //this.leftfoot.rotateAngleY = 0.0F;
  }

  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
    // move child rotation point to be relative to parent
    parChild.rotationPointX -= parParent.rotationPointX;
    parChild.rotationPointY -= parParent.rotationPointY;
    parChild.rotationPointZ -= parParent.rotationPointZ;
    // make rotations relative to parent
    parChild.rotateAngleX -= parParent.rotateAngleX;
    parChild.rotateAngleY -= parParent.rotateAngleY;
    parChild.rotateAngleZ -= parParent.rotateAngleZ;
    // create relationship
    parParent.addChild(parChild);
  }
}





/*package kirbyandfriends.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDedede extends ModelBase
{
  //fields
    ModelRenderer hatmain;
    ModelRenderer hat_top;
    ModelRenderer stick;
    ModelRenderer hammer_top;
    ModelRenderer crown;
    ModelRenderer mouth_top;
    ModelRenderer mouthbottom;
    ModelRenderer mouth_left_corner;
    ModelRenderer mouth_left_center;
    ModelRenderer mouth_right_corner;
    ModelRenderer mouth_one;
    ModelRenderer back_piece_2;
    ModelRenderer back_piece_1;
    ModelRenderer back_piece_21;
    ModelRenderer right_shoulder_1;
    ModelRenderer right_shoulder_2;
    ModelRenderer mouth_right_center;
    ModelRenderer left_shoulder_1;
    ModelRenderer left_shoulder_2;
    ModelRenderer left_shoulder_3;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer beak;
  
  public ModelDedede()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      hatmain = new ModelRenderer(this, 200, 150);
      hatmain.addBox(0F, 0F, 0F, 8, 1, 8);
      hatmain.setRotationPoint(-4F, -2F, -4F);
      hatmain.setTextureSize(512, 256);
      hatmain.mirror = true;
      setRotation(hatmain, 0F, 0F, 0F);
      
      hat_top = new ModelRenderer(this, 60, 60);
      hat_top.addBox(0F, -1F, 0F, 2, 2, 2);
      hat_top.setRotationPoint(-1F, -3F, -1F);
      hat_top.setTextureSize(512, 256);
      hat_top.mirror = true;
      setRotation(hat_top, 0F, 0F, 0F);
      
      stick = new ModelRenderer(this, 100, 100);
      stick.addBox(0F, -15F, 0F, 2, 20, 2);
      stick.setRotationPoint(8.5F, -5F, 3F);
      stick.setTextureSize(512, 256);
      stick.mirror = true;
      setRotation(stick, 2.478368F, 0F, 0F);
      //stick.offsetZ = 0.10F;
      
      
      hammer_top = new ModelRenderer(this, 100, 0);
      hammer_top.addBox(0F, -2F, 0F, 8, 8, 16);
      hammer_top.setRotationPoint(5.5F, -5F, 12F);
      hammer_top.setTextureSize(512, 256);
      hammer_top.mirror = true;
      setRotation(hammer_top, 2.565634F, 0F, 0F);
      hammer_top.offsetY = -0.50F; 
      
      crown = new ModelRenderer(this, 100, 100);
      crown.addBox(0F, 0F, 0F, 4, 2, 1);
      crown.setRotationPoint(-2F, -3F, -5F);
      crown.setTextureSize(512, 256);
      crown.mirror = true;
      setRotation(crown, 0F, 0F, 0F);
      
      mouth_top = new ModelRenderer(this, 400, 2);
      mouth_top.addBox(0F, 0F, 0F, 8, 1, 1);
      mouth_top.setRotationPoint(-4F, 4F, -6F);
      mouth_top.setTextureSize(512, 256);
      mouth_top.mirror = true;
      setRotation(mouth_top, 0F, 0F, 0F);
      
      mouthbottom = new ModelRenderer(this, 123, 234);
      mouthbottom.addBox(0F, 0F, 0F, 4, 1, 1);
      mouthbottom.setRotationPoint(-2F, 7F, -6F);
      mouthbottom.setTextureSize(512, 256);
      mouthbottom.mirror = true;
      setRotation(mouthbottom, 0F, 0F, 0F);
      
      mouth_left_corner = new ModelRenderer(this, 256, 100);
      mouth_left_corner.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_left_corner.setRotationPoint(-4F, 5F, -6F);
      mouth_left_corner.setTextureSize(512, 256);
      mouth_left_corner.mirror = true;
      setRotation(mouth_left_corner, 0F, 0F, 0F);
      
      mouth_left_center = new ModelRenderer(this, 23, 245);
      mouth_left_center.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_left_center.setRotationPoint(2F, 5F, -6F);
      mouth_left_center.setTextureSize(512, 256);
      mouth_left_center.mirror = true;
      setRotation(mouth_left_center, 0F, 0F, 0F);
      
      mouth_right_corner = new ModelRenderer(this, 400, 123);
      mouth_right_corner.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_right_corner.setRotationPoint(-3F, 6F, -6F);
      mouth_right_corner.setTextureSize(512, 256);
      mouth_right_corner.mirror = true;
      setRotation(mouth_right_corner, 0F, 0F, 0F);
      
      mouth_one = new ModelRenderer(this, 200, 25);
      mouth_one.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_one.setRotationPoint(1F, 6F, -6F);
      mouth_one.setTextureSize(512, 256);
      mouth_one.mirror = true;
      mouth_one.offsetY = -0.05F;
      setRotation(mouth_one, 0F, 0F, 0F);
      
      back_piece_2 = new ModelRenderer(this, 300, 9);
      back_piece_2.addBox(0F, 0F, 0F, 8, 5, 1);
      back_piece_2.setRotationPoint(-4F, 3F, 5F);
      back_piece_2.setTextureSize(512, 256);
      back_piece_2.mirror = true;
      setRotation(back_piece_2, 0F, 0F, 0F);
      
      back_piece_1 = new ModelRenderer(this, 200, 180);
      back_piece_1.addBox(0F, 0F, 0F, 3, 4, 1);
      back_piece_1.setRotationPoint(-7F, 4F, 5F);
      back_piece_1.setTextureSize(512, 256);
      back_piece_1.mirror = true;
      setRotation(back_piece_1, 0F, 0F, 0F);
      
      back_piece_21 = new ModelRenderer(this, 300, 189);
      back_piece_21.addBox(0F, 0F, 0F, 3, 4, 1);
      back_piece_21.setRotationPoint(4F, 4F, 5F);
      back_piece_21.setTextureSize(512, 256);
      back_piece_21.mirror = true;
      setRotation(back_piece_21, 0F, 0F, 0F);
      
      right_shoulder_1 = new ModelRenderer(this, 0, 0);
      right_shoulder_1.addBox(0F, 0F, 0F, 2, 3, 5);
      right_shoulder_1.setRotationPoint(-7F, 5F, 0F);
      right_shoulder_1.setTextureSize(512, 256);
      right_shoulder_1.mirror = true;
      setRotation(right_shoulder_1, 0F, 0F, 0F);
      
      right_shoulder_2 = new ModelRenderer(this, 0, 0);
      right_shoulder_2.addBox(0F, 0F, 0F, 2, 3, 5);
      right_shoulder_2.setRotationPoint(5F, 5F, 0F);
      right_shoulder_2.setTextureSize(512, 256);
      right_shoulder_2.mirror = true;
      setRotation(right_shoulder_2, 0F, 0F, 0F);
      
      mouth_right_center = new ModelRenderer(this, 0, 0);
      mouth_right_center.addBox(-6F, 1F, -2F, 2, 2, 2);
      mouth_right_center.setRotationPoint(-1F, 5F, 0F);
      mouth_right_center.setTextureSize(512, 256);
      mouth_right_center.mirror = true;
      setRotation(mouth_right_center, 0F, 0F, 0F);
      
      left_shoulder_1 = new ModelRenderer(this, 0, 0);
      left_shoulder_1.addBox(0F, 0F, 0F, 2, 2, 2);
      left_shoulder_1.setRotationPoint(5F, 6F, -2F);
      left_shoulder_1.setTextureSize(512, 256);
      left_shoulder_1.mirror = true;
      setRotation(left_shoulder_1, 0F, 0F, 0F);
      
      left_shoulder_2 = new ModelRenderer(this, 0, 0);
      left_shoulder_2.addBox(0F, 0F, 0F, 2, 1, 3);
      left_shoulder_2.setRotationPoint(-7F, 7F, -5F);
      left_shoulder_2.setTextureSize(512, 256);
      left_shoulder_2.mirror = true;
      setRotation(left_shoulder_2, 0F, 0F, 0F);
      
      left_shoulder_3 = new ModelRenderer(this, 0, 0);
      left_shoulder_3.addBox(0F, 0F, 0F, 2, 1, 3);
      left_shoulder_3.setRotationPoint(5F, 7F, -5F);
      left_shoulder_3.setTextureSize(512, 256);
      left_shoulder_3.mirror = true;
      setRotation(left_shoulder_3, 0F, 0F, 0F);
    
      head = new ModelRenderer(this, 300, 200);
      head.addBox(-4F, -8F, -4F, 10, 9, 10);
      head.setRotationPoint(-1F, 7F, -1F);
      head.setTextureSize(512, 256);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      body = new ModelRenderer(this, 200, 200);
      body.addBox(-4F, 0F, -2F, 14, 14, 12);
      body.setRotationPoint(-3F, 8F, -4F);
      body.setTextureSize(512, 256);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-8F, 10F, 0F);
      rightarm.setTextureSize(512, 256);
      rightarm.mirror = true;
      setRotation(rightarm, -1.264073F, 0F, 0F);
      leftarm = new ModelRenderer(this, 400, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(8F, 10F, 0F);
      leftarm.setTextureSize(512, 256);
      leftarm.mirror = true;
      setRotation(leftarm, -2.49169F, 0F, 0F);
      rightfoot = new ModelRenderer(this, 0, 16);
      rightfoot.addBox(-2F, 0F, -2F, 5, 2, 11);
      rightfoot.setRotationPoint(-5F, 22F, -7F);
      rightfoot.setTextureSize(512, 256);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0.3665191F, 0F);
      leftfoot = new ModelRenderer(this, 0, 16);
      leftfoot.addBox(-2F, 0F, -2F, 5, 2, 11);
      leftfoot.setRotationPoint(4F, 22F, -7F);
      leftfoot.setTextureSize(512, 256);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, -0.4363323F, 0F);
      beak = new ModelRenderer(this, 100, 200);
      beak.addBox(0F, 3F, 0F, 2, 2, 2);
      beak.setRotationPoint(-1F, -1F, -7F);
      beak.setTextureSize(512, 256);
      beak.mirror = true;
      setRotation(beak, 0F, 0F, 0F);
      
      convertToChild(head,hat_top);
      convertToChild(head,hatmain);
      convertToChild(head,crown);
     
      convertToChild(head,beak);
      convertToChild(beak,mouth_one);
    convertToChild(head,mouth_left_center);
      convertToChild(head,mouth_left_corner);
      convertToChild(head,mouth_right_center);
      convertToChild(head,mouth_right_corner);
      convertToChild(head,mouthbottom);

     
     
  

      convertToChild(leftarm,stick);
      convertToChild(stick,hammer_top);
      convertToChild(leftarm,left_shoulder_1);
      convertToChild(leftarm,left_shoulder_2);
      convertToChild(leftarm,left_shoulder_3);
  
      
      convertToChild(rightarm,right_shoulder_1);
      convertToChild(rightarm,right_shoulder_2);
      convertToChild(rightarm,back_piece_2);
      convertToChild(rightarm,back_piece_21);
  }
  

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightfoot.render(f5);
    leftfoot.render(f5);
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
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    //this.hatmain.rotateAngleY = this.head.rotateAngleY;
    //this.hatmain.rotateAngleX = this.head.rotateAngleX;
 //   mouth_one.rotateAngleX = head.rotateAngleX;
    //mouth_top.rotateAngleX = head.rotateAngleX;
  //  mouthbottom.rotateAngleX = head.rotateAngleX;
    
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
  //  this.rightarm.rotateAngleZ = 0.0F;
   // this.leftarm.rotateAngleZ = 0.0F;
    this.stick.rotateAngleX = this.leftarm.rotateAngleX; 
    this.stick.rotateAngleY = this.leftarm.rotateAngleY;
    
    this.hammer_top.rotateAngleX = this.leftarm.rotateAngleX;
    this.hammer_top.rotateAngleY = this.leftarm.rotateAngleY;
  
    this.rightfoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftfoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
   // this.rightfoot.rotateAngleY = 0.0F;
    //this.leftfoot.rotateAngleY = 0.0F;
  }
  

  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
    // move child rotation point to be relative to parent
    parChild.rotationPointX -= parParent.rotationPointX;
    parChild.rotationPointY -= parParent.rotationPointY;
    parChild.rotationPointZ -= parParent.rotationPointZ;
    // make rotations relative to parent
    parChild.rotateAngleX -= parParent.rotateAngleX;
    parChild.rotateAngleY -= parParent.rotateAngleY;
    parChild.rotateAngleZ -= parParent.rotateAngleZ;
    // create relationship
    parParent.addChild(parChild);
  }

}*/




/*package kirbyandfriends.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDedede extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer beak1;
    ModelRenderer rightshouldpiece1;
    ModelRenderer leftshoulderpiece1;
    ModelRenderer rightshoulderpiece2;
    ModelRenderer leftshouldertwo;
    ModelRenderer rightshoulderpiece4;
    ModelRenderer leftshoulder3;
    ModelRenderer backpiece1;
    ModelRenderer backpiece3;
    ModelRenderer backpiece2;
    ModelRenderer mouthleftcenter;
    ModelRenderer mouthrightcenter;
    ModelRenderer mouthleftcorner;
    ModelRenderer mouthrightcorner;
    ModelRenderer mouthbottom;
    ModelRenderer mouthtop;
    ModelRenderer crown;
    ModelRenderer hammertop;
    ModelRenderer hammerstick;
    ModelRenderer topper;
    ModelRenderer hatmain;
  
  public ModelDedede()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      head = new ModelRenderer(this, 300, 200);
      head.addBox(0F, 0F, 0F, 10, 9, 10);
      head.setRotationPoint(-5F, -1F, -5F);
      head.setTextureSize(512, 256);
      setRotation(head, 0F, 0F, 0F);
      head.mirror = true;
      
      
      body = new ModelRenderer(this, 200, 200);
      body.addBox(0F, 0F, 0F, 14, 14, 12);
      body.setRotationPoint(-7F, 8F, -8F);
      body.setTextureSize(512, 256);
      setRotation(body, 0F, 0F, 0F);
      body.mirror = true;
      
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(0F, 0F, 0F, 4, 12, 4);
      rightarm.setRotationPoint(-11F, 8F, -2F);
      rightarm.setTextureSize(512, 256);
      setRotation(rightarm, -0.3333333F, 0F, 0F);
      rightarm.mirror = true;
     
      leftarm = new ModelRenderer(this, 400, 16);
      leftarm.addBox(0F, 0F, 0F, 4, 12, 4);
      leftarm.setRotationPoint(7F, 12F, 0F);
      leftarm.setTextureSize(512, 256);
      setRotation(leftarm, -2.49169F, 0F, 0F);
      leftarm.mirror = true;
      
      rightfoot = new ModelRenderer(this, 0, 16);
      rightfoot.addBox(-5F, 22F, -7F, 5, 2, 11);
      rightfoot.setRotationPoint(-2F, 0F, -2F);
      rightfoot.setTextureSize(512, 256);
      setRotation(rightfoot, 0F, 0.3665191F, 0F);
      rightfoot.mirror = true;
     
      leftfoot = new ModelRenderer(this, 0, 16);
      leftfoot.addBox(0F, 0F, 0F, 5, 2, 11);
      leftfoot.setRotationPoint(2F, 22F, -9F);
      leftfoot.setTextureSize(512, 256);
      setRotation(leftfoot, 0F, -0.4363323F, 0F);
      leftfoot.mirror = true;
      
      
      beak1 = new ModelRenderer(this, 100, 200);
      beak1.addBox(-1F, -1F, -7F, 2, 2, 2);
      beak1.setRotationPoint(0F, 3F, 0F);
      beak1.setTextureSize(512, 256);
      setRotation(beak1, 0F, 0F, 0F);
      beak1.mirror = true;
      
      rightshouldpiece1 = new ModelRenderer(this, 0, 0);
      rightshouldpiece1.addBox(5F, 7F, -5F, 2, 1, 3);
      rightshouldpiece1.setRotationPoint(0F, 0F, 0F);
      rightshouldpiece1.setTextureSize(512, 256);
      rightshouldpiece1.mirror = true;
      setRotation(rightshouldpiece1, 0F, 0F, 0F);
   
      leftshoulderpiece1 = new ModelRenderer(this, 0, 0);
      leftshoulderpiece1.addBox(0F, 0F, 0F, 2, 2, 2);
      leftshoulderpiece1.setRotationPoint(-7F, 5F, -2F);
      leftshoulderpiece1.setTextureSize(512, 256);
      setRotation(leftshoulderpiece1, 0F, 0F, 0F);
      leftshoulderpiece1.mirror = true;
      
      rightshoulderpiece2 = new ModelRenderer(this, 0, 0);
      rightshoulderpiece2.addBox(5F, 6F, -2F, 2, 2, 2);
      rightshoulderpiece2.setRotationPoint(0F, 0F, 0F);
      rightshoulderpiece2.setTextureSize(512, 256);
      rightshoulderpiece2.mirror = true;
      setRotation(rightshoulderpiece2, 0F, 0F, 0F);
      
      leftshouldertwo = new ModelRenderer(this, 0, 0);
      leftshouldertwo.addBox(-1F, 5F, 0F, 2, 2, 2);
      leftshouldertwo.setRotationPoint(-6F, 1F, -2F);
      leftshouldertwo.setTextureSize(512, 256);
      setRotation(leftshouldertwo, 0F, 0F, 0F);
      leftshouldertwo.mirror = true;
      
      rightshoulderpiece4 = new ModelRenderer(this, 0, 0);
      rightshoulderpiece4.addBox(0F, 0F, 0F, 2, 3, 5);
      rightshoulderpiece4.setRotationPoint(5F, 5F, 0F);
      rightshoulderpiece4.setTextureSize(512, 256);
      rightshoulderpiece4.mirror = true;
      setRotation(rightshoulderpiece4, 0F, 0F, 0F);
      
      leftshoulder3 = new ModelRenderer(this, 0, 0);
      leftshoulder3.addBox(0F, 0F, 0F, 2, 3, 5);
      leftshoulder3.setRotationPoint(-7F, 5F, 0F);
      leftshoulder3.setTextureSize(512, 256);
      setRotation(leftshoulder3, 0F, 0F, 0F);
      leftshoulder3.mirror = true;
      
      backpiece1 = new ModelRenderer(this, 300, 189);
      backpiece1.addBox(0F, 0F, 0F, 3, 4, 1);
      backpiece1.setRotationPoint(4F, 4F, 5F);
      backpiece1.setTextureSize(512, 256);
      setRotation(backpiece1, 0F, 0F, 0F);
      backpiece1.mirror = true;
      
      backpiece3 = new ModelRenderer(this, 300, 189);
      backpiece3.addBox(0F, 0F, 0F, 3, 4, 1);
      backpiece3.setRotationPoint(-7F, 4F, 5F);
      backpiece3.setTextureSize(512, 256);
      setRotation(backpiece3, 0F, 0F, 0F);
      backpiece3.mirror = true;
      
      
      backpiece2 = new ModelRenderer(this, 300, 9);
      backpiece2.addBox(0F, 0F, 0F, 8, 5, 1);
      backpiece2.setRotationPoint(-4F, 3F, 5F);
      backpiece2.setTextureSize(512, 256);
      setRotation(backpiece2, 0F, 0F, 0F);
      backpiece2.mirror = true;
      
      mouthleftcenter = new ModelRenderer(this, 200, 25);
      mouthleftcenter.addBox(0F, 0F, 0F, 2, 1, 1);
      mouthleftcenter.setRotationPoint(1F, 6F, -6F);
      mouthleftcenter.setTextureSize(512, 256);
      mouthleftcenter.mirror = true;
      setRotation(mouthleftcenter, 0F, 0F, 0F);
      
      mouthrightcenter = new ModelRenderer(this, 400, 123);
      mouthrightcenter.addBox(0F, 0F, 0F, 2, 1, 1);
      mouthrightcenter.setRotationPoint(-3F, 6F, -6F);
      mouthrightcenter.setTextureSize(512, 256);
     setRotation(mouthrightcenter, 0F, 0F, 0F);
      mouthrightcenter.mirror = true;
      
      mouthleftcorner = new ModelRenderer(this, 23, 245);
      mouthleftcorner.addBox(2F, 5F, -6F, 2, 1, 1);
      mouthleftcorner.setRotationPoint(0F, 0F, 0F);
      mouthleftcorner.setTextureSize(512, 256);
      mouthleftcorner.mirror = true;
      setRotation(mouthleftcorner, 0F, 0F, 0F);
      
      mouthrightcorner = new ModelRenderer(this, 200, 25);
      mouthrightcorner.addBox(0F, 0F, 0F, 2, 1, 1);
      mouthrightcorner.setRotationPoint(-4F, 5F, -6F);
      mouthrightcorner.setTextureSize(512, 256);
      mouthrightcorner.mirror = true;
      setRotation(mouthrightcorner, 0F, 0F, 0F);
      
      mouthbottom = new ModelRenderer(this, 123, 234);
      mouthbottom.addBox(0F, 0F, 0F, 4, 1, 1);
      mouthbottom.setRotationPoint(-2F, 7F, -6F);
      mouthbottom.setTextureSize(512, 256);
      mouthbottom.mirror = true;
      setRotation(mouthbottom, 0F, 0F, 0F);
      
      mouthtop = new ModelRenderer(this, 400, 2);
      mouthtop.addBox(0F, 0F, 0F, 8, 1, 1);
      mouthtop.setRotationPoint(-4F, 4F, -6F);
      mouthtop.setTextureSize(512, 256);
      mouthtop.mirror = true;
      setRotation(mouthtop, 0F, 0F, 0F);
      

      crown = new ModelRenderer(this, 100, 100);
      crown.addBox(0F, 0F, 0F, 4, 2, 1);
      crown.setRotationPoint(-2F, -3F, -5F);
      crown.setTextureSize(512, 256);
      setRotation(crown, 0F, 0F, 0F);
      crown.mirror = true;
      

      hammertop = new ModelRenderer(this, 100, 0);
      hammertop.addBox(0F, 0F, 0F, 8, 8, 16);
      hammertop.setRotationPoint(4.5F, -6F, 8F);
      hammertop.setTextureSize(512, 256);
      setRotation(hammertop, 2.565634F, 0F, 0F);
      hammertop.mirror = true;
      
      hammerstick = new ModelRenderer(this, 100, 100);
      hammerstick.addBox(0F, 0F, 0F, 2, 20, 2);
      hammerstick.setRotationPoint(8F, 7F, -9F);
      hammerstick.setTextureSize(512, 256);
      setRotation(hammerstick, 2.565634F, 0F, 0F);
      hammerstick.mirror = true;
      
      
      topper = new ModelRenderer(this, 60, 60);
      topper.addBox(-1F, -3F, -1F, 2, 2, 2);
      topper.setRotationPoint(0F, -1F, 0F);
      topper.setTextureSize(512, 256);
      setRotation(topper, 0F, 0F, 0F);
      topper.mirror = true;
      
      hatmain = new ModelRenderer(this, 200, 150);
      hatmain.addBox(0F, 0F, 0F, 8, 1, 8);
      hatmain.setRotationPoint(-4F, -2F, -4F);
      hatmain.setTextureSize(512, 256);
      setRotation(hatmain, 0F, 0F, 0F);
      hatmain.mirror = true;
      
      convertToChild(head,topper);
      convertToChild(head,crown);
      convertToChild(head,hatmain);
      convertToChild(head,beak1);
      convertToChild(head,mouthtop);
      convertToChild(head,mouthleftcenter);
      convertToChild(head,mouthleftcorner);
      convertToChild(head,mouthrightcenter);
      convertToChild(head,mouthrightcorner);
      convertToChild(head,mouthbottom);

     
     
  
  
      convertToChild(leftarm,leftshoulderpiece1);
      convertToChild(leftarm,leftshouldertwo);
      convertToChild(leftarm,leftshoulder3);
      convertToChild(leftarm,hammertop);
      convertToChild(leftarm,hammerstick);
      
      convertToChild(rightarm,rightshouldpiece1);
      convertToChild(rightarm,rightshoulderpiece2);
      convertToChild(rightarm,backpiece3);
      convertToChild(rightarm,rightshoulderpiece4);
    
     
   
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightfoot.render(f5);
    leftfoot.render(f5);
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
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hatmain.rotateAngleY = this.head.rotateAngleY;
    this.hatmain.rotateAngleX = this.head.rotateAngleX;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightfoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftfoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightfoot.rotateAngleY = 0.0F;
    this.leftfoot.rotateAngleY = 0.0F;
  }
  

  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
    // move child rotation point to be relative to parent
    parChild.rotationPointX -= parParent.rotationPointX;
    parChild.rotationPointY -= parParent.rotationPointY;
    parChild.rotationPointZ -= parParent.rotationPointZ;
    // make rotations relative to parent
    parChild.rotateAngleX -= parParent.rotateAngleX;
    parChild.rotateAngleY -= parParent.rotateAngleY;
    parChild.rotateAngleZ -= parParent.rotateAngleZ;
    // create relationship
    parParent.addChild(parChild);
  }
  

}
*/