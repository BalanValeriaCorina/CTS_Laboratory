package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperhero;
import ro.ase.csie.cts.g1094.dp.adapter.FantasyHero;

public class TestDecorator {

	public static void main(String[] args) {
		ACMESuperhero blueDragon=new FantasyHero("Blue dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);

		ACMESuperhero blueDragonWithShield=new ShieldDecorator(blueDragon, 300);
		blueDragonWithShield.takeAHit(500);
	
		
	}
}
