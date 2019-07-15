package com.enjin.gamesplazabrasil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;


public class Tags  {

   static TagsMain tg = (TagsMain) TagsMain.getInstance();

   public static ScoreboardManager manager = Bukkit.getScoreboardManager();
   public static Scoreboard board = manager.getNewScoreboard();

    public  Scoreboard getBoard () {

        return this.board;
    }

    public ScoreboardManager getManager () {

        return  this.manager;
    }

    static  Team tagdono = board.registerNewTeam("tagdono");
    static Team tagsubdono = board.registerNewTeam("tagsubdono");
    static Team tagadmin = board.registerNewTeam("tagadmin");
    static Team taglider = board.registerNewTeam("taglider");
    static Team tagmod = board.registerNewTeam("tagmod");
    static Team tagajudante = board.registerNewTeam("tagajudante");
    static Team tagvipvit = board.registerNewTeam("tagvipvit");
    static Team tagvip = board.registerNewTeam("tagvip");
    static Team tagyt = board.registerNewTeam("tagyt");
    static Team tagpadrao = board.registerNewTeam("tagpadrao");
    static Team tagtestador = board.registerNewTeam("tagtestador");
    static Team tagstaff = board.registerNewTeam("tagstaff");

    //GETTERS
    public static Team getTagdono() {
        return tagdono;
    }

    public static Team getTagsubdono() {
        return tagsubdono;
    }

    public  static Team getTagadmin() {
        return tagadmin;
    }

    public  static Team getTaglider() {
        return taglider;
    }

    public  static Team getTagmod() {
        return tagmod;
    }

    public  static Team getTagajudante() {
        return tagajudante;
    }

    public  static Team getTagvipvit() {
        return tagvipvit;
    }

    public  static Team getTagvip() {
        return tagvip;
    }

    public  static Team getTagyt() {
        return tagyt;
    }

    public  static Team getTagpadrao() {
        return tagpadrao;
    }

    public  static Team getTagtestador() {
        return tagtestador;
    }

    public static  Team getTagstaff() {
        return tagstaff;
    }
    //GETTERS

    // SETTERS
    public static void setTagdono(Player p) {


        if (p.hasPermission("tag.tag.dono")) {
            getTagdono().addEntry(p.getName());
           tg.getConfig().set(p.getName(), "dono");
            tg.saveConfig();
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.DARK_RED + "Dono" + ChatColor.MAGIC + "a " + ChatColor.DARK_RED + " " + p.getName());
            getTagdono().setPrefix(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "a" + ChatColor.DARK_RED + ChatColor.BOLD + "ADM ");
            getTagdono().setSuffix(ChatColor.DARK_RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + " Dono" + ChatColor.DARK_RED + ChatColor.MAGIC + "a");


            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.DARK_RED + ChatColor.MAGIC + "a" + ChatColor.DARK_RED + "DONO" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagsubdono(Player p) {
        if (p.hasPermission("tag.tag.subdono")) {
            getTagsubdono().addEntry(p.getName());
          tg.getConfig().set(p.getName(), "sd");
            tg.saveConfig();
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.AQUA + "SubDono" + ChatColor.MAGIC + "a " + ChatColor.AQUA + " " + p.getName());
            getTagdono().setPrefix(ChatColor.AQUA + "" + ChatColor.MAGIC + "a" + ChatColor.AQUA + ChatColor.BOLD + "ADM ");
            getTagdono().setSuffix(ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + " SubDono" + ChatColor.AQUA + ChatColor.MAGIC + "a");


            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.AQUA + ChatColor.MAGIC + "a" + ChatColor.AQUA + "SUBDONO" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagadmin(Player p) {
        if (p.hasPermission("tag.tag.admin")) {
           tg.getConfig().set(p.getName(), "adm");
            tg.saveConfig();
            p.setScoreboard(board);
            getTagadmin().addEntry(p.getName());
            p.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.RED + "Admin" + ChatColor.MAGIC + "a" + ChatColor.RED + " " + p.getName());
            getTagadmin().setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "ADM ");
            getTagadmin().setSuffix(ChatColor.RED + "" + ChatColor.ITALIC + " Admin");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.RED + ChatColor.MAGIC + "a" + ChatColor.RED + "ADMIN" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTaglider(Player p) {
        if (p.hasPermission("tag.tag.admin")) {
          tg.getConfig().set(p.getName(), "lider");
            tg.saveConfig();
            p.setScoreboard(board);
            getTaglider().addEntry(p.getName());
            p.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.RED + "Lider" + ChatColor.MAGIC + "a" + ChatColor.RED + " " + p.getName());
            getTaglider().setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "ADM ");
            getTaglider().setSuffix(ChatColor.RED + "" + ChatColor.ITALIC + " Lider");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.RED + ChatColor.MAGIC + "a" + ChatColor.RED + "LIDER" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public static void setTagmod(Player p) {
        if (p.hasPermission("tag.tag.mod")) {
         tg.getConfig().set(p.getName(), "mod");
            tg.saveConfig();
            getTagmod().addEntry(p.getName());
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.DARK_GREEN + "Mod" + ChatColor.MAGIC + "a" + ChatColor.DARK_GREEN + " " + p.getName());
            getTagmod().setPrefix(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "MOD ");
            getTagmod().setSuffix(ChatColor.DARK_GREEN + "" + ChatColor.ITALIC + " Moderador");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.DARK_GREEN + ChatColor.MAGIC + "a" + ChatColor.DARK_GREEN + "MODERADOR" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagajudante(Player p) {
        if (p.hasPermission("tag.tag.ajudante")) {
          tg.getConfig().set(p.getName(), "aj");
            tg.saveConfig();
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.GREEN + "Ajudante" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " " + p.getName());
            getTagajudante().addEntry(p.getName());
            getTagajudante().setPrefix(ChatColor.GREEN + "" + ChatColor.BOLD + "MOD ");
            getTagajudante().setSuffix(ChatColor.GREEN + "" + ChatColor.BOLD + " Ajudante");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.GREEN + ChatColor.MAGIC + "a" + ChatColor.GREEN + "AJUDANTE" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public   static void setTagvipvit(Player p) {
        if (p.hasPermission("tag.tag.vipvit")) {
          tg.getConfig().set(p.getName(), "vipvit");
            tg.saveConfig();
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.BLUE + "Vip" + ChatColor.MAGIC + "a" + ChatColor.BLUE + " " + p.getName());
            getTagvipvit().addEntry(p.getName());
            getTagvipvit().setPrefix(ChatColor.BLUE + "" + ChatColor.BOLD + "VIP ");
            getTagvipvit().setSuffix(ChatColor.BLUE + "" + ChatColor.ITALIC + " Eterno");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.BLUE + ChatColor.MAGIC + "a" + ChatColor.BLUE + "VipVit" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagvip(Player p) {
        if (p.hasPermission("tag.tag.vip")) {
           tg.getConfig().set(p.getName(), "vip");
            tg.saveConfig();
            p.setScoreboard(board);
            p.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.YELLOW + "Vip" + ChatColor.MAGIC + "a" + ChatColor.YELLOW + " " + p.getName());
            getTagvip().addEntry(p.getName());
            getTagvip().setPrefix(ChatColor.YELLOW + "" + ChatColor.BOLD + "VIP ");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.YELLOW + ChatColor.MAGIC + "a" + ChatColor.YELLOW + "VIP" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagyt(Player p) {
        if (p.hasPermission("tag.tag.youtube")) {
           tg.getConfig().set(p.getName(), "yt");
            tg.saveConfig();
            p.setDisplayName(ChatColor.BLACK + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.BLACK + "You" + ChatColor.GOLD + "Tube" + ChatColor.MAGIC + "a" + ChatColor.RED + " " + p.getName());
            getTagyt().addEntry(p.getName());
            getTagyt().setPrefix(ChatColor.BLACK + "" + ChatColor.MAGIC + "a" + ChatColor.BOLD + "" + ChatColor.BLACK + "You " + ChatColor.RED);
            getTagyt().setSuffix(ChatColor.GOLD + " Tube" + ChatColor.MAGIC + "a");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.BLACK + "" + ChatColor.MAGIC + "a" + ChatColor.BOLD + "" + ChatColor.BLACK + "You" + ChatColor.GOLD + "Tube" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagpadrao(Player p) {
        if (p.hasPermission("tag.tag.off")) {
            getTagpadrao().addEntry(p.getName());
           tg.getConfig().set(p.getName(), "padrao");
            tg.saveConfig();
            p.setDisplayName(ChatColor.GRAY + p.getName());

            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta sem tag agora!");
        }
    }

    public  static void setTagtestador(Player p) {
        if (p.hasPermission("tag.tag.testador")) {
            p.setScoreboard(board);
           tg.getConfig().set(p.getName(), "test");
            tg.saveConfig();
            getTagtestador().addEntry(p.getName());
            p.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.DARK_AQUA + "Testador" + ChatColor.MAGIC + "a" + ChatColor.DARK_AQUA + " " + p.getName());
            getTagtestador().setPrefix(ChatColor.DARK_AQUA + "Testador ");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta com a tag " + ChatColor.DARK_AQUA + "" + ChatColor.MAGIC + "a" + ChatColor.DARK_AQUA + "Testador" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }

    public  static void setTagstaff(Player p) {
        if (p.hasPermission("tag.tag.staff")) {
           tg.getConfig().set(p.getName(), "staff");
            tg.saveConfig();
            p.setScoreboard(board);
            getTagstaff().addEntry(p.getName());
            p.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.MAGIC + "a" + ChatColor.GOLD + "Staff" + ChatColor.MAGIC + "a" + ChatColor.GOLD + " " + p.getName());
            getTagstaff().setPrefix(ChatColor.GOLD + "Staff ");
            p.sendMessage(ChatColor.BLUE + "Tag> " + ChatColor.GREEN + "Voce esta usando a tag " + ChatColor.GOLD + "" + ChatColor.MAGIC + "a" + ChatColor.GOLD + "Staff" + ChatColor.MAGIC + "a" + ChatColor.GREEN + " agora!");
        }
    }
//SETTERS



}
