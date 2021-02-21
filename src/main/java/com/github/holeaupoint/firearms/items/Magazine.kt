package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items

import net.minecraft.item.Item
import java.util.*

class Magazine (
    settings: Settings?,
    private val capacity: Int,
    private val type: MagazineType,
    ) : Item(settings) {

    private var cartridges = LinkedList<Cartridge>()
}