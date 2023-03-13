package kr.magpie.challenge;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Challenge extends JavaPlugin {

    ConsoleCommandSender consol = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        // Plugin startup logic
        consol.sendMessage(ChatColor.AQUA + "#========#========#========#========#========#========#");
        consol.sendMessage("" +
                ChatColor.GRAY + "[Magpie]" +
                ChatColor.WHITE + ":: " +
                ChatColor.GREEN + "Challenge" +
                ChatColor.WHITE + " System Plugin " +
                ChatColor.AQUA +"Enabled");
        consol.sendMessage(ChatColor.AQUA + "#========#========#========#========#========#========#");

        // Event
        getServer().getPluginManager().registerEvents(new Event(), this);
        getServer().getPluginManager().registerEvents(new MainGUI(), this);

        // Command
        getCommand("mpch").setExecutor(new Command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        consol.sendMessage(ChatColor.RED + "#========#========#========#========#========#========#");
        consol.sendMessage("" +
                ChatColor.GRAY + "[Magpie]" +
                ChatColor.WHITE + ":: " +
                ChatColor.GREEN + "Challenge" +
                ChatColor.WHITE + " System Plugin " +
                ChatColor.RED +"Disabled");
        consol.sendMessage(ChatColor.RED + "#========#========#========#========#========#========#");
    }
}
