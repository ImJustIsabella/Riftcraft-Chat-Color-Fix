package com.riftcraftsmp.chatfix;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.Team;

import net.md_5.bungee.api.ChatColor;

public class Fix implements Listener {

	public Fix(Plugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void chat(AsyncPlayerChatEvent event) {
		event.setCancelled(true);
		Team t = event.getPlayer().getScoreboard().getPlayerTeam(event.getPlayer());
		
		if(t != null) {
			Bukkit.broadcastMessage("<" + t.getPrefix() + event.getPlayer().getName() + t.getSuffix() + ChatColor.WHITE + "> " + event.getMessage());
		} else {
			Bukkit.broadcastMessage("<" + event.getPlayer().getName() + "> " + event.getMessage());
		}
	}
}
