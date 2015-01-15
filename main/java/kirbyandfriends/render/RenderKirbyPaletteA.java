package kirbyandfriends.render;

	import java.util.Random;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.ModelKirby;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

	public class RenderKirbyPaletteA extends RenderLiving {
 

		 private static final ResourceLocation PalletA = new ResourceLocation(KirbyMod.modid + ":textures/entities/Kirby_Pallet_1.png"); 
		 private static final ResourceLocation PalletB = new ResourceLocation(KirbyMod.modid + ":textures/entities/Kirby_Pallet_2.png");
		   private static final ResourceLocation Creepy= new ResourceLocation(KirbyMod.modid + ":textures/entities/CreepyKirby.png");
		   
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
				Random rand = new Random();
			    int i = rand.nextInt((8 + 1 + 1) - 1);
		
			  return i < 5 ? PalletA : i > 5 ? PalletB : Creepy ;
		 } 


		}
