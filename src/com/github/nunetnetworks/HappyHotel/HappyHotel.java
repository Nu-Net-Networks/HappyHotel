package com.github.nunetnetworks.HappyHotel;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class HappyHotel extends JavaPlugin implements Listener {
	
	//private ConfigAccessor CA;
	
	@Override
	public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new LoginListener(), this);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("hh-info")){
    		sender.sendMessage("�9--== �aHappy Hotel Info�9 ==--�f");
    		sender.sendMessage("�9Base Room Rate:�f " + HappyHotel.this.getConfig().getDouble("BaseRoomRate"));
    		sender.sendMessage("�9Membership System Status:�f " + HappyHotel.this.getConfig().getBoolean("membership"));
    		//sender.sendMessage("Test" + CA.getConfig().getInt("BaseRoomRate"));
            return true;
    	} else if (cmd.getName().equalsIgnoreCase("hh-help")){ // If the player typed /basic then do the following...
    		List<String> help = HappyHotel.this.getConfig().getStringList("help");
    		sender.sendMessage("�9--== �aHappy Hotel Help�9 ==--�f");
    		sender.sendMessage("hh-help - This list");
    		sender.sendMessage("hh-points - List hotel points");
    		sender.sendMessage("hh-info - list general HappyHotel info");
    		sender.sendMessage("hh-base (Base Rate) - List base rate, if base rate is listed set new base rate");
    		sender.sendMessage("hh-create [Hotel Name] - Start the mapping proses");
    		sender.sendMessage("hh-addroom [Hotel Name] - Add room to hotel");
    		sender.sendMessage("hh-list - List all hotels");
    		sender.sendMessage("hh-checkout - Check out of your room");
    		sender.sendMessage("hh-checkin Hotel Name - check in to listed hotel if room level is not listed default to 1");
            return true;
    	}
    	return false;
    }
}
