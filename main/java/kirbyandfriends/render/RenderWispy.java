package kirbyandfriends.render;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityWispy;
import kirbyandfriends.models.ModelWispy;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderWispy extends RenderLiving {
	
	
	
	   private static final ResourceLocation Wispy= new ResourceLocation(KirbyMod.modid + ":textures/entities/wispy.png");

	  
	  

	   
	    public RenderWispy(ModelWispy modelWispyKirby, float par2)
	    {
	        super(modelWispyKirby, par2);
	        
	    }
	    
	    
	    protected ResourceLocation getEntityTexture(EntityWispy kirby)
	    {
	    	return Wispy;

	    }
	    


	    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	    {
	        return this.getEntityTexture((EntityWispy)p_110775_1_);
	    }


	}
