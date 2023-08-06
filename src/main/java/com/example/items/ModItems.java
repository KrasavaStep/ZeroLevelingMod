package com.example.items;

import com.example.ZeroLevelingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item GEM = registerItem("gem", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterials.SAPPHIRE, 3, 2.6f, new Item.Settings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZeroLevelingMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, SAPPHIRE);
        addToItemGroup(ModItemGroup.ZERO_LEVELING_GROUP, SAPPHIRE);

        addToItemGroup(ItemGroups.INGREDIENTS, GEM);
        addToItemGroup(ModItemGroup.ZERO_LEVELING_GROUP, GEM);

        addToItemGroup(ItemGroups.COMBAT, SAPPHIRE_SWORD);
        addToItemGroup(ModItemGroup.ZERO_LEVELING_GROUP, SAPPHIRE_SWORD);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}
