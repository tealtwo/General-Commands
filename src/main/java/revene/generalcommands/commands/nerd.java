package revene.generalcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class nerd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] strings) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.DARK_AQUA + "NERD");
        }
        return true;
    }
}
