package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items

import com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items.gunparts.receivers.GunReceiver
import net.minecraft.item.Item

class Firearm(
    settings: Settings?,
    private val receiver: GunReceiver?,
    private val hasBoltHoldOpen: Boolean, // Does the bolt hold open after the last round?
    private val baseFireRate: Double, // Fire rate, modifiable
    ) : Item(settings) {

    private val isChambered: Boolean = false

/* How should reloading checks be handled? Check both the MagazineType and Calibers?
Keep in mind for AR builds, it can be the same MagazineType but different Caliber. For example, you can load
both .300BLK and .223REM in a STANAG type magazine, but obviously if the upper receiver has a .223REM barrel
the player shouldn't be able to shoot from a STANAG magazine with .300BLK rounds in it.
 */
}