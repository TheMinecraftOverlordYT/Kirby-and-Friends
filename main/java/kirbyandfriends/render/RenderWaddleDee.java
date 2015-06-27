package kirbyandfriends.render;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityWaddleDee;
import kirbyandfriends.entities.ModelKirby;
import kirbyandfriends.entities.ModelWaddleDee;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderWaddleDee extends RenderLiving {
	
	
	
	   private static final ResourceLocation Dee= new ResourceLocation(KirbyMod.modid + ":textures/entities/Waddle_Dee.png");

	  
	   
//	   public ModelBase createRandom() {
//		   Random r = new Random();
//		   switch(r.nextInt(10)) {
//		       case 1: return new ModelRedKirby();
//		       case 2: return new ModelBrownKirby();
//		       case 3: return new ModelBlueKirby();
//		       case 4: return new ModelWhiteKirby();
//		       
//		       default: return new ModelKirby();
//		   } 
//		}
	   
	   

	  

	   
	    public RenderWaddleDee(ModelWaddleDee modelWaddleDee, float par2)
	    {
	        super(modelWaddleDee, par2);
	        
	    }
	    
	   
	    protected void preRenderCallback(EntityWaddleDee kirby, float size)
	    {
	        GL11.glScalef(0.5f, 0.5f, 0.5f);
	    }
	    
	  
	    protected void preRenderCallback(EntityLivingBase entity, float size)
	    {
	        this.preRenderCallback((EntityWaddleDee)entity, size);
	    }
	    
	    protected ResourceLocation getEntityTexture(EntityWaddleDee kirby)
	    {
	    	return Dee;

	    }
	    


	    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	    {
	        return this.getEntityTexture((EntityWaddleDee)p_110775_1_);
	    }


	}
