package de.fisch37.legalese.mixin.client;

import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public class AnvilScreenMixin {
    @ModifyConstant(method = "setup", constant = @Constant(intValue = 50))
    private int modifyMaxLength(int original) {
        return Integer.MAX_VALUE;
    }
}
