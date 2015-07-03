package kirbyandfriends.packet_handling;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class SpawnPacket implements IMessage{

	public static final byte OrderSet = 1;
	
	@Override
	public void fromBytes(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}

	private String text;

    public SpawnPacket() { }

    public SpawnPacket(String text) {
        this.text = text;
    }
	
	
	@Override
	public void toBytes(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}



public static class SpawnPacketHandler implements IMessageHandler<SpawnPacket, IMessage>{


	@Override
	public IMessage onMessage(SpawnPacket message, MessageContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
}