package kirbyandfriends.render;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.ModelHerobrine;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends RenderLiving {
	 private static final ResourceLocation Texture = new ResourceLocation(KirbyMod.modid + ":textures/entities/Herobrine.png");
	   
	    public RenderHerobrine(ModelHerobrine par1ModelBase, float par2)
	    {
	    	  super(par1ModelBase,par2);
	        
	    }
	 protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Texture;
		 
	}
		 
	}
