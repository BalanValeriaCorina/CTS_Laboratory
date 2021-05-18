package ro.ase.csie.cts.g1094.testing.main;

import ro.ase.csie.cts.g1094.testing.models.MathOperations;

public class App {

	public static void main(String[] args) {
		System.out.println("App started");
		
		int a=5;
		int b=6;
		int exceptieResult=11;
		int actualResult=MathOperations.add(a, b);
		if(actualResult==exceptieResult)
		{
			System.out.println("you are ok");
		}
		else
		{
			System.out.println("take some math courses");
		}
	}
}
