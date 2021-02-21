package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items

import net.minecraft.item.Item

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
     * The next 4 bits indicate damage level.
     * The next 4 bits indicate armor penetration level.
     * The next 4 bits indicate... Well, add information later. Maybe this will change entirely.
     */

    public fun createCartridge(cartridgeBytes : Int) : Cartridge {
        // Return a Cartridge
    }

    public fun cartridgeToInt(cartridge: Cartridge): Int {
        // Return a cartridge in Integer format to be processed later
    }
}