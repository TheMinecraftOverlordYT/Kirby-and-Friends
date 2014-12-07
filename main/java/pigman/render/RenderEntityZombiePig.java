package pigman.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pigman.PigmanMod;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEntityZombiePig extends RenderLiving
{
	 private static final ResourceLocation Texture = new ResourceLocation(PigmanMod.modid, "textures/entities/ZombiePig.png");
	
	   
	    public RenderEntityZombiePig(ModelPig par1ModelBase, float par2)
	    {
	    	  super(par1ModelBase,par2);
	        
	    }
	 protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Texture;
		 
	}
		 
	}
