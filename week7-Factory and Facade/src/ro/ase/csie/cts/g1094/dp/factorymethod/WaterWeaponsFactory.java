package ro.ase.csie.cts.g1094.dp.factorymethod;

import ro.ase.csie.cts.g1094.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends Abstractfactory{

	
	
	
	@Override
	public AbstractWeapon getWeapon(WeaponType type, String description) throws Exception {
		
		AbstractWeapon weapon=null;
		switch(type) {
		case PISTOL:
			weapon=new WaterPistol();
			break;
		case MACHINE_GUN:
			weapon=new WaterBalloon();
			break;
		case BAZOOKA:
			weapon=new WaterBucket();
			break;
			default:
				throw new Exception();
				
//		  return weapon;
		}
		return weapon;
		
		
	}

}
