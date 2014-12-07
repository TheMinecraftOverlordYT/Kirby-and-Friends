package kirbyandfriends.render;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.ModelQuark;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderQuark extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation(KirbyMod.modid, "textures/entities/Quark.png");

public RenderQuark(ModelQuark model, float par2)
{
super(model, par2);

}

protected ResourceLocation getEntityTexture(Entity par1Entity) {
return Texture;

}

}