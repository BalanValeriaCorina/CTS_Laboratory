package ro.ase.csie.cts.g1094.dp.simplefactory;

public class MachineGun extends AbstractWeapon{

	int noBullets;
	
	public MachineGun(int power, int ammo) {
		this.description="MG";
		this.popwerLevel=power;
		this.noBullets=ammo;
	}
	
	public MachineGun(String description, int ammo) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		// TODO Auto-generated method stub
		
	}

	
}
