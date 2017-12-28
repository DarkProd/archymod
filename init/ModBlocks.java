package fr.darkprod.archymod.init;

import fr.darkprod.archymod.References;
import fr.darkprod.archymod.blocks.BlockArchyBush;
import fr.darkprod.archymod.blocks.BlockBase;
import fr.darkprod.archymod.blocks.BlockInventoryFurnace;
import fr.darkprod.archymod.blocks.CaveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks
{

	public static final Block ArchydiumBlock = new BlockBase("ArchydiumBlock", Material.ROCK, 3F, 10F);
	public static final Block ArchydiumOre = new BlockBase("ArchydiumOre", Material.ROCK, 3F, 10F);
	public static final Block ArpazBlock = new BlockBase("ArpazBlock", Material.ROCK, 3F, 10F);
	public static final Block ArpazOre = new BlockBase("ArpazOre", Material.ROCK, 3F, 10F);
	public static final Block ArchydiumFurnace = new BlockInventoryFurnace("ArchydiumFurnace",10F,3F);
	public static final Block ArzotOre = new BlockBase("ArzotOre",Material.ROCK,3F,10F);
	//public static final Block CaveBlock = new CaveBlock("CaveBlock");

	public static final Block ArchyBush = new BlockArchyBush("ArchyBush");

	private static void initBlocks()
	{

	}
	public static void registerBlocks()
	{

		

		registerBlock(ArchydiumOre);
		registerBlock(ArchydiumBlock);
		registerBlock(ArpazBlock);
		registerBlock(ArpazOre);
		registerBlock(ArchydiumFurnace);
		registerBlock(ArzotOre);
		registerBlock(ArchyBush);
		//registerBlock(CaveBlock);
		initBlocks();



	}

	public static void registerBlockRenders()
	{
		registerBlockRender(ArchydiumBlock);
		registerBlockRender(ArchydiumOre);
		registerBlockRender(ArpazBlock);
		registerBlockRender(ArpazOre);
		registerBlockRender(ArchydiumFurnace);
		registerBlockRender(ArzotOre);
		registerBlockRender(ArchyBush);
		//registerBlockRender(CaveBlock);

	}

	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
	}

	private static void registerBlockRender(Block block)
	{
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		GameRegistry.register(ib);

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
}
