package kirbyandfriends.render;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityCreepy;
import kirbyandfriends.entities.ModelWaddleDee;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderCreepy extends RenderLiving {
	
	
	
	   private static final ResourceLocation Creepy= new ResourceLocation(KirbyMod.modid + ":textures/entities/CreepyKirby.png");

	  static RenderManager rendermanager; 
	   
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
	   
	   

	  

	   
	    public RenderCreepy(ModelWaddleDee modelWaddleDee, float par2)
	    {
	        super(rendermanager, modelWaddleDee, par2);
	        
	    }
	    
	   
	    protected void preRenderCallback(EntityCreepy kirby, float size)
	    {
	        GL11.glScalef(0.5f, 0.5f, 0.5f);
	    }
	    
	  
	    protected void preRenderCallback(EntityLivingBase entity, float size)
	    {
	        this.preRenderCallback((EntityCreepy)entity, size);
	    }
	    
	    protected ResourceLocation getEntityTexture(EntityCreepy kirby)
	    {
	    	return Creepy;

	    }
	    


	    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	    {
	        return this.getEntityTexture((EntityCreepy)p_110775_1_);
	    }


	}
