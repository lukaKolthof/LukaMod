package com.LukaKolthof.LukaMod.blocks;

import com.LukaKolthof.LukaMod.Tutorial;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Tutorial.TAB));
    }
}
