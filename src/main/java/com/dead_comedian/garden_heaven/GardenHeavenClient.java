package com.dead_comedian.garden_heaven;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class GardenHeavenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
       // BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAFLESSIA, RenderLayer.getCutout());


    }
}

