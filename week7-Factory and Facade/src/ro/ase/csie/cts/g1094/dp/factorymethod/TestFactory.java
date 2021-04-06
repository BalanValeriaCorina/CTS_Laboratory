package ro.ase.csie.cts.g1094.dp.factorymethod;

import ro.ase.csie.cts.g1094.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponFactory;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponType;

public class TestFactory {

	public static void main(String[] args) throws Exception
	{
		boolean kidsMode=true;
		SuperHero superwoman=null;
		
		if(kidsMode) {
			 superwoman=new SuperHero("Superwoman",new WaterPistol());
			
		}
		else {
			  superwoman=new SuperHero("Superwoman",WeaponFactory.getWeapon(WeaponType.PISTOL,""));
		}
		
		Abstractfactory weaponFactory=(kidsMode==true) ? new WaterWeaponsFactory() : new RealWeaponsFactory();
		
		superwoman=new SuperHero("Superwoman", weaponFactory.getWeapon(WeaponType.PISTOL, "Pistol"));
		
	}
	
	
}
