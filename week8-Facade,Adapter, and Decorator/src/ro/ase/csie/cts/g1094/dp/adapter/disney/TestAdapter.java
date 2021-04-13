package ro.ase.csie.cts.g1094.dp.adapter.disney;

import java.util.ArrayList;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperhero;
import ro.ase.csie.cts.g1094.dp.adapter.Disney2Acmeadapter;
import ro.ase.csie.cts.g1094.dp.adapter.FantasyHero;

public class TestAdapter {

	public static void main(String[] args) {
		ACMESuperhero blueDragon=new FantasyHero("Blue dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);

		
		DisneyActions donald=new DonaldDuck(100);
		donald.changeLocation(100, 150);
		donald.isWounded(50);
		donald.restorePower(25);
		
		
		
		ArrayList<ACMESuperhero> heroes=new ArrayList<>();
		heroes.add(blueDragon);
		Disney2Acmeadapter donaldAdapter=new Disney2Acmeadapter(donald);
		heroes.add(donaldAdapter);
		
		for(ACMESuperhero hero: heroes)
		{
			hero.move();
			hero.takeAHit(50);
			hero.heal(40);
		}
		
		
		
		
	}

	
	
}
