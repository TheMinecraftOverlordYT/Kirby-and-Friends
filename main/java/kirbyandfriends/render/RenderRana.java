package kirbyandfriends.render;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.ModelRana;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderRana extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation(KirbyMod.modid + ":textures/entities/Rana.png");

public RenderRana(ModelRana model, float par2)
{
super(model, par2);

}

protected ResourceLocation getEntityTexture(Entity par1Entity) {
return Texture;

}
}

