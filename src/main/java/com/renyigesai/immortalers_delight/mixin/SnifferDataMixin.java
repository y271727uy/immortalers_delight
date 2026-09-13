package com.renyigesai.immortalers_delight.mixin;

import com.renyigesai.immortalers_delight.api.SnifferAnimations;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Mob.class)
public abstract class SnifferDataMixin {
    @Inject(method = "defineSynchedData()V", at = @At("TAIL"))
    private void immortalersDelight$defineAnimationData(CallbackInfo ci) {
        if ((Object) this instanceof Sniffer sniffer) {
            sniffer.getEntityData().define(SnifferAnimations.HAPPY_TICKS, 0);
        }
    }
}
