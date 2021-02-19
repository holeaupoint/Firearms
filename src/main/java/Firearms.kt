package com.github.holeaupoint.firearms;

import com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items.BlackPowder
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class Firearms : ModInitializer {
    val namespace = "firearms"
    val firearmsGroup = FabricItemGroupBuilder.create(Identifier(namespace, "general"))
        .icon { ItemStack(Items.GUNPOWDER) }
        .build()

    val blackPowder = BlackPowder(FabricItemSettings().group(firearmsGroup))

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier(namespace, "blackpowder"), blackPowder)
    }
}