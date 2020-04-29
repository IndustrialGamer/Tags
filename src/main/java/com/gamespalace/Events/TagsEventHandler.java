package com.gamespalace.Events;

import com.gamespalace.Main.TagsMain;
import com.gamespalace.Tags.Tags;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Scoreboard;

public class TagsEventHandler implements Listener {

    TagsMain tg = (TagsMain) TagsMain.getPlugin();
    Scoreboard board = Tags.board;

    @EventHandler(priority = EventPriority.LOWEST)
    void onPlayerJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        p.setScoreboard(board);
        if (!p.hasPlayedBefore()) {
            tg.getConfig().addDefault(e.getPlayer().getName(), "padrao");
            tg.saveConfig();
        } else {

        String tag = tg.getConfig().getString(p.getName());

        switch (tag) {
            case "dono" : Tags.setTagdono(p);break;
            case "sd" : Tags.setTagsubdono(p); break;
            case "adm" :  Tags.setTagadmin(p);break;
            case "lider" : Tags.setTaglider(p);break;
            case "mod" : Tags.setTagmod(p); break;
            case "aj" : Tags.setTagajudante(p); break;
            case "vipvit" : Tags.setTagvipvit(p); break;
            case "vip": Tags.setTagvip(p); break;
            case "yt" : Tags.setTagyt(p); break;
            case "padrao" : Tags.setTagpadrao(p); break;
            case "staff" : Tags.setTagstaff(p); break;
            case "testador" : Tags.setTagtestador(p); break;

        }

         }
    }


    @EventHandler (priority = EventPriority.HIGH)
    void onPlyerChat(AsyncPlayerChatEvent e) {
        e.setCancelled(true);
           Player p = e.getPlayer();

       TextComponent message = new TextComponent(p.getDisplayName() + ChatColor.WHITE + ": " + e.getMessage());

        TextComponent bpunir = new TextComponent(ChatColor.GOLD + " - [ " + ChatColor.RED + "Punir" + ChatColor.GOLD + " ]");
        ClickEvent punish = new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/punir " + p.getName());
        HoverEvent h = new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GOLD + "Clique aqui para punir o jogador " + p.getName()).create());
        bpunir.setHoverEvent(h);
        bpunir.setClickEvent(punish);



            for (Player target : Bukkit.getOnlinePlayers()) {
                e.setCancelled(true);
                e.setMessage("");
                if (target.hasPermission("punish.chat.punish")) {
                    e.setCancelled(true);
                    e.setMessage("");
                    target.spigot().sendMessage(message, bpunir);

                } else {
                    target.spigot().sendMessage(message);
                    e.setCancelled(true);
                    e.setMessage("");
                }


            }

    }


}
