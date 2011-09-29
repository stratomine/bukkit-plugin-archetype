package ${package};

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ${name}Plugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		log("Hello world!");
	}
	
	@Override
	public void onDisable() {
		// Do nothing
	}
	
	protected Logger getLogger() {
		return getServer().getLogger();
	}
	
	public void log(Level level, String message) {
		message = "[${name}] " + message;
		getLogger().log(level, message);
	}
	
	public void log(String message) {
		log(Level.INFO, message);
	}
	
}
