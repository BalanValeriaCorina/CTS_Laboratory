package ro.ase.csie.cts.g1094.laboratory.models;

import ro.ase.csie.cts.g1094.laboratory.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.laboratory.exeptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public static final double MAX_CREDIT=5000;
	
	public CurrentAccount(String iban)
	{
		super(iban,CurrentAccount.MAX_CREDIT);
	}
	
	@Override
	public void deposit(Double amount) {
		this.balance+=amount;

	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException{
		if(amount>this.balance)
		{
			throw new InsufficientFundsException("You don't have the required amount");
		}
		else
		{
			this.balance-=amount;
		}

	}

	@Override
	public void transfer(Account destionation, Double amount) throws InsufficientFundsException, IllegalTransferException {
		
		if(this==destionation) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destionation.deposit(amount);
	}

	
	
	
}
