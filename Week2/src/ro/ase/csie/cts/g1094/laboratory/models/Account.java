package ro.ase.csie.cts.g1094.laboratory.models;

import ro.ase.csie.cts.g1094.laboratory.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.laboratory.exeptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsException;
	public abstract Object getBalance();
	public abstract void transfer(Account destionation, Double amount) throws InsufficientFundsException, IllegalTransferException;
	
}
