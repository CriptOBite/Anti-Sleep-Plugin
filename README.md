# Anti-Sleep-Plugin
Stops players from sleeping in Minecraft Java


//SRC
package enteredgalaxy.antisleep;

import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSleep extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
getServer ().getPluginManager ().registerEvents (this,this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



@EventHandler
public void SleepEvent(PlayerBedEnterEvent bedEnterEvent){
        Player player = bedEnterEvent.getPlayer ();
        bedEnterEvent.setCancelled (true);
        player.sendMessage (Color.AQUA +"[AntiSleep]"+Color.RED+"Sorry beds are disabled on this server");

    }
}
