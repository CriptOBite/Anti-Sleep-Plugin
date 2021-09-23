package enteredgalaxy.antisleep;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import enteredgalaxy.antisleep.event.SleepListener;

import java.lang.String;

public class AntiSleep extends JavaPlugin {
  
  @Override
  public void onEnable() {
    getServer().getConsoleSender().sendMessage(translate("&aEnabling AntiSleep; Hello world! :)"));
    
    final Listener sleepListener = new SleepListener(); 
    getServer().getPluginManager().registerEvents(sleepListener, this);
  }
  
  @Override
  public void onDisable() {
    getServer().getConsoleSender().sendMessage(translate("&cDisabling AntiSleep; GoodBye! :)"));
  }
  
  public static String translate(final String text) {
    return ChatColor.translateAlternateColorCodes('&', text); 
  }
}
