package pigman.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import pigman.PigmanMod;
import pigman.entities.EntityKirby;
import pigman.entities.ModelKirby;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderKirby extends RenderLiving
{
    private static final ResourceLocation KirbyTextures = new ResourceLocation(PigmanMod.modid + ":" + "textures/entities/Kirbytexture.png");

    public RenderKirby(ModelKirby Modelbase, ModelKirby par2modelbase, float shadow)
    {
        super(Modelbase, shadow);
        this.setRenderPassModel(par2modelbase);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityKirby par1EntityKirby, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_2_ == 0)
        {
            this.bindTexture(KirbyTextures);

            if (par1EntityKirby.hasCustomNameTag() && "Jamal".equals(par1EntityKirby.getCustomNameTag()))
            {
                boolean flag = true;
                int k = par1EntityKirby.ticksExisted / 25 + par1EntityKirby.getEntityId();
                int l = k % EntityKirby.fleeceColorTable.length;
                int i1 = (k + 1) % EntityKirby.fleeceColorTable.length;
                float f1 = ((float)(par1EntityKirby.ticksExisted % 25) + p_77032_3_) / 25.0F;
                GL11.glColor3f(EntityKirby.fleeceColorTable[l][0] * (1.0F - f1) + EntityKirby.fleeceColorTable[i1][0] * f1, EntityKirby.fleeceColorTable[l][1] * (1.0F - f1) + EntityKirby.fleeceColorTable[i1][1] * f1, EntityKirby.fleeceColorTable[l][2] * (1.0F - f1) + EntityKirby.fleeceColorTable[i1][2] * f1);
            }
            else
            {
                int j = par1EntityKirby.getFleeceColor();
                GL11.glColor3f(EntityKirby.fleeceColorTable[j][0], EntityKirby.fleeceColorTable[j][1], EntityKirby.fleeceColorTable[j][2]);
            }

            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityKirby p_110775_1_)
    {
        return KirbyTextures;
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityKirby, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityKirby)par1EntityKirby, p_77032_2_, p_77032_3_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityKirby)p_110775_1_);
    }
}