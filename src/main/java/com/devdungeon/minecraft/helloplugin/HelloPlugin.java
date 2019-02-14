package com.devdungeon.minecraft.helloplugin;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlugin extends JavaPlugin {
    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
        Bukkit.getPluginManager().registerEvents(new HelloListener(), this);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hello")) { // your command name
            if (!(sender instanceof Player)) //this makes sure its a player executing the command
                return true;
        } else {
            return false;
        }

        Bukkit.broadcastMessage("Hello to all!");
        for (Player player: Bukkit.getOnlinePlayers()) {
            player.sendMessage("Hello!");
        }

        return true;
    }

    // This code is called before the server stops and after the /reload command
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
    }



}
