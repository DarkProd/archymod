package fr.darkprod.archymod.proxy;

import fr.darkprod.archymod.ArchyMod;
import fr.darkprod.archymod.gui.GuiHandler;
import fr.darkprod.archymod.init.ModBlocks;
import fr.darkprod.archymod.init.ModItems;
import fr.darkprod.archymod.init.ModRecipes;
import fr.darkprod.archymod.tiles.TileInventoryFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {



	public void preInit()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();


	}

	public void init()
	{
	}

	public void postInit()
	{

		
	}

	public void registerRenderers() {
		
	}



}
