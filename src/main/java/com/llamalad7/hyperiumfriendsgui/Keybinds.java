package com.llamalad7.hyperiumfriendsgui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class Keybinds
{
    public static KeyBinding hello;

    public static void register()
    {
        hello = new KeyBinding("Hypixel Friends GUI", Keyboard.KEY_V, "key.categories.multiplayer");

        ClientRegistry.registerKeyBinding(hello);
    }
    public static void preInit(FMLPreInitializationEvent event)
    {
        Keybinds.register();
    }
}
