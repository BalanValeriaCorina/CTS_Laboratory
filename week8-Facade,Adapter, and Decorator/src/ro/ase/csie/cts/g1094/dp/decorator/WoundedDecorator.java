package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperhero;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(ACMESuperhero hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		if(this.hero.lifePoints>500)
		super.move();
		else
		{
			System.out.println("The hero is barely moving ");
		}
	}

	
	
}
