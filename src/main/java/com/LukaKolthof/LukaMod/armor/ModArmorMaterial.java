package com.LukaKolthof.LukaMod.armor;

import com.LukaKolthof.LukaMod.Tutorial;
import com.LukaKolthof.LukaMod.util.RegistryHandler;
import net.minecraft.client.audio.Sound;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.MinecartItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    // ruby_layer_1 ruby_layer_2
    RUBY(Tutorial.MOD_ID + ":ruby", 25, new int[] { 4, 7, 8, 5}, 13,
            SoundEvents.BLOCK_ANVIL_LAND, 1.0f, () -> { return Ingredient.fromItems(RegistryHandler.RUBY.get()); },
             1.0f),

    // emerald_layer_1 emerald_layer_2
    EMERALD(Tutorial.MOD_ID + ":emerald",25, new int[] { 6, 8, 10, 7}, 20,
            SoundEvents.BLOCK_ANVIL_LAND, 2.5f, () -> { return Ingredient.fromItems(Items.EMERALD); },
            1.5f);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance; // 0.0f - 1.0f

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
