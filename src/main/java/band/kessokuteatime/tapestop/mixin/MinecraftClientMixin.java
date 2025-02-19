package band.kessokuteatime.tapestop.mixin;

import band.kessokuteatime.tapestop.TapeStop;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Inject(method = "setScreen", at = @At("HEAD"))
	private void setScreen(CallbackInfo ci) {
		TapeStop.action();
	}
}
