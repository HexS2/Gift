package fr.h3x.gift;/*
Gift @Author: CTRL 22:29
 */

import fr.h3x.gift.command.GiftCommand;
import fr.h3x.gift.obj.EventsListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.EventListener;

public class Main extends JavaPlugin {

    private File giftFile;
    private Utils utils;

    public void onEnable(){
        giftFile = new File(getDataFolder()+"/gift.yml");
        new GiftCommand(this);
        utils= new Utils(this);
        new EventsListener(this);
    }

    public Utils getUtils() {
        return utils;
    }

    public File getGiftFile() {
        return giftFile;
    }

    public FileConfiguration getGiftFileConfiguration(){
        return new YamlConfiguration().loadConfiguration(giftFile);
    }
}
