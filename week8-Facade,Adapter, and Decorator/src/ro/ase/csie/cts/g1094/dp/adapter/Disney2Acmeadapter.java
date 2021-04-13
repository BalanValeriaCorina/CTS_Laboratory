package ro.ase.csie.cts.g1094.dp.adapter;

import ro.ase.csie.cts.g1094.dp.adapter.disney.DisneyActions;

public class Disney2Acmeadapter extends ACMESuperhero{

	DisneyActions disneyhero=null;

	
	public Disney2Acmeadapter(DisneyActions disneyhero) {
		super(disneyhero.getName(), disneyhero.getPower());
		this.disneyhero = disneyhero;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.disneyhero.changeLocation(0, 0);
	}


	@Override
	public void crouch() {
		System.out.println(String.format("%s is moving slowly", this.disneyhero.getName()));
		
	}


	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.disneyhero.isWounded(points);
	}


	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.disneyhero.restorePower(points);
	}
	
}
