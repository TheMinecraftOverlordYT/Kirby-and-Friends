package pigman.render;


import pigman.PigmanMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderZombieNew extends RenderBiped {
	
	    private static final ResourceLocation Skin = new ResourceLocation(PigmanMod.modid + ":textures/entity/zombieNew.png");  
	    public RenderZombieNew(ModelBiped par1ModelBase, float par2)
	    {
	        super(par1ModelBase, par2);
	        
	    }
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		 return Skin;
		 
	}
		 
	}