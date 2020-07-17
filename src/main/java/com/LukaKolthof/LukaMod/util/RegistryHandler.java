package com.LukaKolthof.LukaMod.util;

import com.LukaKolthof.LukaMod.Tutorial;
import com.LukaKolthof.LukaMod.armor.ModArmorMaterial;
import com.LukaKolthof.LukaMod.blocks.BlockItemBase;
import com.LukaKolthof.LukaMod.blocks.RubyBlock;
import com.LukaKolthof.LukaMod.blocks.RubyOre;
import com.LukaKolthof.LukaMod.items.ItemBase;
import com.LukaKolthof.LukaMod.items.RubyApple;
import com.LukaKolthof.LukaMod.tools.ModitemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create (ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create (ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<RubyApple> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);

    //tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModitemTier.RUBY, 5, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModitemTier.RUBY, 0, -1.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModitemTier.RUBY, 0, -1.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModitemTier.RUBY, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModitemTier.RUBY, 0, -1.4f, new Item.Properties().group(Tutorial.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));

    // BLock
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));


}
