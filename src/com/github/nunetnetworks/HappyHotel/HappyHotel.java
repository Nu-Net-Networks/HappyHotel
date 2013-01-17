package com.github.nunetnetworks.HappyHotel;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class HappyHotel extends JavaPlugin implements Listener{
	
	public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("hh-info")){
    		sender.sendMessage("--== Happy Hotel Info ==--");
    		sender.sendMessage("Base Room Rate: " + this.getConfig().getDouble("BaseRoomRate"));
    		sender.sendMessage("Membership System Status: " + this.getConfig().getBoolean("membership"));
            return true;
    	}
    	return false;
    }
}
