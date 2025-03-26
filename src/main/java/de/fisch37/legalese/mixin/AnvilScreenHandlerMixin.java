package de.fisch37.legalese.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin {
    @Redirect(
            method = "sanitize",
            at = @At(value = "INVOKE", target = "Ljava/lang/String;length()I")
    )
    private static int lengthOverride(String string) {
        return 10;
    }
}
