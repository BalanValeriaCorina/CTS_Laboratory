package ro.ase.csie.cts.g1094.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) throws Exception {
		
		SuperHero wonderwoman=new SuperHero("Wonderwoman", new Pistol("Pistol",100));
		wonderwoman.setWeapon(new MachineGun(500,100));
		wonderwoman.setWeapon(new Bazooka(""));

		SuperHero batwoman=new SuperHero("Batwoman", WeaponFactory.getWeapon(WeaponType.PISTOL,"Pistol"));
		batwoman.setWeapon(WeaponFactory.getWeapon(WeaponType.MACHINE_GUN,"MG"));
		
		
	}

}
