package ro.ase.csie.g1094.refactor.phase3.services;

public class Marketing2021Strategy implements MarketingServiceInterface{
	
	public float getFidelityDiscount(int accountAge)
	{
		return (accountAge> MAX_AGE_ACCOUNT)?MAX_FIDELITY_DISCOUNT:(float)accountAge/100);
	}

}
