package pigman.render;

import pigman.entities.ModelNewSnowman;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderNewSnowman extends RenderLiving{
	public static ResourceLocation texture = new ResourceLocation("pigman" + ":" + "textures/entities/snowman.png");;  
	    public RenderNewSnowman(ModelBase par1ModelBase, float par2)
	    {
	        super(par1ModelBase, par2);
	    }
	    
	    public RenderNewSnowman(ModelNewSnowman model, float shadowSize) {
	    	super(model, shadowSize);
	    	}
	  

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		 return texture;
	}

	}
