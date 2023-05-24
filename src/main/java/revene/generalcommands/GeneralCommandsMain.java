package revene.generalcommands;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import revene.generalcommands.commands.*;

public final class GeneralCommandsMain extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("THE PLUGIN HAS STARTED");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("Bye").setExecutor(new bye());
        getCommand("Hello").setExecutor(new hello());
        getCommand("discord").setExecutor(new discord());
        getCommand("store").setExecutor(new store());
        getCommand("pong").setExecutor(new pong());
        getCommand("forum").setExecutor(new forum());
        getCommand("rickroll").setExecutor(new rickroll());
        getCommand("technoblade").setExecutor(new technoblade());
        getCommand("nou").setExecutor(new nou());
        getCommand("nerd").setExecutor(new nerd());
    }
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.DARK_RED + "Welcome to Revene! To get started do /warp A!");
    }
    @Override
    public void onDisable() {
    }
}
