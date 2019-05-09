package com.riftcraftsmp.chatfix;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  // Not really needed just habit
	public static Plugin plugin;
	
	public void onEnable() {
		plugin = this;
		
		new Fix(this);
	}
	
}
