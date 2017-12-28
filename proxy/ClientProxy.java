package fr.darkprod.archymod.proxy;

import fr.darkprod.archymod.events.ClientEvents;
import fr.darkprod.archymod.init.ModBlocks;
import fr.darkprod.archymod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit()
	{
		super.preInit();

		ModItems.registerItemRenders();
		ModBlocks.registerBlockRenders();
		MinecraftForge.EVENT_BUS.register(new ClientEvents());
	}

	@Override
	public void init()
	{
		super.init();
		

	}

	@Override
	public void postInit()
	{
		super.postInit();


	}


}
