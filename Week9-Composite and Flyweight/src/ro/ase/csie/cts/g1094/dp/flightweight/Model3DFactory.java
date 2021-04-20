package ro.ase.csie.cts.g1094.dp.flightweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {

	static Map<String, ModelflyweightActions> models=new HashMap<>();
	
	static {
		models.put(ModelTypes.SOLDIER.toString(), new Model3DFlyweight("Soldier"));
		models.put(ModelTypes.TREE.toString(), new Model3DFlyweight("Tree"));
	}
}
