package com.example.items;

import com.example.ZeroLevelingMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup ZERO_LEVELING_GROUP;

    public static void registerItemGroups() {
        ZERO_LEVELING_GROUP = FabricItemGroup.builder(new Identifier(ZeroLevelingMod.MOD_ID, "zerolevelinggroup"))
                .displayName(Text.translatable("itemgroup.zerolevelinggroup"))
                .icon(() -> new ItemStack(ModItems.SAPPHIRE))
                .build();
    }

}
