package fr.darkprod.archymod.blocks;

import fr.darkprod.archymod.ArchyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class CaveBlock extends Block
{
public CaveBlock(String name)
{
  super(Material.GLASS);
  setCreativeTab(ArchyMod.ArchyMod);
  setHarvestLevel("pickaxe", 1);
  setRegistryName(name);
  setUnlocalizedName(name);
  setResistance(4.0F);
  setHardness(4.0F);
}
 public boolean isOpaqueCube(IBlockState i) {
	return true;
}
}

