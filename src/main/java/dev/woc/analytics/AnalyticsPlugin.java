package dev.woc.analytics;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;

public class AnalyticsPlugin extends JavaPlugin {

  public static AnalyticsPlugin INSTANCE;

  @Override
  public void onLoad() {
    super.onLoad();
    INSTANCE = this;
  }

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
