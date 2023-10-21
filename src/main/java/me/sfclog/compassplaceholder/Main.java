package me.sfclog.compassplaceholder;

import me.sfclog.compassplaceholder.placeholder.CompassHolder;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new CompassHolder().register();
    }


}
