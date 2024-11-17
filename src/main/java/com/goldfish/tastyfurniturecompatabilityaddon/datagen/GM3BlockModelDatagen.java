package com.goldfish.tastyfurniturecompatabilityaddon.datagen;

import com.goldfish.tastyfurniturecompatabilityaddon.registry.compatTastyBlockRegistry;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class GM3BlockModelDatagen extends BlockStateProvider{

    public GM3BlockModelDatagen(PackOutput output, String string, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod03tastyfurniturecompatibilityaddon", existingFileHelper);
        this.output = output;
        this.existingFileHelper = existingFileHelper;
    }

    private final PackOutput output;
    private final ExistingFileHelper existingFileHelper;

    @Override
    protected void registerStatesAndModels() {
        Block elderberry_block = compatTastyBlockRegistry.ELDERBERRY_BLOCK.get();
        simpleBlock(elderberry_block);
    }
    
}
