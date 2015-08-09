package kirbyandfriends.schematics.hallberd;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;


public class WorldGenerationHalberd implements IWorldGenerator
{
 @Override
 public void generate(
 Random random, int chunkX, int chunkZ, World world,
IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
 {
int Xcoord = chunkX * 16 + random.nextInt(16);
int Ycoord = random.nextInt(200);
int Zcoord = chunkZ * 16 + random.nextInt(16);

 new BattleShipHalberd().generate(world, random, Xcoord, Ycoord, Zcoord);
 }
}