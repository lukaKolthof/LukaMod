package com.LukaKolthof.LukaMod.items;

import com.LukaKolthof.LukaMod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RubyApple extends Item {
    public RubyApple() {
        super(new Item.Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(5.5f)
                        .effect(new EffectInstance(Effects.SATURATION, 400, 6), 1)
                        .effect(new EffectInstance(Effects.REGENERATION, 400, 6), 1)
                        .effect(new EffectInstance(Effects.ABSORPTION, 400, 6),1)
                        .effect(new EffectInstance(Effects.STRENGTH, 400, 6),1)
                        .effect(new EffectInstance(Effects.WATER_BREATHING, 400, 6),1)
                        .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 400, 6),1)
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 400, 6),1)
                        .effect(new EffectInstance(Effects.RESISTANCE, 400, 6),1)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 400, 6),1)
                        .setAlwaysEdible()
                        .build())


        );
    }
}
