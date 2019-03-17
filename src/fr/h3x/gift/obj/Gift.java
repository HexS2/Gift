package fr.h3x.gift.obj;/*
Gift @Author: CTRL 22:29
 */

import fr.h3x.gift.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;

public class Gift {

    private Player donator;
    private Player receiver;
    private ItemStack[] content;
    private Main plugin;
    public Gift(Main plugin,Player donator, Player receiver,ItemStack[] content) {
        this.plugin = plugin;
        this.donator = donator;
        this.receiver = receiver;
        this.content = content;
    }

    public boolean sendGift(){
        FileConfiguration fc = plugin.getGiftFileConfiguration();
        fc.set(receiver.getUniqueId().toString()+".dons."+donator.getUniqueId().toString(),content);
        try {
            fc.save(plugin.getGiftFile());
            donator.sendMessage("§aDons envoyé");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Inventory donatorIventory(){
        return Bukkit.createInventory(donator,54,"§7> §bDon pour §6 "+receiver.getName());
    }
    public Gift getGift(){

        return null;
    }

    public void setContent(ItemStack[] content) {
        this.content = content;
    }

    public ItemStack[] getContent() {
        return content;
    }

    public Player getDonator() {
        return donator;
    }

    public Player getReceiver() {
        return receiver;
    }
}
