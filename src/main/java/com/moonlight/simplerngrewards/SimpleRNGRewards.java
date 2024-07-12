package com.moonlight.simplerngrewards;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleRNGRewards extends JavaPlugin {

    private ConfigManager configManager;

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Initialize the ConfigManager and set up the config
        configManager = new ConfigManager(this);
        configManager.setupConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
