package com.llamalad7.hyperiumfriendsgui;

import com.llamalad7.hyperiumfriendsgui.command.CommandForGUI;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "hyperiumfriendsgui", name = "Hypixel Friends GUI (From Hyperium)", version = "1.0")
public class HyperiumFriendsGUIMod
{

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		Keybinds.register();

		MinecraftForge.EVENT_BUS.register(new KeybindHandler());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ClientCommandHandler.instance.registerCommand(new CommandForGUI(this)); // Register command.
	}
}
