package com.devdungeon.minecraft.helloplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class HelloListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        System.out.println("someone chatted!");
        System.out.println(event);

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        System.out.println(event.getEntity().getPlayer().getDisplayName() + " died!");
        System.out.println(event);

    }
}
