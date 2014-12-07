package pigman.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pigman.PigmanMod;
import pigman.entities.ModelQuark;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderQuark extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation(PigmanMod.modid, "textures/entities/Quark.png");

public RenderQuark(ModelQuark model, float par2)
{
super(model, par2);

}

protected ResourceLocation getEntityTexture(Entity par1Entity) {
return Texture;

}

}