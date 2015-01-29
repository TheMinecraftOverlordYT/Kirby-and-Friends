package kirbyandfriends.render;

	import org.lwjgl.opengl.GL11;

import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.ModelKirby;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

	public class RenderKirbyPaletteA extends RenderLiving {
		
		
		   

		
		  
		   
//		   public ModelBase createRandom() {
//			   Random r = new Random();
//			   switch(r.nextInt(10)) {
//			       case 1: return new ModelRedKirby();
//			       case 2: return new ModelBrownKirby();
//			       case 3: return new ModelBlueKirby();
//			       case 4: return new ModelWhiteKirby();
//			       
//			       default: return new ModelKirby();
//			   } 
//			}
		   
		   

		  

		   
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
		    
		    protected ResourceLocation getEntityTexture(EntityKirby kirby)
		    {
		    	return kirby.getresource();
	
		    }
		    


		    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
		    {
		        return this.getEntityTexture((EntityKirby)p_110775_1_);
		    }


		}
