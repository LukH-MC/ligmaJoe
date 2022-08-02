package lukh.lickmajoe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lickmajoe extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new listener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
