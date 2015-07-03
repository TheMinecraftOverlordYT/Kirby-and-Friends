package kirbyandfriends.entities;

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
<<<<<<< HEAD
    //Args: originX, originY, originZ, width, height, depth, scaleFactor.
      
      hat_main = new ModelRenderer(this, 200, 150);
      hat_main.addBox(0F, 0F, 0F, 8, 1, 8);
      hat_main.setRotationPoint(-4F, -2F, -4F);
      hat_main.setTextureSize(512, 256);
      hat_main.mirror = true;
      setRotation(hat_main, 0F, 0F, 0F);

      hat_main.offsetY = -0.43F;
      hat_main.offsetX = 0.07F; 
     hat_main.offsetZ = 0.07F; 
      
      
      hat = new ModelRenderer(this, 100, 100);
      hat.addBox(0F, 0F, 0F, 4, 2, 1);
      hat.setRotationPoint(-2F, -3F, -5F);
      hat.setTextureSize(512, 256);
      hat.mirror = true;
      setRotation(hat, 0F, 0F, 0F);
      hat.offsetY = -0.43F;
      hat.offsetX = 0.07F;
      hat.offsetZ = 0.05F;
      
      

     

      hat_topper = new ModelRenderer(this, 60, 60);
      hat_topper.addBox(0F, -1F, 0F, 2, 2, 2);
      hat_topper.setRotationPoint(-1F, -3F, -1F);
      hat_topper.setTextureSize(512, 256);
      hat_topper.mirror = true;
      setRotation(hat_topper, 0F, 0F, 0F);

      hat_topper.offsetY = -0.43F;
      hat_topper.offsetX = 0.07F;
      hat_topper.offsetZ = 0.05F; 


     
      hammer_top = new ModelRenderer(this, 100, 100);
      hammer_top.addBox(0F, -15F, 0F, 2, 20, 2);
      hammer_top.setRotationPoint(8.5F, -5F, 3F);
      hammer_top.setTextureSize(512, 256);
      hammer_top.mirror = true;

      hammer_top.offsetY = -0.15F;
      hammer_top.offsetX = -0.25F;
      hammer_top.offsetZ = 0.39F;
      
      
     

      

      hammer_stick = new ModelRenderer(this, 100, 0);
      hammer_stick.addBox(0F, -2F, 0F, 8, 8, 16);
      hammer_stick.setRotationPoint(5.5F, -5F, 12F);
      hammer_stick.setTextureSize(512, 256);
      hammer_stick.mirror = true;
      setRotation(hammer_stick, 2.565634F, 0F, 0F);
      


      hat = new ModelRenderer(this, 100, 100);
      hat.addBox(0F, 0F, 0F, 4, 2, 1);
      hat.setRotationPoint(-2F, -3F, -5F);
      hat.setTextureSize(512, 256);
      hat.mirror = true;
      setRotation(hat, 0F, 0F, 0F);

      
      
      
      mouth_piece_6 = new ModelRenderer(this, 400, 2);
      mouth_piece_6.addBox(0F, 0F, 0F, 8, 1, 1);
      mouth_piece_6.setRotationPoint(-4F, 4F, -6F);
      mouth_piece_6.setTextureSize(512, 256);
      mouth_piece_6.mirror = true;
      setRotation(mouth_piece_6, 0F, 0F, 0F);

      mouth_piece_6.offsetY = -0.23F;
      mouth_piece_6.offsetZ = 0.23F; 
      


     
      mouth_piece_5 = new ModelRenderer(this, 123, 234);
      mouth_piece_5.addBox(0F, 0F, 0F, 4, 1, 1);
      mouth_piece_5.setRotationPoint(-2F, 7F, -6F);
      mouth_piece_5.setTextureSize(512, 256);
      mouth_piece_5.mirror = true;
      setRotation(mouth_piece_5, 0F, 0F, 0F);

      mouth_piece_5.offsetY = -0.23F;
      mouth_piece_5.offsetZ = 0.23F; 
      


     
      mouth_piece_4 = new ModelRenderer(this, 256, 100);
      mouth_piece_4.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_piece_4.setRotationPoint(-4F, 5F, -6F);
      mouth_piece_4.setTextureSize(512, 256);
      mouth_piece_4.mirror = true;
      setRotation(mouth_piece_4, 0F, 0F, 0F);

      mouth_piece_4.offsetY = -0.23F;
      mouth_piece_4.offsetZ = 0.23F; 
      


      
      mouth_piece_3 = new ModelRenderer(this, 23, 245);
      mouth_piece_3.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_piece_3.setRotationPoint(2F, 5F, -6F);
      mouth_piece_3.setTextureSize(512, 256);
      mouth_piece_3.mirror = true;
      setRotation(mouth_piece_3, 0F, 0F, 0F);

      mouth_piece_3.offsetY = -0.23F;
      mouth_piece_3.offsetZ = 0.23F; 

     
      mouth_piece_2 = new ModelRenderer(this, 400, 123);
      mouth_piece_2.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_piece_2.setRotationPoint(-3F, 6F, -6F);
      mouth_piece_2.setTextureSize(512, 256);
      mouth_piece_2.mirror = true;
      setRotation(mouth_piece_2, 0F, 0F, 0F);

      mouth_piece_2.offsetY = -0.23F;
      mouth_piece_2.offsetZ = 0.23F; 
      
      


      
      mouth_piece_1 = new ModelRenderer(this, 200, 25);
      mouth_piece_1.addBox(0F, 0F, 0F, 2, 1, 1);
      mouth_piece_1.setRotationPoint(1F, 6F, -6F);
      mouth_piece_1.setTextureSize(512, 256);
      mouth_piece_1.mirror = true;
      setRotation(mouth_piece_1, 0F, 0F, 0F);

      mouth_piece_1.offsetY = -0.23F;
      mouth_piece_1.offsetZ = 0.23F; 
      


      
      back_shoulder_piece_1 = new ModelRenderer(this, 300, 9);
      back_shoulder_piece_1.addBox(0F, 0F, 0F, 8, 5, 1);
      back_shoulder_piece_1.setRotationPoint(-4F, 3F, 5F);
      back_shoulder_piece_1.setTextureSize(512, 256);
      back_shoulder_piece_1.mirror = true;
      setRotation(back_shoulder_piece_1, 0F, 0F, 0F);
      
      left_shoulder_piece_4 = new ModelRenderer(this, 200, 180);
      left_shoulder_piece_4.addBox(0F, 0F, 0F, 3, 4, 1);
      left_shoulder_piece_4.setRotationPoint(-7F, 4F, 5F);
      left_shoulder_piece_4.setTextureSize(512, 256);
      left_shoulder_piece_4.mirror = true;
      setRotation(left_shoulder_piece_4, 0F, 0F, 0F);
      
      right_shoulder_piece_5 = new ModelRenderer(this, 300, 189);
      right_shoulder_piece_5.addBox(0F, 0F, 0F, 3, 4, 1);
      right_shoulder_piece_5.setRotationPoint(4F, 4F, 5F);
      right_shoulder_piece_5.setTextureSize(512, 256);
      right_shoulder_piece_5.mirror = true;
      setRotation(right_shoulder_piece_5, 0F, 0F, 0F);
      
      left_shoulder_piece_3 = new ModelRenderer(this, 0, 0);
      left_shoulder_piece_3.addBox(0F, 0F, 0F, 2, 3, 5);
      left_shoulder_piece_3.setRotationPoint(-7F, 5F, 0F);
      left_shoulder_piece_3.setTextureSize(512, 256);
      left_shoulder_piece_3.mirror = true;
      setRotation(left_shoulder_piece_3, 0F, 0F, 0F);
      
      right_shoulder_piece_4 = new ModelRenderer(this, 0, 0);
      right_shoulder_piece_4.addBox(0F, 0F, 0F, 2, 3, 5);
      right_shoulder_piece_4.setRotationPoint(5F, 5F, 0F);
      right_shoulder_piece_4.setTextureSize(512, 256);
      right_shoulder_piece_4.mirror = true;
      setRotation(right_shoulder_piece_4, 0F, 0F, 0F);
      
      left_shoulder_piece_2 = new ModelRenderer(this, 0, 0);
      left_shoulder_piece_2.addBox(-6F, 1F, -2F, 2, 2, 2);
      left_shoulder_piece_2.setRotationPoint(-1F, 5F, 0F);
      left_shoulder_piece_2.setTextureSize(512, 256);
      left_shoulder_piece_2.mirror = true;
      setRotation(left_shoulder_piece_2, 0F, 0F, 0F);
      
      right_shoulder_piece_3 = new ModelRenderer(this, 0, 0);
      right_shoulder_piece_3.addBox(0F, 0F, 0F, 2, 2, 2);
      right_shoulder_piece_3.setRotationPoint(5F, 6F, -2F);
      right_shoulder_piece_3.setTextureSize(512, 256);
      right_shoulder_piece_3.mirror = true;
      setRotation(right_shoulder_piece_3, 0F, 0F, 0F);
      
      right_shoulder_piece_1 = new ModelRenderer(this, 0, 0);
      right_shoulder_piece_1.addBox(0F, 0F, 0F, 2, 1, 3);
      right_shoulder_piece_1.setRotationPoint(-7F, 7F, -5F);
      right_shoulder_piece_1.setTextureSize(512, 256);
      right_shoulder_piece_1.mirror = true;
      setRotation(right_shoulder_piece_1, 0F, 0F, 0F);
      
      Right_shoulder_piece_2 = new ModelRenderer(this, 0, 0);
      Right_shoulder_piece_2.addBox(0F, 0F, 0F, 2, 1, 3);
      Right_shoulder_piece_2.setRotationPoint(5F, 7F, -5F);
      Right_shoulder_piece_2.setTextureSize(512, 256);
      Right_shoulder_piece_2.mirror = true;
      setRotation(Right_shoulder_piece_2, 0F, 0F, 0F);
      
=======
    
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
    
>>>>>>> origin/master
      head = new ModelRenderer(this, 300, 200);
      head.addBox(-4F, -8F, -4F, 10, 9, 10);
      head.setRotationPoint(-1F, 7F, -1F);
      head.setTextureSize(512, 256);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
<<<<<<< HEAD
      head.addChild(hat);
      head.addChild(hat_topper);
      head.addChild(hat_main);


      
      
   

      head.addChild(mouth_piece_1);
      head.addChild(mouth_piece_2);
      head.addChild(mouth_piece_3);
      head.addChild(mouth_piece_4);
      head.addChild(mouth_piece_5);
      head.addChild(mouth_piece_6);
      head.addChild(Beak);

=======
>>>>>>> origin/master
      
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
<<<<<<< HEAD
      rightarm.addChild(right_shoulder_piece_1);
      rightarm.addChild(Right_shoulder_piece_2);
      rightarm.addChild(right_shoulder_piece_3);
      rightarm.addChild(right_shoulder_piece_4);
      rightarm.addChild(right_shoulder_piece_5);



      
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
      
      Beak = new ModelRenderer(this, 100, 200);
      Beak.addBox(0F, 3F, 0F, 2, 2, 2);
      Beak.setRotationPoint(-1F, -1F, -7F);
      Beak.setTextureSize(512, 256);
      Beak.mirror = true;
      setRotation(Beak, 0F, 0F, 0F);

      head.addChild(mouth_piece_1);
      head.addChild(mouth_piece_2);
      head.addChild(mouth_piece_3);
      head.addChild(mouth_piece_4);
      head.addChild(mouth_piece_5);
      head.addChild(mouth_piece_6);
      head.addChild(Beak);
      Beak.offsetY = -0.35F;
      Beak.offsetZ = 0.23F; 
      
      
      
      
  }
=======
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

     
     
>>>>>>> origin/master
  

      convertToChild(leftarm,stick);
      convertToChild(leftarm,hammer_top);
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

}
