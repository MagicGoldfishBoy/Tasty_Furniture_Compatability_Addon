package com.goldfish.tastyfurniturecompatabilityaddon.datagen;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class GM3Datagen {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static ExistingFileHelper ExistingFileHelper;

    public static void gatherData(GatherDataEvent event) {

        //Block Models
        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
            event.includeClient(),
            new GM3BlockModelDatagen(output, "goldfishmod03productivetastyfurniture", existingFileHelper));
            
        } catch (Exception e) {
            LOGGER.error("failed to generate item models" + e);
        }
      
 }
}

