package fr.darkprod.archymod.events;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEvents {

	  @SubscribeEvent
	  public void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
		  Minecraft mc = Minecraft.getMinecraft();
		  if (mc.thePlayer != null) {
			  int fps = Minecraft.getDebugFPS();
			
			  mc.fontRendererObj.drawString("FPS: " +fps, 10, 10, Color.RED.getRed());
			 
		}
		  
		  if (mc.thePlayer != null) {
			  String version = Minecraft.getMinecraft().getVersion();
			  mc.fontRendererObj.drawString("Version: "+version, 10, 20, Color.RED.getRed());
	}
}
}
