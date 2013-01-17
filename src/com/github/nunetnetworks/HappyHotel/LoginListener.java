package com.github.nunetnetworks.HappyHotel;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {
    @EventHandler
    public void normalLogin(PlayerLoginEvent event) {
    	event.getPlayer().sendMessage("§9--== §aWelcom From The Happy Hotel System§9 ==--§f");
    }
 
    @EventHandler(priority = EventPriority.HIGH)
    public void highLogin(PlayerLoginEvent event) {
        // Some code here
    }
}
