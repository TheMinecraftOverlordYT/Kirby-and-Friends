package kirbyandfriends.render;

	import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.ModelKirby;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.ResourceLocation;

	public class RenderKirbyPaletteA extends RenderLiving {
		
		
		   
		 private static final ResourceLocation Black= new ResourceLocation(KirbyMod.modid + ":textures/entities/BlackKirby.png"); 
		   //private static final ResourceLocation Creepy= new ResourceLocation(KirbyMod.modid + ":textures/entities/CreepyKirby.png");
		   private static final ResourceLocation Default= new ResourceLocation(KirbyMod.modid + ":textures/entities/DefaultKirby.png");
		   private static final ResourceLocation White= new ResourceLocation(KirbyMod.modid + ":textures/entities/WhiteKirby.png");
		   private static final ResourceLocation Red= new ResourceLocation(KirbyMod.modid + ":textures/entities/RedKirby.png");
		   private static final ResourceLocation Blue= new ResourceLocation(KirbyMod.modid + ":textures/entities/BlueKirby.png");
		   private static final ResourceLocation Green = new ResourceLocation(KirbyMod.modid + ":textures/entities/GreenKirby.png");
		   private static final ResourceLocation Purple = new ResourceLocation(KirbyMod.modid + ":textures/entities/PurpleKirby.png");
		   private static final ResourceLocation Yellow = new ResourceLocation(KirbyMod.modid + ":textures/entities/YellowKirby.png");
		   private static final ResourceLocation Brown = new ResourceLocation(KirbyMod.modid + ":textures/entities/BrownKirby.png");
		  
		   
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
		     int i = (kirby.getHorseVariant());
				if (i== 1) {
					return Default;
				}
				if (i==2){
					return Red;
				}
				if (i==3){
					return Blue;
				}
				if (i==4){
					return Yellow;
				}
				if (i==5){
					return Purple;
				}
				if (i==6){
					return Green;
				}
				else
				 return	Brown;   
		    }


		    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
		    {
		        return this.getEntityTexture((EntityKirby)p_110775_1_);
		    }


		}
