package dev.realz.tutorial;

import dev.realz.tutorial.init.ModBlocks;
import dev.realz.tutorial.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "tm";

    @Override
    public void onInitialize() {
        ModItems.registerIngots();
        ModBlocks.registerOres();
    }
}
