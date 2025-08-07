package net.divinesilence.tdsmod.Item;

import net.divinesilence.tdsmod.TDSMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TARANTULA_FANG = registerItem("tarantula_fang", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TDSMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TDSMod.LOGGER.info("Registering Mod Items for" + TDSMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->
                entries.add(TARANTULA_FANG));
    }
}
