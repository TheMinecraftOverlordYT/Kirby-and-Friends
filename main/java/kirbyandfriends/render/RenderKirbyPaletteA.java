package kirbyandfriends.render;

	import java.util.Map;
import org.lwjgl.opengl.GL11;

import com.google.common.collect.Maps;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.ModelKirby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

	public class RenderKirbyPaletteA extends RenderLiving {
		
		
		   
		private static final Map field_110852_a = Maps.newHashMap();
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
		   
		   

		   private ResourceLocation textureLoader(EntityKirby kirby)
		    {
		        String s = kirby.getHorseTexture();
		        ResourceLocation resourcelocation = (ResourceLocation)field_110852_a.get(s);

		        if (resourcelocation == null)
		        {
		            resourcelocation = new ResourceLocation(s);
		            Minecraft.getMinecraft().getTextureManager().loadTexture(resourcelocation, new LayeredTexture(kirby.getVariantTexturePaths()));
		            field_110852_a.put(s, resourcelocation);
		        }

		        return resourcelocation;
		    }

		   
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
		        if (!kirby.HorseReader())
		        {
		            switch (kirby.getHorseType())
		            {
		                case 0:
		                default:
		                    return Default;
		                case 1:
		                    return Black;
		                case 2:
		                    return Blue;
		                case 3:
		                    return Green;
		                case 4:
		                    return Yellow;
		            }
		        }
		        else
		        {
		            return this.textureLoader(kirby);
		        }
		    }


		    protected ResourceLocation getEntityTexture(Entity kirby)
		    {
		        return this.getEntityTexture((EntityKirby)kirby);
		    }


		}
