package ro.ase.csie.g1094.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		SuperHero superwoman=new SuperHero("Superman",500,"Fly");
		SuperHeroMemento autosave1=superwoman.save();
		
		superwoman.name="Batwoman";
		System.out.println(superwoman.name);
		
		superwoman.load(autosave1);
		System.out.println(superwoman.name);
	}
}
