package pigman.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pigman.PigmanMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderPigman extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation(PigmanMod.modid + ":textures/entities/pigman.png");

public RenderPigman(ModelBiped model, float par2)
{
super(model, par2);

}

protected ResourceLocation getEntityTexture(Entity par1Entity) {
return Texture;

}

}