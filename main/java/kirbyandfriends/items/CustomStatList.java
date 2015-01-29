package kirbyandfriends.items;

import kirbyandfriends.items.CustomEntityList.MyEntityEggInfo;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentTranslation;

public class CustomStatList extends StatList {
	public static StatBase func_151176_b(CustomEntityList.MyEntityEggInfo p_151176_0_)
    {
        String s = CustomEntityList.getStringFromID(p_151176_0_.spawnedID);
        return s == null ? null : (new StatBase("stat.entityKilledBy." + s, new ChatComponentTranslation("stat.entityKilledBy", new Object[] {new ChatComponentTranslation("entity." + s + ".name", new Object[0])}))).registerStat();
    }
	
	public static StatBase func_151182_a(MyEntityEggInfo p_151182_0_)
    {
        String s = CustomEntityList.getStringFromID(p_151182_0_.spawnedID);
        return s == null ? null : (new StatBase("stat.killEntity." + s, new ChatComponentTranslation("stat.entityKill", new Object[] {new ChatComponentTranslation("entity." + s + ".name", new Object[0])}))).registerStat();
    }
}
