package net.arcanecourt.starlitorigins.util;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.gui.overlays.ScreenOverlays;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StarlitOrigins.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModOverlays {
    @SubscribeEvent
    public static void registerOverlays(RegisterGuiOverlaysEvent event) {
        event.registerAboveAll("screen_overlays", ScreenOverlays.INSTANCE);
    }

}
