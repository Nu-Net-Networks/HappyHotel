package com.github.nunetnetworks.HappyHotel;

import java.util.List;

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
    		sender.sendMessage("§9--== §aHappy Hotel Info§9 ==--§f");
    		sender.sendMessage("§9Base Room Rate:§f " + HappyHotel.this.getConfig().getDouble("BaseRoomRate"));
    		sender.sendMessage("§9Membership System Status:§f " + HappyHotel.this.getConfig().getBoolean("membership"));
            return true;
    	} else if (cmd.getName().equalsIgnoreCase("hh-help")){ // If the player typed /basic then do the following...
    		List<String> help = HappyHotel.this.getConfig().getStringList("help");
    		sender.sendMessage("§9--== §aHappy Hotel Help§9 ==--§f");
            for (String s : help)
                sender.sendMessage(s);
            return true;
    	}
    	return false;
    }
}
