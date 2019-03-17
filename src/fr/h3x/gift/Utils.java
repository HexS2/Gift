package fr.h3x.gift;/*
Gift @Author: CTRL 17:55
 */

import fr.h3x.gift.obj.Gift;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static ArrayList<Gift> gifts = new ArrayList<Gift>();
    private Main plugin;

    public Utils(Main plugin) {
        this.plugin = plugin;
    }


    public List<Gift> getGifts(){


        return null;
    }
    public Gift getGift(Player donator){
        Gift gift = null;
        for (Gift t : Utils.gifts) {
            if (t.getDonator().getName().equalsIgnoreCase(donator.getName())) {
                gift = t;
            }
        }
        return gift;
    }
    public Inventory openInventory(Player p ){

        return null;
    }


}
