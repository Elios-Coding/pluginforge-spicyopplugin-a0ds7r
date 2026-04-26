package com.pluginforge.spicyopplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpicyOpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SpicyOpPlugin v1.0 enabled.");
        getCommand("spicyop").setExecutor(new SpicyopCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SpicyOpPlugin disabled.");
    }
}
