package fr.darkprod.archymod.init;

import fr.darkprod.archymod.ArchyMod;
import fr.darkprod.archymod.References;
import fr.darkprod.archymod.items.Arzot;
import fr.darkprod.archymod.items.BackPack;
import fr.darkprod.archymod.items.ArchyBushItem;
import fr.darkprod.archymod.items.ArchyHang;
import fr.darkprod.archymod.items.ArchyPower;
import fr.darkprod.archymod.items.ArchydiumAxe;
import fr.darkprod.archymod.items.ArchydiumIngot;
import fr.darkprod.archymod.items.ArchydiumStick;
import fr.darkprod.archymod.items.ArpazIngot;
import fr.darkprod.archymod.items.CompressedArchydium;
import fr.darkprod.archymod.items.Dynamite;
import fr.darkprod.archymod.items.ItemArchydiumPickaxe;
import fr.darkprod.archymod.items.ItemArchydiumShovel;
import fr.darkprod.archymod.items.ItemArchydiumSteak;
import fr.darkprod.archymod.items.ItemArchydiumSword;
import fr.darkprod.archymod.items.ItemHammer;
import fr.darkprod.archymod.items.PremiumLeather;
import fr.darkprod.archymod.items.armors.ItemArmorArchydium;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

	// Création de l'item
	
	
	public static final ArmorMaterial ArchydiumMat = EnumHelper.addArmorMaterial("Archydium", References.MOD_ID + ":archydium", 53, new int[]{2, 4, 3, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ToolMaterial ARCHYDIUM = EnumHelper.addToolMaterial("ARCHYDIUM",2, 3000, 10, 4, 25);
	
	public static final Item ArchydiumSteak= new ItemArchydiumSteak("ArchydiumSteak", 5, 100.0F, false);
	
	public static final Item ArchyBushItem = new ArchyBushItem("ArchyBushItem");
	
	public static final Item Dynamite = new Dynamite("Dynamite");
	
	public static final Item ArchyHammer = new ItemHammer("ArchyHammer",ARCHYDIUM);
	
	public static final Item BackPack = new BackPack("BackPack");
	
	public static final Item ArchyHang = new ArchyHang("ArchyHang");
	
	
	public static final Item ArchydiumIngot = new ArchydiumIngot("ArchydiumIngot");
	public static final Item PremiumLeather = new PremiumLeather("PremiumLeather");
	public static final Item ArpazIngot = new ArpazIngot("ArpazIngot");
	public static final Item ArchyPower = new ArchyPower("ArchyPower");
	public static final Item ArchydiumStick = new ArchydiumStick("ArchydiumStick");
	public static final Item CompressedArchydium = new CompressedArchydium("CompressedArchydium");
	
	public static final Item Arzot = new Arzot("Arzot");
	
	public static final Item ArchydiumAxe = new ArchydiumAxe("ArchydiumAxe", ARCHYDIUM,6.0F, 10.0F);
	public static final Item ArchydiumPickaxe = new ItemArchydiumPickaxe("ArchydiumPickaxe", ARCHYDIUM,6.0F,2.0F);
	public static final Item ArchydiumSword = new ItemArchydiumSword("ArchydiumSword", ARCHYDIUM,10.0F, 3.0F);	
	public static final Item ArchydiumShovel = new ItemArchydiumShovel("ArchydiumShovel", ARCHYDIUM,6.0F,2.0F);


	public static final Item ArchydiumHelmet = new ItemArmorArchydium("ArchydiumHelmet",1, ArchydiumMat, EntityEquipmentSlot.HEAD);
	public static final Item ArchydiumChestplate = new ItemArmorArchydium("ArchydiumChestplate",1, ArchydiumMat, EntityEquipmentSlot.CHEST);
	public static final Item ArchydiumLeggings = new ItemArmorArchydium("ArchydiumLeggings",2, ArchydiumMat, EntityEquipmentSlot.LEGS);
	public static final Item ArchydiumBoots = new ItemArmorArchydium("ArchydiumBoots",1, ArchydiumMat, EntityEquipmentSlot.FEET);


	//Initialisation des items
	private static void initItems()
	{
	
		
	}

	public static void registerItems()
	{

		initItems();
		registerItem(ArchyHammer);
		registerItem(ArchyBushItem);
		registerItem(Dynamite);
		registerItem(Arzot);
		//registerItem(ArchyPack);
		registerItem(ArchyHang);
		
		registerItem(ArchydiumSteak);
		
		registerItem(ArchydiumAxe);
		registerItem(ArchydiumPickaxe);
		registerItem(ArchydiumShovel);
		registerItem(ArchydiumSword);

		registerItem(ArchydiumHelmet);
		registerItem(ArchydiumChestplate);
		registerItem(ArchydiumLeggings);
		registerItem(ArchydiumBoots);
		
		registerItem(BackPack);

		registerItem(ArchydiumIngot);
		registerItem(PremiumLeather);
		registerItem(ArpazIngot);
		registerItem(ArchyPower);
		registerItem(ArchydiumStick);
		registerItem(CompressedArchydium);
		

		


	}

	public static void registerItemRenders()
	{

		registerItemRender(ArchydiumHelmet);
		registerItemRender(ArchyHammer);
		registerItemRender(ArchyBushItem);
		registerItemRender(ArchydiumChestplate);
		registerItemRender(ArchydiumLeggings);
		registerItemRender(ArchydiumBoots);
		registerItemRender(ArchydiumIngot);
		registerItemRender(PremiumLeather);
		registerItemRender(ArpazIngot);
		registerItemRender(ArchyPower);
		registerItemRender(ArchydiumStick);
		registerItemRender(CompressedArchydium);
		registerItemRender(ArchydiumAxe);
		registerItemRender(ArchyHang);
		registerItemRender(ArchydiumPickaxe);
		registerItemRender(ArchydiumShovel);
		registerItemRender(ArchydiumSword);
		registerItemRender(Arzot);
		registerItemRender(Dynamite);
		//registerItemRender(ArchyPack);
		registerItemRender(ArchydiumSteak);
		registerItemRender(BackPack);


	}

	private static void registerItem(Item item)
	{
		GameRegistry.register(item);
	}

	private static void registerItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

	private static void registerItemRenderWithMeta(Item item, int meta, String[] variants)
	{

		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MOD_ID, variants[meta] + item.getUnlocalizedName().substring(5)), "inventory"));

	}

}
