package ro.ase.csie.cts.g1094.dp.test;

import ro.ase.csie.cts.g1094.dp.builder.Pistol;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		//SuperHero superHero=new SuperHero();
//		superHero.name="Superman";
//		superHero.lifePoints=100;
//		superHero.superPower="Can fly";
//		superHero.superPower"Laser eyes";
		
		//SuperHero superHero=new SuperHero("Superman",100,false,false, null, new Pistol(),"Laser eyes",null);
		
		SuperHero superman=new SuperHero.SuperHeroBuilder("Superman",100).addSuperPower("fly").build();
		//superman.superPower="fly";
		
		SuperHero joke=new SuperHero.SuperHeroBuilder("Joke", 200).isVillain().addLeftWeapon(new Pistol()).build();
	
	}
}
