package fr.h3x.gift.command;/*
Gift @Author: CTRL 22:41
 */

import fr.h3x.gift.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GiftCommand implements CommandExecutor {

    private Main plugin;

    public GiftCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if(commandSender instanceof Player){
            Player p = (Player) commandSender;
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("open")){
                    if(p.hasPermission("qataria.youtuber")){

                    }
                }else{
                    Player cible = Bukkit.getPlayer(args[0]);
                    if (cible.hasPermission("Qataria.Youtubeur"))
                    {
                        Inventory inv = Bukkit.createInventory(null, 54, "§7> §bDon pour §6" + cible.getName());
                     //   Gift gift = new Gift(plugin,p,cible,);
                    }
                }
            }
        }
        return false;
    }
}
