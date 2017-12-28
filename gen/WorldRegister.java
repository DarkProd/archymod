package fr.darkprod.archymod.gen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldRegister {

	
	public static class GenUtils
	{

		private static OreGeneration oreGeneration = new OreGeneration();

		public static final void registerWorldGenerations()
		{

			GameRegistry.registerWorldGenerator(oreGeneration, 0);

		}

	}
}
