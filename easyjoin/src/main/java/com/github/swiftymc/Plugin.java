package com.github.swiftymc;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/*
 * easyjoin java plugin
 */
public class Plugin extends JavaPlugin  implements Listener
{
  private static final Logger LOGGER=Logger.getLogger("easyjoin");

  public void onEnable()
  {
    LOGGER.info("easyjoin enabled");
  }

  public void onDisable()
  {
    LOGGER.info("easyjoin disabled");
  }
}
