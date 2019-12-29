package com.llamalad7.hyperiumfriendsgui;

import com.llamalad7.hyperiumfriendsgui.gui.HypixelFriendsGui;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeybindHandler {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if (Keybinds.hello.isPressed())
        {
            //Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("sup"));
            Minecraft.getMinecraft().displayGuiScreen(new HypixelFriendsGui());
        }
    }
}
