package kirbyandfriends.render;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.ModelDedede;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDedede extends RenderLiving {

	 private static final ResourceLocation texture= new ResourceLocation(KirbyMod.modid + ":textures/entities/dedede.png");
	
	
	
	public RenderDedede(ModelDedede model, float shadow) {
		super(model, shadow);
	}

	
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture; 
	}

}
