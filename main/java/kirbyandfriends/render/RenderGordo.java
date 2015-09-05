package kirbyandfriends.render;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.models.ModelDedede;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGordo extends RenderLiving {

	 private static final ResourceLocation texture= new ResourceLocation(KirbyMod.modid + ":textures/entities/gordo.png");
		
		
		
		public RenderGordo(ModelDedede model, float shadow) {
			super(model, shadow);
		}

		
		
		@Override
		protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
			return texture; 
		}

	
}
