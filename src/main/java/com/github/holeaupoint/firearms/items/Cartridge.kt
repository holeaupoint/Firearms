package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items

import net.minecraft.item.Item
import net.minecraft.item.ItemStack

class Cartridge(
    settings: Settings,
    private val damage: Double,
    private val armorPen: Double,
    private val caliber: Calibers,
    private val velocity: Double,

    ) : Item(settings) {

    /**
     * -- THE CARTRIDGE FORMAT GUIDE --
     * 0x00 00 00 00
     * 0b0000 0000  0000 0000  0000 0000  0000 0000
     * The first 2 bits indicate projectile type.
     * The next 6 bits indicate caliber.
     *      Actually, you probably won't need to do this. The caliber will already be set in a
     *      parent Magazine property once the first Cartridge ItemStack is put in it,
     *      which means there will be checks to confirm that the loading Cartridge is
     *      compatible with the current Calibers state of the Magazine. Same goes for unloading the
     *      magazine; due to the checks done when the first Cartridge was loaded,
     *      you can guarantee that the unloaded Cartridges will retain their Calibers type
     *      when created, along with other factors like the projectile and powder load.
     * The next 4 bits indicate damage level.
     * The next 4 bits indicate armor penetration level.
     * The next 4 bits indicate... Well, add information later. Maybe this will change entirely.
     */

    public fun createCartridge(cartridgeBytes : Int) : ItemStack {
        // Return a Cartridge
    }

    public fun cartridgeToInt(cartridge: Cartridge): Int {
        // Return a cartridge in Integer format to be processed later
    }

    public fun createOrSetTag(itemStack: ItemStack) {

    }
}