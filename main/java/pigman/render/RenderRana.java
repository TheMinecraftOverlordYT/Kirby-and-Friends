package pigman.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import pigman.PigmanMod;
import pigman.entities.ModelRana;

public class RenderRana extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation(PigmanMod.modid + ":textures/entities/Rana.png");

public RenderRana(ModelRana model, float par2)
{
super(model, par2);

}

protected ResourceLocation getEntityTexture(Entity par1Entity) {
return Texture;

}
}

