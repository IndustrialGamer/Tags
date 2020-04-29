package com.gamespalace.Tags;

import com.gamespalace.Main.TagsMain;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class TagCommand implements CommandExecutor {

TagsMain plugin;

Scoreboard board = Tags.board;

public TagCommand (TagsMain plugin) {

    this.plugin = plugin;

}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("tag")) {

            Player p = (Player) sender;

            if (args.length == 0) {

                p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "-----------------[TagsMain]-----------------");
                p.sendMessage(ChatColor.WHITE + "TAG         DATA DE ATIVACAO           VENCIMENTO");
                if (p.hasPermission("tag.tag.vip")) {
                    p.sendMessage(ChatColor.YELLOW + "VIP                 xx/xx/xxxx               xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.vipvit")) {
                    p.sendMessage(ChatColor.BLUE + "VIPVIT            xx/xx/xxxx               xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.testador")) {
                    p.sendMessage(ChatColor.DARK_AQUA + "TESTADOR             xx/xx/xxxx               xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.tagstaff")) {
                    p.sendMessage(ChatColor.GOLD + "STAFF              xx/xx/xxxx                xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.ajudante")) {
                    p.sendMessage(ChatColor.GREEN + "AJUDANTE       xx/xx/xxxx              xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.mod")) {
                    p.sendMessage(ChatColor.DARK_GREEN + "MOD                 xx/xx/xxxx              xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.lider")) {
                    p.sendMessage(ChatColor.RED + "LIDER              xx/xx/xxxx              xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.admin")) {
                    p.sendMessage(ChatColor.RED + "ADMIN              xx/xx/xxxx              xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.subdono")) {
                    p.sendMessage(ChatColor.AQUA + "SUBDONO          xx/xx/xxxx             xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.youtube")) {
                    p.sendMessage(ChatColor.BLACK + "YOU" + ChatColor.GOLD + "TUBE" + "         xx/xx/xxxx             xx/xx/xxxx");
                } else {
                    return true;
                }
                if (p.hasPermission("tag.tag.dono")) {
                    p.sendMessage(ChatColor.RED + "DONO                xx/xx/xxxx             xx/xx/xxxx");
                } else {
                    return true;
                }

                //   return true;
            }


            if (args.length > 1) {
                p.sendMessage(ChatColor.BLUE + "Tag>" + ChatColor.RED + "Muitos argumentos! Use /tag <tag> ");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(((Player) sender).getUniqueId());

            if (args.length == 1) {
                switch (args[0]){


                    case "dono" : Tags.setTagdono(target); break;
                    case "subdono": Tags.setTagsubdono(p);break;
                    case "sd":  Tags.setTagsubdono(p); break;
                    case "admin": Tags.setTagadmin(p); break;
                    case "lider" : Tags.setTaglider(p);break;
                    case "mod" : Tags.setTagmod(p);break;
                    case "ajudante" : Tags.setTagajudante(p);break;
                    case "aj" :  Tags.setTagajudante(p);break;
                    case "vipvit": Tags.setTagvipvit(p);break;
                    case "vip" :  Tags.setTagvip(p);break;
                    case "youtube": Tags.setTagyt(p);break;
                    case "yt" : Tags.setTagyt(p);break;
                    case "off" : Tags.setTagpadrao(p);break;
                    case "testador": Tags.setTagtestador(p);break;
                    case "staff" : Tags.setTagstaff(p);break;
                    default: p.sendMessage(ChatColor.DARK_RED + "Tag> " + ChatColor.RED + "Voce nao possui a tag \"" + args[0] + "\". Compre mais TagsMain ou tempo em http://gamesplazabrasil.enjin.com/loja");


                }




                            }
        }

        return false;
    }
}
