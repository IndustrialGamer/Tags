package com.enjin.gamesplazabrasil;

import com.enjin.gamesplazabrasil.commands.SettagCommand;
import com.enjin.gamesplazabrasil.commands.TagCommand;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TagsMain extends JavaPlugin implements Listener {

    public static JavaPlugin instance;


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TagsEventHandler(), this);
        registerConfig();

        this.getCommand("tag").setExecutor(new TagCommand(this));
        this.getCommand("settag").setExecutor(new SettagCommand(this));
    instance = this;

    }

    public static JavaPlugin getInstance () {
        return  instance;

    }



    public void registerConfig(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();

    }


    @Override
    public void onDisable() {
        HandlerList.unregisterAll();
    }
}


