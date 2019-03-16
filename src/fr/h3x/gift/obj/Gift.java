package fr.h3x.gift.obj;/*
Gift @Author: CTRL 22:29
 */

import fr.h3x.gift.Main;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.io.IOException;

public class Gift {

    private Player donator;
    private Player receiver;
    private Inventory[] content;
    private Main plugin;
    public Gift(Main plugin,Player donator, Player receiver, Inventory[] content) {
        this.plugin = plugin;
        this.donator = donator;
        this.receiver = receiver;
        this.content = content;
    }

    public boolean sendGift(){
        plugin.getGiftFileConfiguration().set(receiver.getUniqueId().toString()+".dons",content);
        try {
            plugin.getGiftFileConfiguration().save(plugin.getGiftFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Gift getGift(){

        return null;
    }
    public Inventory[] getContent() {
        return content;
    }

    public Player getDonator() {
        return donator;
    }

    public Player getReceiver() {
        return receiver;
    }
}
