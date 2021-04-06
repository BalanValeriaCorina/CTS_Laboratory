package ro.ase.csie.cts.g1094.dp.simplefactory;



public class WeaponFactory {

	public static AbstractWeapon getWeapon(WeaponType type, String description) throws Exception
	{
		AbstractWeapon weapon=null;
		switch(type)
		{
			case PISTOL:
				weapon=new Pistol(description,100);
				break;
			case MACHINE_GUN:
				weapon=new MachineGun(500,100);
				weapon.setDescription(description);
				break;
			case BAZOOKA:
				weapon=new Bazooka();
				weapon.setDescription(description);
				break;
			default:
				throw new Exception("Type not covered");
		}
		return weapon;
	}
}
