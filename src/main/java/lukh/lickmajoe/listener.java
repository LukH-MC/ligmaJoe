package lukh.lickmajoe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class listener implements Listener {
    public void joe(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        if (message.equalsIgnoreCase("joe")) {
            Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "ligma");
        }
    }
}
