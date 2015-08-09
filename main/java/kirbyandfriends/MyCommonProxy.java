package kirbyandfriends;

import java.util.EnumMap;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import io.netty.channel.embedded.EmbeddedChannel;
import net.minecraftforge.common.MinecraftForge;

public class MyCommonProxy {
	
	 public EnumMap<Side, FMLEmbeddedChannel> channel;


	    public void initNetworking() {
//	        NetworkRegistry.INSTANCE..registerChannel(new PacketHandler(), "VoxelModels");
	       // channel = NetworkRegistry.INSTANCE.newChannel("kirbyandfriends", new ChannelHandler());
	    }

	    public void initOther() {
	        MinecraftForge.EVENT_BUS.register(new OverridePlayer());
	        FMLCommonHandler.instance().bus().register(new OverridePlayer());
	    }

	    public void init() {
	    }


	    public EmbeddedChannel getServerChannel() {
	        return channel.get(Side.SERVER);
	    }

	    public EmbeddedChannel getClientChannel() {
	        return channel.get(Side.CLIENT);
	    }
	
	public void registerRenderers() 
	{
		
	}
}
