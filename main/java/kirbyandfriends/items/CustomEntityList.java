package kirbyandfriends.items;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import kirbyandfriends.entities.EntityBlipper;
import kirbyandfriends.entities.EntityDedede;
import kirbyandfriends.entities.EntityKirby;
import kirbyandfriends.entities.EntityWaddleDee;
import kirbyandfriends.entities.EntityWaddleDoo;
import kirbyandfriends.entities.EntityWispy;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLLog;

public class CustomEntityList
{
    private static final Logger logger = LogManager.getLogger();
    /** Provides a mapping between entity classes and a string */
    public static Map stringToClassMapping = new HashMap();
    /** Provides a mapping between a string and an entity classes */
    public static Map classToStringMapping = new HashMap();
    /** provides a mapping between an entityID and an Entity Class */
    public static Map IDtoClassMapping = new HashMap();
    /** provides a mapping between an Entity Class and an entity ID */
    private static Map classToIDMapping = new HashMap();
    /** Maps entity names to their numeric identifiers */
    private static Map stringToIDMapping = new HashMap();
    /** This is a HashMap of the Creative Entity Eggs/Spawners. */
    public static HashMap entityEggs = new LinkedHashMap();
    private static final String __OBFID = "CL_00001538";

    /**
     * adds a mapping between Entity classes and both a string representation and an ID
     */
    public static void addMapping(Class p_75618_0_, String p_75618_1_, int p_75618_2_)
    {
        if (stringToClassMapping.containsKey(p_75618_1_))
        {
            throw new IllegalArgumentException("ID is already registered: " + p_75618_1_);
        }
        else if (IDtoClassMapping.containsKey(Integer.valueOf(p_75618_2_)))
        {
            throw new IllegalArgumentException("ID is already registered: " + p_75618_2_);
        }
        else
        {
            stringToClassMapping.put(p_75618_1_, p_75618_0_);
            classToStringMapping.put(p_75618_0_, p_75618_1_);
            IDtoClassMapping.put(Integer.valueOf(p_75618_2_), p_75618_0_);
            classToIDMapping.put(p_75618_0_, Integer.valueOf(p_75618_2_));
            stringToIDMapping.put(p_75618_1_, Integer.valueOf(p_75618_2_));
        }
    }

    /**
     * Adds a entity mapping with egg info.
     */
    public static void addMapping(Class p_75614_0_, String p_75614_1_, int p_75614_2_, int p_75614_3_, int p_75614_4_)
    {
        addMapping(p_75614_0_, p_75614_1_, p_75614_2_);
        entityEggs.put(Integer.valueOf(p_75614_2_), new CustomEntityList.MyEntityEggInfo(p_75614_2_, p_75614_3_, p_75614_4_));
    }

    /**
     * Create a new instance of an entity in the world by using the entity name.
     */
    public static Entity createEntityByName(String p_75620_0_, World p_75620_1_)
    {
        Entity entity = null;

        try
        {
            Class oclass = (Class)stringToClassMapping.get(p_75620_0_);

            if (oclass != null)
            {
                entity = (Entity)oclass.getConstructor(new Class[] {World.class}).newInstance(new Object[] {p_75620_1_});
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        return entity;
    }

    /**
     * create a new instance of an entity from NBT store
     */
    public static Entity createEntityFromNBT(NBTTagCompound p_75615_0_, World p_75615_1_)
    {
        Entity entity = null;

        if ("Minecart".equals(p_75615_0_.getString("id")))
        {
            switch (p_75615_0_.getInteger("Type"))
            {
                case 0:
                    p_75615_0_.setString("id", "MinecartRideable");
                    break;
                case 1:
                    p_75615_0_.setString("id", "MinecartChest");
                    break;
                case 2:
                    p_75615_0_.setString("id", "MinecartFurnace");
            }

            p_75615_0_.removeTag("Type");
        }

        Class oclass = null;
        try
        {
            oclass = (Class)stringToClassMapping.get(p_75615_0_.getString("id"));

            if (oclass != null)
            {
                entity = (Entity)oclass.getConstructor(new Class[] {World.class}).newInstance(new Object[] {p_75615_1_});
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        if (entity != null)
        {
            try
            {
                entity.readFromNBT(p_75615_0_);
            }
            catch (Exception e)
            {
                FMLLog.log(Level.ERROR, e,
                        "An Entity %s(%s) has thrown an exception during loading, its state cannot be restored. Report this to the mod author",
                        p_75615_0_.getString("id"), oclass.getName());
                entity = null;
            }
        }
        else
        {
            logger.warn("Skipping Entity with id " + p_75615_0_.getString("id"));
        }

        return entity;
    }

    /**
     * Create a new instance of an entity in the world by using an entity ID.
     */
    public static Entity createEntityByID(int p_75616_0_, World p_75616_1_)
    {
        Entity entity = null;

        try
        {
            Class oclass = getClassFromID(p_75616_0_);

            if (oclass != null)
            {
                entity = (Entity)oclass.getConstructor(new Class[] {World.class}).newInstance(new Object[] {p_75616_1_});
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        if (entity == null)
        {
            logger.warn("Skipping Entity with id " + p_75616_0_);
        }

        return entity;
    }

    /**
     * gets the entityID of a specific entity
     */
    public static int getEntityID(Entity p_75619_0_)
    {
        Class oclass = p_75619_0_.getClass();
        return classToIDMapping.containsKey(oclass) ? ((Integer)classToIDMapping.get(oclass)).intValue() : 0;
    }

    /**
     * Return the class assigned to this entity ID.
     */
    public static Class getClassFromID(int p_90035_0_)
    {
        return (Class)IDtoClassMapping.get(Integer.valueOf(p_90035_0_));
    }

    /**
     * Gets the string representation of a specific entity.
     */
    public static String getEntityString(Entity p_75621_0_)
    {
        return (String)classToStringMapping.get(p_75621_0_.getClass());
    }

    /**
     * Finds the class using IDtoClassMapping and classToStringMapping
     */
    public static String getStringFromID(int p_75617_0_)
    {
        Class oclass = getClassFromID(p_75617_0_);
        return oclass != null ? (String)classToStringMapping.get(oclass) : null;
    }

    public static void func_151514_a() {}

    public static Set func_151515_b()
    {
        return Collections.unmodifiableSet(stringToIDMapping.keySet());
    }

    static
    {
   	 addMapping(EntityItem.class, "Item", 1);
   	 addMapping(EntityLiving.class, "Mob", 48);
   	 addMapping(EntityMob.class, "Monster", 49);
   	addMapping(EntityKirby.class, "Kirby", 401,15771042 , 14377823);
 	addMapping(EntityWaddleDee.class, "Waddle Dee", 400,15771042 , 14377823);
 	addMapping(EntityDedede.class, "Dedede", 403,15771042 , 14377823);
 	addMapping(EntityBlipper.class, "Blipper", 404,15771042 , 14377823);
	addMapping(EntityWispy.class, "Wispy", 415,15771042 , 14377823);
    addMapping(EntityWaddleDoo.class, "Waddle Doo", 416, 1511121, 14377823);
    }

    public static class MyEntityEggInfo
        {
            /** The entityID of the spawned mob */
            public final int spawnedID;
            /** Base color of the egg */
            public final int primaryColor;
            /** Color of the egg spots */
            public final int secondaryColor;
            public final StatBase field_151512_d;
            public final StatBase field_151513_e;

            public MyEntityEggInfo(int p_i1583_1_, int p_i1583_2_, int p_i1583_3_)
            {
                this.spawnedID = p_i1583_1_;
                this.primaryColor = p_i1583_2_;
                this.secondaryColor = p_i1583_3_;
                this.field_151512_d = CustomStatList.func_151182_a(this);
                this.field_151513_e = CustomStatList.func_151176_b(this);
            }
        }
}
