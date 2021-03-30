package ro.ase.csie.cts.g1094.dp.builder;

import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class SuperHeroesDirector {

	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder=builder;
	}
	
	public SuperHero buildJoke() {
	return builder.isVillain().addLeftWeapon(new Pistol()).build();
	}
	
	public SuperHero buildSuperman() {
		return builder.addSuperPower("fly").build();
	}
	
	SuperHeroesDirector catalogue=new SuperHeroesDirector(new SuperHeroBuilder("Joker",200));
	
	
	
}
