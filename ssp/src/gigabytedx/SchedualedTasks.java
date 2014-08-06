package gigabytedx;

import org.bukkit.Bukkit;

public class SchedualedTasks {

	public static Main plugin;

	public SchedualedTasks(Main plugin) {

		// retrieve plugin object from main.
		SchedualedTasks.plugin = plugin;
	}
	public static void runReload() {

		// when worldguard has failed to load reload the server.

		// create delayed task
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			@Override
			public void run() {

				// send msg to console to reload the server
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
						"rl");

			}
		}, 100L);
	}
}
