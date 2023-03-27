package kr.magpie.challenge;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.Configuration;
import java.io.File;
import java.util.UUID;

public final class Main extends JavaPlugin {

    ConsoleCommandSender consol = Bukkit.getConsoleSender();
    private FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        consol.sendMessage(ChatColor.AQUA + "#========#========#========#========#========#========#");
        consol.sendMessage("\n" +
                ChatColor.GRAY + "[Magpie]" +
                ChatColor.WHITE + ":: " +
                ChatColor.GREEN + "Challenge" +
                ChatColor.WHITE + " System Plugin " +
                ChatColor.AQUA +"Enabled");
        consol.sendMessage("");
        consol.sendMessage(ChatColor.AQUA + "#========#========#========#========#========#========#");

//        this.saveDefaultConfig();
//
//        try {
//            FileConfiguration data = YamlConfiguration.loadConfiguration(new File(getDataFolder(), "data.yml"));
//        }catch (Exception e){
//            e.printStackTrace();
//        }



        // Event
        getServer().getPluginManager().registerEvents(new Event(), this);
        getServer().getPluginManager().registerEvents(new MainGUI(), this);
//        getServer().getPluginManager().registerEvents(new Listener() {
//            @EventHandler
//            public void playerJoinServer(PlayerJoinEvent event){
//                Player player = event.getPlayer();
//                UUID UUID = player.getUniqueId();
//
//                FileConfiguration data = YamlConfiguration.loadConfiguration(new File(getDataFolder(), UUID+".yml"));
//
//            }
//        },this);

        // Command
        getCommand("mpch").setExecutor(new Command());





    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        consol.sendMessage(ChatColor.RED + "#========#========#========#========#========#========#");
        consol.sendMessage("\n" +
                ChatColor.GRAY + "[Magpie]" +
                ChatColor.WHITE + ":: " +
                ChatColor.GREEN + "Challenge" +
                ChatColor.WHITE + " System Plugin " +
                ChatColor.RED +"Disabled");
        consol.sendMessage("");
        consol.sendMessage(ChatColor.RED + "#========#========#========#========#========#========#");
    }
}
