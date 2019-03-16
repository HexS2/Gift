package fr.h3x.gift;/*
Gift @Author: CTRL 22:29
 */

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    private File giftFile;

    public void onEnable(){
    giftFile = new File(getDataFolder()+"/gift.yml");
    }


    public File getGiftFile() {
        return giftFile;
    }

    public FileConfiguration getGiftFileConfiguration(){
        return new YamlConfiguration().loadConfiguration(giftFile);
    }
}
