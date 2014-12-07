package pigman.render;

import pigman.PigmanMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHuman extends RenderLiving {

	 private static final ResourceLocation Skin = new ResourceLocation(PigmanMod.modid + ":textures/entities/char.png");
	   
	    public RenderHuman(ModelBiped par1ModelBase, float par2)
	    {
	        super(par1ModelBase, par2);
	        
	    }
	 protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Skin;
	 } 
	}