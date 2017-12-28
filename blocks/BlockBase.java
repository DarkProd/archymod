package fr.darkprod.archymod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import fr.darkprod.archymod.ArchyMod;
import fr.darkprod.archymod.init.ModBlocks;
import fr.darkprod.archymod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockBase extends Block
{
	public BlockBase(String name, Material materialIn, float hardness, float resistance)
	{
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setHardness(hardness);
		this.setResistance(resistance);

		this.setCreativeTab(ArchyMod.ArchyMod);
	}
	@Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == ModBlocks.ArchydiumOre ? ModItems.ArchydiumIngot : (this == ModBlocks.ArpazOre ? ModItems.ArpazIngot : (this == ModBlocks.ArzotOre ? ModItems.Arzot : Item.getItemFromBlock(this)));
    }
	@Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
