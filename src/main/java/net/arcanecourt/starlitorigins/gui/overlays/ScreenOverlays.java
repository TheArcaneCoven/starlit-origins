package net.arcanecourt.starlitorigins.gui.overlays;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.effect.ModEffects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import org.jetbrains.annotations.UnknownNullability;

public class ScreenOverlays implements IGuiOverlay {
    public static final ScreenOverlays INSTANCE = new ScreenOverlays();

    public static final ResourceLocation VOIDKIN_VENOM_OVERLAY = ResourceLocation.fromNamespaceAndPath (StarlitOrigins.MOD_ID, "textures/gui/overlays/voidkin_venom_overlay.png");

    @Override
    public void render(ForgeGui gui, GuiGraphics guiGraphics, float partialTick, int screenWidth, int screenHeight) {
        Player player = Minecraft.getInstance().player;
        if (player == null) {
            return;
        }

        if (player.hasEffect(ModEffects.VOIDKIN_VENOM.get())) {
            displayOverlay(guiGraphics, VOIDKIN_VENOM_OVERLAY, 1f, 1f, 1f, 1.0f, screenWidth, screenHeight);
        }
    }

    private static void displayOverlay(GuiGraphics gui, ResourceLocation texture, float r, float g, float b, float a, int screenWidth, int screenHeight) {
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(true);
        RenderSystem.enableBlend();
        gui.setColor(r, g, b, a);
        gui.blit(texture, 0, 0, -100, 0.0F, 0.0F, screenWidth, screenHeight, screenWidth, screenHeight);
    }
}
