package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperhero;

public class ShieldDecorator extends AbstractDecorator{

	
	int shieldPoints;
	
	public ShieldDecorator(ACMESuperhero hero,int shieldLvl) {
		super(hero);
		this.shieldPoints=shieldLvl;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeAHit(int points) {
	
		int lostpoints= points- shieldPoints;
		if(lostpoints>0)
		 super.takeAHit(lostpoints);
	}

	
}
