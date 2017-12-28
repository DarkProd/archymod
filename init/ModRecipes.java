package fr.darkprod.archymod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	
	public static void initAll() {
		
		GameRegistry.addRecipe(new ItemStack(ModItems.PremiumLeather, 4), new Object[] {"fFf", "fJf", "fFf", 'F', ModItems.ArpazIngot, 'f', Items.LEATHER,'J',ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumAxe, 1), new Object[] {" ff", " Ff", " F ", 'f', ModItems.ArchydiumIngot, 'F', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumShovel, 1), new Object[] {" f ", " F ", " F ", 'f', ModItems.ArchydiumIngot, 'F', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumSword, 1), new Object[] {" f ", " f ", " F ", 'f', ModItems.ArchydiumIngot, 'F', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumPickaxe, 1), new Object[] {"fff", " F ", " F ", 'f', ModItems.ArchydiumIngot, 'F', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumHelmet, 1), new Object[] {"fff" , "f f" , 'f' , ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumChestplate, 1), new Object[] {"f f" , "fff" , "fff" , 'f' , ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumLeggings, 1), new Object[] {"fff" , "f f" , "f f" , 'f' , ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumBoots, 1), new Object[] {"f f","f f",'f',ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.CompressedArchydium),new Object[] { "FFF","FGF","FFF", 'F', ModBlocks.ArchydiumBlock,'G',ModBlocks.ArpazBlock});
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"f  ","   ","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {" f ","   ","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"  f","   ","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   ","f  ","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   "," f ","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   ","  f","   ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   ","   ","f  ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   ","   "," f ",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {"   ","   ","  f",'f',Blocks.CLAY });
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumStick, 2),new Object[] {"f  ","f  ",'f',ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumStick, 2),new Object[] {" f "," f ",'f',ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumStick, 2),new Object[] {"  f","  f",'f',ModItems.ArchydiumIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchyPower, 1),new Object[] {" ff"," Ff","F  ",'f',ModItems.CompressedArchydium,'F',ModItems.ArchydiumStick});
		GameRegistry.addRecipe(new ItemStack(ModItems.ArchydiumSteak),new Object[] {"FFF","FGF","FFF",'F',ModItems.ArchydiumIngot,'G',Items.COOKED_BEEF});
	
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ArchydiumBlock), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(ModItems.ArchydiumIngot) });	
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ArchydiumFurnace), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(ModBlocks.ArchydiumBlock),Character.valueOf('Z'),new ItemStack(ModItems.CompressedArchydium) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ArpazBlock), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(ModItems.ArpazIngot) });	

		GameRegistry.addRecipe(new ItemStack(ModItems.ArchyHammer), new Object[] { "XXX", "XXX", "G", Character.valueOf('X'), new ItemStack(ModBlocks.ArchydiumBlock),Character.valueOf('G'), Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModItems.BackPack),new Object[] {"XXX", "XGX","XXX",'X', ModItems.PremiumLeather,'G',Blocks.CHEST} );
		

		
	   /* final float SMELT_XP = 0.5F; 
	    final int NUMBER_OF_ITEMS = 1;
	    final int METADATA_VALUE = 1;
	    GameRegistry.addSmelting(ModBlocks.ArchydiumOre, new ItemStack(ModItems.ArchydiumIngot, NUMBER_OF_ITEMS), SMELT_XP);
	    GameRegistry.addSmelting(ModBlocks.ArpazOre, new ItemStack(ModItems.ArpazIngot,NUMBER_OF_ITEMS), SMELT_XP);
	    GameRegistry.addSmelting(ModBlocks.ArzotOre, new ItemStack(ModItems.Arzot,NUMBER_OF_ITEMS) ,SMELT_XP);*/

	}

}
