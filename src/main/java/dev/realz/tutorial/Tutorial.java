package dev.realz.tutorial;

import dev.realz.tutorial.init.ModBlocks;
import dev.realz.tutorial.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "tm";

    public static final ItemGroup TUTORIALTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "tutorialtab"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT));

    @Override
    public void onInitialize() {
        ModItems.registerIngots();
        ModBlocks.registerOres();
    }
}
