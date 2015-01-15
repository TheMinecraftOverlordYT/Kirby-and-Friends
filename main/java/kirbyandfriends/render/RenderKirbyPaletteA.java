package kirbyandfriends.render;

	import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.ModelKirby;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

	public class RenderKirbyPaletteA extends RenderLiving {


		 private static final ResourceLocation Pallet = new ResourceLocation(KirbyMod.modid + ":textures/entities/Kirby_Pallet_1.png"); 
		   
		    public RenderKirbyPaletteA(ModelKirby par1ModelBase, float par2)
		    {
		        super(par1ModelBase, par2);
		        
		    }
		   
		    protected void preRenderCallback(EntityKirby kirby, float size)
		    {
		        GL11.glScalef(0.5f, 0.5f, 0.5f);
		    }
		    
		    protected void preRenderCallback(EntityLivingBase entity, float size)
		    {
		        this.preRenderCallback((EntityKirby)entity, size);
		    }
		    
		 protected ResourceLocation getEntityTexture(Entity par1Entity) {
			 
		 return Pallet;
		 } 


		}
