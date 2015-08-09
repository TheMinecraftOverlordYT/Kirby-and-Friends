package kirbyandfriends.render;

import org.lwjgl.opengl.GL11;

import kirbyandfriends.KirbyMod;
import kirbyandfriends.models.ModelHammer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderHammer implements IItemRenderer {

	protected ModelHammer hammer; 
	
	public ResourceLocation hammertexture = new ResourceLocation(KirbyMod.modid + ":textures/items/hammer.png");
	
	public RenderHammer() {
		hammer = new ModelHammer();
	}
	
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case ENTITY:
			return true;
		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		case INVENTORY:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
	
	    
	    GL11.glPushMatrix();
        if(type == ItemRenderType.EQUIPPED_FIRST_PERSON){
        GL11.glTranslatef((float) 0.5F, (float) 1F, (float) -0.5F);
        GL11.glScalef(2F, 2F, 2F); 
        //GL11.glRotatef(45, 2F, 0, 0);
        }
        if(type == ItemRenderType.INVENTORY) {   	
        }
        else{
          GL11.glTranslatef((float) 0.5F, (float) 1F, (float) -0.5F);
          GL11.glScalef(2F, 2F, 2F); 
        }
        
        
       Minecraft.getMinecraft().getTextureManager().bindTexture(hammertexture);
        
        
     GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        
       hammer.render((Entity)null, 0.0F, 0F, 0F, 0.0F, 0.0F, 0.0625F);
        
        
        GL11.glPopMatrix();
        GL11.glPopMatrix();
		/*	switch(type){
		
	    
	 
		case EQUIPPED :{
			
			
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(hammertexture);
			hammer.render((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		default :
			break;
		}*/
	}

}
