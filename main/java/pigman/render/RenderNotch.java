package pigman.render;

import pigman.PigmanMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderNotch extends RenderLiving {

    private static final ResourceLocation Skin = new ResourceLocation(PigmanMod.modid + ":textures/entities/notch.png");  
    public RenderNotch(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    public RenderNotch(ModelBiped model, float shadowSize) {
    	super(model, shadowSize);
    	}
  

@Override
protected ResourceLocation getEntityTexture(Entity entity) {
	 return Skin;
}

}