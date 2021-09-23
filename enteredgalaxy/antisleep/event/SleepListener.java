package enteredgalaxy.antisleep.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerBedEnterEvent
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import static enteredgalaxy.antisleep.AntiSleep.translate;

public class SleepListener implements Listener {
 
  @EventHandler(priority = EventPriority.LOWEST)
  public void sleepUse(PlayerBedEnterEvent e) {
    Player player = e.getPlayer();
    e.setCancelled(!player.hasPermission("antisleep.bypass"));
    
    if (e.isCancelled())
      player.sendMessage(translate("&b[ AntiSleep ] &3Sorry, but you are not allowed to sleep!"));
  }
}
