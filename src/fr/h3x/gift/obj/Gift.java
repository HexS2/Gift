package fr.h3x.gift.obj;/*
Gift @Author: CTRL 22:29
 */

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Gift {

    private Player donator;
    private Player receiver;
    private Inventory[] content;

    public Gift(Player donator, Player receiver, Inventory[] content) {
        this.donator = donator;
        this.receiver = receiver;
        this.content = content;
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
