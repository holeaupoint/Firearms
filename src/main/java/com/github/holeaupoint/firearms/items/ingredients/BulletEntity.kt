package com.github.holeaupoint.firearms.com.github.holeaupoint.firearms.items.ingredients

import net.minecraft.entity.EntityType
import net.minecraft.entity.projectile.thrown.ThrownEntity
import net.minecraft.world.World

class BulletEntity(entityType: EntityType<out ThrownEntity>?, world: World?) : ThrownEntity(entityType, world) {
    // The Bullet Entity when attack() is invoked
}