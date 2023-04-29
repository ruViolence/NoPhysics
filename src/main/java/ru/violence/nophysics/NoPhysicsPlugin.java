package ru.violence.nophysics;

import org.bukkit.plugin.java.JavaPlugin;
import ru.violence.nophysics.listener.NoDecay;
import ru.violence.nophysics.listener.NoFromTo;
import ru.violence.nophysics.listener.NoPhysics;

public class NoPhysicsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoPhysics(), this);
        getServer().getPluginManager().registerEvents(new NoDecay(), this);
        getServer().getPluginManager().registerEvents(new NoFromTo(), this);
    }
}
