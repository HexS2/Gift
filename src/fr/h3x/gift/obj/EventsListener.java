package fr.h3x.gift.obj;/*
Gift @Author: CTRL 18:31
 */

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class EventsListener implements Listener {


    @EventHandler
    public void onInventoryCloseEvent(InventoryCloseEvent e){
        Player p = (Player)e.getPlayer();
        if(p.hasPermission("qataria.youuber")){
            //rtestesteste
        }
    }
}
