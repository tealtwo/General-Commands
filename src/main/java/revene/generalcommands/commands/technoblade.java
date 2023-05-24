package revene.generalcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class technoblade implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] strings) {
        if (sender instanceof Player) {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.LIGHT_PURPLE + "PIG+++ [TECHNOBLADE]" + " " + ChatColor.WHITE + "Final call for Technoblade 21:47 July 1st 2022 Fly high Techno Fly High");
        }
        return true;
    }
}
