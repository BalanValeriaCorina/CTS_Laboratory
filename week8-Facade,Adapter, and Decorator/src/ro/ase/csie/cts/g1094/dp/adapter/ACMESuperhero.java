package ro.ase.csie.cts.g1094.dp.adapter;

public abstract class ACMESuperhero {

	public String name;
	public int lifePoints;
	
	public ACMESuperhero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}
	
	public abstract void move();
	public abstract void crouch();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
}
