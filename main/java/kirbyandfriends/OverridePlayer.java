package kirbyandfriends;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.models.ModelKirby;
import kirbyandfriends.models.ModelWaddleDee;
import kirbyandfriends.render.KirbyPlayerRender;
import kirbyandfriends.render.RenderD;
import kirbyandfriends.render.RenderKirbyPaletteA;
import kirbyandfriends.render.RenderWaddleDee;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelSheep2;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderPlayerEvent.Specials;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class OverridePlayer {
	  static ModelKirby model; 
	  static ModelWaddleDee modelDee;
	    static EntityPlayer entityP; 
	    static KirbyPlayerRender kpr;
	    static RenderSheep rs; 
	static EntityKirby entityK;
	static RenderD drender; 
	private ModelBiped value;

	//value = ObfuscationReflectionHelper.getPrivateValue(RendererLivingEntity.class, pre.renderer, new String[] { "mainModel", "field_77045_g" });
	//static RenderMyEvent rmt; 
	@SubscribeEvent
	public void onRenderPlayerPre(RenderPlayerEvent.Pre pre) {
		
		//int type = 0;
//		if(PlayerEntity.getPlayerEntity(pre.entityPlayer) != null) {
//			type = PlayerEntity.getPlayerEntity(pre.entityPlayer);
//	
			ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class,kpr, new ModelKirby(), new String[] { "mainModel", "field_77045_g" });
	}

	@SubscribeEvent
	public void onRenderPlayerPost(RenderPlayerEvent.Post post) {
		ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, post.renderer, value, new String[] { "mainModel", "field_77045_g" });
	}
}
//	private class RenderMyEvent extends RenderPlayerEvent{
//
//
//		
//		public RenderMyEvent(EntityPlayer player, KirbyPlayerRender renderer, float partialRenderTick) {
//			super(player, renderer, partialRenderTick);
//
//		}
//		
//	}
//	
//	@Cancelable
//    public static class Pre extends RenderPlayerEvent
//    {
//        public Pre(EntityPlayer player, KirbyPlayerRender renderer, float tick){ super(player, renderer, tick); }
//    }
//
//    public static class Post extends RenderPlayerEvent
//    {
//        public Post(EntityPlayer player, KirbyPlayerRender renderer, float tick){ super(player, renderer, tick); }
//    }
//    
//    public abstract static class Specials extends RenderPlayerEvent
//    {
//        public Specials(EntityPlayer player, KirbyPlayerRender renderer, float partialTicks)
//        {
//            super(player, renderer, partialTicks);
//        }
//
//        @Cancelable
//        public static class Pre extends Specials
//        {
//            public boolean renderHelmet = true;
//            public boolean renderCape = true;
//            public boolean renderItem = true;
//            public Pre(EntityPlayer player, KirbyPlayerRender renderer, float partialTicks){ super(player, renderer, partialTicks); }
//        }
//
//        public static class Post extends Specials
//        {
//            public Post(EntityPlayer player,KirbyPlayerRender renderer, float partialTicks){ super(player, renderer, partialTicks); }
//        }
//    }
//
//    public static class SetArmorModel extends RenderPlayerEvent
//    {
//        /**
//         * Setting this to any value besides -1 will result in the function being 
//         * Immediately exited with the return value specified.
//         */
//        public int result = -1;
//        public final int slot;
//        public final ItemStack stack;
//        public SetArmorModel(EntityPlayer player, KirbyPlayerRender renderer, int slot, float partialTick, ItemStack stack)
//        {
//            super(player, renderer, partialTick);
//            this.slot = slot;
//            this.stack = stack;
//        }
//    }
//	
//	/*//private final RenderKirbyPaletteA renderPlayer = new RenderKirbyPaletteA(modelKirby, 0.5F);
//	@SubscribeEvent
//	void overrideRenderPlayer(RenderPlayerEvent.Pre event) {
//        ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, Krender, modelDee, "mainModel", "field_77045_g");
//        ObfuscationReflectionHelper.setPrivateValue(RenderPlayer.class,Krender , modelDee, "modelBipedMain", "field_77109_a");
//  
//	}
//	
//	@SubscribeEvent
//	public void onRenderPlayerPost(RenderPlayerEvent.Post post) {
//		ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, post.renderer, new ModelBiped(), new String[] { "mainModel", "field_77045_g" });
//	}
//	*/
//	
///*    @SubscribeEvent
//    public void clientConnect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
//        proxy.getClientChannel().attr(FML_MESSAGETARGET).set(TOSERVER);
//        String player = Minecraft.getMinecraft().thePlayer.func_146103_bH().getName();
//        proxy.getClientChannel().writeOutbound(new PlayerDataPacket(player));
//        proxy.getClientChannel().writeOutbound(new ClientDataPacket(player, ClientDataPacket.Messages.REQUEST));
//    }
//	*/
//
//		//ObfuscationReflectionHelper.setPrivateValue(net.minecraft.client.renderer.entity.RendererLivingEntity.class, pre.renderer, new ModelDwarf(), new String[] { "mainModel", "field_77045_g" });
//
///*	@SubscribeEvent
//	public void onRenderPlayerPost(RenderPlayerEvent.Post post) {
//		ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, post.renderer, value, new String[] { "mainModel", "field_77045_g" });
//	}*/
//		
////	if (event.entity instanceof EntityPlayer) {
////	event.setCanceled(true);
////	//renderPlayer.doRender(entityK, 0, 0, 0, 1F, 1F);
//	//}
//	}
///*
//    @SubscribeEvent
//    public void render(RenderPlayerEvent.Pre e) {
//        ModelPlayer model;
//        if (!models.containsKey(e.entityPlayer.func_146103_bH().getName())) {
//            model = new ModelPlayer();
//            model.setUpCustom(e.entityPlayer.func_146103_bH().getName());
//            models.put(e.entityPlayer.func_146103_bH().getName(), model);
//        } else {
//            model = models.get(e.entityPlayer.func_146103_bH().getName());
//        }
//
//        ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, e.renderer, model, "mainModel", "field_77045_g");
//        ObfuscationReflectionHelper.setPrivateValue(RenderPlayer.class, e.renderer, model, "modelBipedMain", "field_77109_a");
//    }
//
//    @SubscribeEvent
//    public void clientConnect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
//        proxy.getClientChannel().attr(FML_MESSAGETARGET).set(TOSERVER);
//        String player = getMinecraft().thePlayer.func_146103_bH().getName();
//        proxy.getClientChannel().writeOutbound(new PlayerDataPacket(player));
//        proxy.getClientChannel().writeOutbound(new ClientDataPacket(player, ClientDataPacket.Messages.REQUEST));
//    }
//
//*/