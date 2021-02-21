package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items.ingredients

import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.TypedActionResult
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.world.World

class BlackPowder(settings: Settings?) : Item(settings) {

    // Placeholder event
    override fun use(world: World?, playerEntity: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack?>? {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0f, 1.0f)
        return TypedActionResult.success(playerEntity.getStackInHand(hand))
    }

    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext?
    ) {
        tooltip.add( TranslatableText("item.firearms.blackpowder.tooltip"))
    }
}