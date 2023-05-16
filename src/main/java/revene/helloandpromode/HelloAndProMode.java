package revene.helloandpromode;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import revene.helloandpromode.commands.bye;
import revene.helloandpromode.commands.hello;

public final class HelloAndProMode extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("THE PLUGIN HAS STARTED");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("Bye").setExecutor(new bye());
        getCommand("Hello").setExecutor(new hello());
    }
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.DARK_RED + "Welcome to Revene! To get started do /warp A!");
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
