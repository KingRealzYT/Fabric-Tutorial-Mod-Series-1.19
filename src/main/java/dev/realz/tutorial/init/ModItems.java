package dev.realz.tutorial.init;

import dev.realz.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Ingots
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().maxCount(16).group(Tutorial.TUTORIALTAB));

    // Ingot Register
    public static void registerIngots() {
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
    }

}
