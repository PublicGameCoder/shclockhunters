package manager;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import objects.Gate;

public class GatesManager {

	public static GatesManager GM;
	private List<Gate> gates = new ArrayList<Gate>();
	
	public static GatesManager getManager() {
		
		if (GM == null) {
			GM = new GatesManager();
		}
		
		return GM;
	}
	
	public void createGate(Location loc) {
		Gate gate = new Gate(loc);
		gates.add(gate);
	}

	public void createGate(String world, int x, int y, int z) {
		try {
		Location loc = new Location(Bukkit.getWorld(world), x, y, z);
		Gate gate = new Gate(loc);
		gates.add(gate);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
