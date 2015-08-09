package kirbyandfriends.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHammer extends ModelBase {
	
	  ModelRenderer hammertop;
	   ModelRenderer hammerstick;
	   public ModelHammer()
	   {
	     textureWidth = 512;
	     textureHeight = 256;
	     
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
}
	   

	   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	   {
	     super.render(entity, f, f1, f2, f3, f4, f5);
	     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	     hammerstick.render(f5);
	     hammertop.render(f5);
	   }
	   
	   private void setRotation(ModelRenderer model, float x, float y, float z)
	   {
	     model.rotateAngleX = x;
	     model.rotateAngleY = y;
	     model.rotateAngleZ = z;
	   }
	   
}