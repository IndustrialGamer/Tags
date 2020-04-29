package com.gamespalace.Main;


import com.gamespalace.Events.TagsEventHandler;
import com.gamespalace.Tags.SettagCommand;
import com.gamespalace.Tags.TagCommand;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TagsMain extends JavaPlugin implements Listener {



    public static TagsMain getPlugin(){
        return TagsMain.getPlugin(TagsMain.class);
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TagsEventHandler(), this);
        registerConfig();

        this.getCommand("tag").setExecutor(new TagCommand(this));
        this.getCommand("settag").setExecutor(new SettagCommand(this));



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


