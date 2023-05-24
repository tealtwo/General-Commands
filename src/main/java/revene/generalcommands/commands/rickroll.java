package revene.generalcommands.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class rickroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,String[] strings) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.DARK_GRAY +
                    "Never gonna let you down\n" +
                    "Never gonna run around and desert you\n" +
                    "Never gonna make you cry\n" +
                    "Never gonna say goodbye\n" +
                    "Never gonna tell a lie and hurt you\n");
        }
        return true;
    }
}
