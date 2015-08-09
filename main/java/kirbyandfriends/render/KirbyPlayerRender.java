package kirbyandfriends.render;



import kirbyandfriends.KirbyMod;
import kirbyandfriends.models.ModelWaddleDee;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class KirbyPlayerRender extends RenderPlayer{
		    	
		    	  private static final ResourceLocation Normal= new ResourceLocation(KirbyMod.modid + ":textures/entities/Tamed_Kirbies/Pink.png");

		    	
		    	 public KirbyPlayerRender()
				    {
				        super();
				        this.mainModel = new ModelWaddleDee();
				        //this.modelBipedMain = (ModelBiped)this.mainModel;
				        //this.modelArmorChestplate = (ModelBiped)this.mainModel;
				        //this.modelArmor = (ModelBiped)this.mainModel;
				        this.renderManager = RenderManager.instance;
				        }
				        
			
		    	 @Override
		 	    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
			    {
			        return Normal;
			    }
		    	 
		    	 
		    	 
		    	 
		    }