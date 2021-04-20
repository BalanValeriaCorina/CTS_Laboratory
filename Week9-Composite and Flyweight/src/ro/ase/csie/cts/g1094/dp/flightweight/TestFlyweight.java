package ro.ase.csie.cts.g1094.dp.flightweight;

public class TestFlyweight {

	public static void main(String[] args) {
		ScreenData coordSoldier=new ScreenData(100,10,10,"Green");
		ScreenData coordSoldier2=new ScreenData(100,10,10,"Brown");
		ScreenData coordTree=new ScreenData(100,10,0,"Green");
		ScreenData coordTree2=new ScreenData(100,10,0,"Green");
		
		ModelflyweightActions soldier=Model3DFactory.getModel(ModelTypes.SOLDIER);
		
		
	}
}
