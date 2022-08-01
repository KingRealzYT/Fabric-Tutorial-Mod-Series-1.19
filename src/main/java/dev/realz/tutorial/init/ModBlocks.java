package dev.realz.tutorial.init;

import dev.realz.tutorial.Tutorial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Ore's
    public static final OreBlock BLACK_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    // Register Ore's
    public static void registerOres() {
        Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, "black_iron_ore"), BLACK_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "black_iron_ore"),
                new BlockItem(BLACK_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
