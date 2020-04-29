package com.gamespalace.Tags;

import com.gamespalace.Main.TagsMain;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SettagCommand implements CommandExecutor {


    TagsMain plugin;

    public SettagCommand (TagsMain plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
 Player p = (Player) sender;
        if (command.getName().equalsIgnoreCase("settag")) {
            Player target = Bukkit.getPlayer(args[0]);

            switch (args[1]){
                case "dono" : Tags.setTagdono(target); break;
                case "subdono": Tags.setTagsubdono(target);break;
                case "sd":  Tags.setTagsubdono(target); break;
                case "admin": Tags.setTagadmin(target); break;
                case "lider" : Tags.setTaglider(target);break;
                case "mod" : Tags.setTagmod(target);break;
                case "ajudante" : Tags.setTagajudante(target);break;
                case "aj" :  Tags.setTagajudante(target);break;
                case "vipvit": Tags.setTagvipvit(target);break;
                case "vip" :  Tags.setTagvip(target);break;
                case "youtube": Tags.setTagyt(target);break;
                case "yt" : Tags.setTagyt(target);break;
                case "off" : Tags.setTagpadrao(target);break;
                case "testador": Tags.setTagtestador(target);break;
                case "staff" : Tags.setTagstaff(target);break;
                default: p.sendMessage(ChatColor.BLUE + "TagsMain> " + ChatColor.RED + "Nao foi possivel colocar a tag no player " + ChatColor.DARK_PURPLE +  target.getName());


            }


        }

        return false;
    }
}
