package ro.ase.csie.cts.g1094.dp.flightweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFlyweight implements ModelflyweightActions{

	String name;
	List<Double> modelpoints=new ArrayList<>();
	
	
	public Model3DFlyweight(String name) {
		super();
		this.name = name;

	}
	
	
	@Override
	public void loadModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("Printing %s at coordinates (%f, %f, %f)", name,data.x, data.y, data.z));
		
	}

	
	
	

}
