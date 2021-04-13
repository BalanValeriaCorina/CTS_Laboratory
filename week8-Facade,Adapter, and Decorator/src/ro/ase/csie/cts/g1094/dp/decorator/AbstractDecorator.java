package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperhero;

public abstract class AbstractDecorator extends ACMESuperhero{

	ACMESuperhero hero=null;
	
	public AbstractDecorator(ACMESuperhero hero) {
		super(hero.name, hero.lifePoints);
		this.hero=hero;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.hero.move();
	}

	@Override
	public void crouch() {
		// TODO Auto-generated method stub
		this.hero.crouch();
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.hero.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.hero.heal(points);
	}


	
			
}
