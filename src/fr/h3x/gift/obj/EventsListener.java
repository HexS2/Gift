package fr.h3x.gift.obj;/*
Gift @Author: CTRL 18:31
 */

import fr.h3x.gift.Main;
import fr.h3x.gift.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class EventsListener implements Listener {
private Main plugin;

    public EventsListener(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }

    @EventHandler
    public void onInventoryCloseEvent(InventoryCloseEvent e){
        Player p = (Player)e.getPlayer();
        if(p.hasPermission("qataria.youuber")){
            Gift gift = null;
            if(plugin.getUtils().getGift(p) != null){
                gift = plugin.getUtils().getGift(p);
            }
            if(e.getInventory().getName().equals("§7> §bDon pour §6 "+gift.getReceiver().getName())){
                gift.setContent(e.getInventory().getContents());
                gift.sendGift();
            }
        }
    }
}
