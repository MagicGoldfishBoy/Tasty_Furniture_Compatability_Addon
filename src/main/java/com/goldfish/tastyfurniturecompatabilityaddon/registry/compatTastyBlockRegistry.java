package com.goldfish.tastyfurniturecompatabilityaddon.registry;

import com.goldfish.tastyfurniturecompatabilityaddon.TastyFurnitureCompatabilityAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class compatTastyBlockRegistry {
    
    public static final DeferredRegister<Block> COMPATTASTYBLOCKREGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, TastyFurnitureCompatabilityAddon.MODID);

    public static final DeferredHolder<Block, Block> ELDERBERRY_BLOCK = COMPATTASTYBLOCKREGISTRY.register("elderberry_block",
    () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
}
