package kirbyandfriends.render;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityBlipper;
import kirbyandfriends.models.ModelBlipper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.ResourceLocation;

public class RenderBlipper extends RenderLiving {
	
	
	
	   private static final ResourceLocation Blipper= new ResourceLocation(KirbyMod.modid + ":textures/entities/Blipper.png");

	  public void renderBlipper(EntityBlipper var1,double var2,double var4,double var6,float var8,float var9){
		  super.doRender(var1,var2,var4,var6,var8,var9);
	  }
	   
	  protected void preRenderCallback(EntityBlipper var1,float f2){
		//  GL11.glEnable(GL11.GL_BLEND);
		//  GL11.glEnable(GL11.GL_NORMALIZE);
		//  GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
	        GL11.glScalef(0.5f, 0.5f, 0.5f);
	    }
	  
	  /*
	  protected int shouldRenderPass(EntityBlipper p_77032_1_, int p_77032_2_, float p_77032_3_)
	    {
	        if (p_77032_1_.isInvisible())
	        {
	            return 0;
	        }
	        else if (p_77032_2_ == 0)
	        {
	            GL11.glEnable(GL11.GL_NORMALIZE);
	            GL11.glEnable(GL11.GL_BLEND);
	            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	            return 1;
	        }
	        else
	        {
	            if (p_77032_2_ == 1)
	            {
	                GL11.glDisable(GL11.GL_BLEND);
	                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	            }

	            return -1;
	        }
	    }
*/
	  
	  
//	   public ModelBase createRandom() {
//		   Random r = new Random();
//		   switch(r.nextInt(10)) {
//		       case 1: return new ModelRedKirby();
//		       case 2: return new ModelBrownKirby();
//		       case 3: return new ModelBlueKirby();
//		       case 4: return new ModelWhiteKirby();
//		       
//		       default: return new ModelBlipper();
//		   } 
//		}
	   
	   

	  

	   
	    public RenderBlipper(ModelBlipper modelBlipperKirby, float par2)
	    {
	        super(modelBlipperKirby, par2);
	        
	    }
	    
	   
/*	    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
	    {
	        return this.shouldRenderPass((EntityBlipper)p_77032_1_, p_77032_2_, p_77032_3_);
	    }
*/
	    
	  
	    protected void preRenderCallback(EntityLivingBase entity, float size)
	    {
	        this.preRenderCallback((EntityBlipper)entity, size);
	    }
	    
	    protected ResourceLocation getEntityTexture(EntityBlipper kirby)
	    {
	    	return Blipper;

	    }
	    


	    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	    {
	        return this.getEntityTexture((EntityBlipper)p_110775_1_);
	    }


	}
