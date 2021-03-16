package ro.ase.csie.g1094.refactor.phase3.test;

import java.util.ArrayList;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.g1094.refactor.phase3.Product;
import ro.ase.csie.g1094.refactor.phase3.ProductType;
import ro.ase.csie.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.g1094.refactor.phase3.services.MarketingEasterStrategy;
import ro.ase.csie.g1094.refactor.phase3.services.ValidatorService;

public class TestProduct {

	public static ArrayList<Object> services=new ArrayList<>();
	
	
	public static void startup() {
		services.add(new ValidatorService());
		services.add(new Marketing2021Strategy());
	}
	
	public static void main(String[] args) {
		
		
		Product product=new Product(new Marketing2021Strategy(),new ValidatorService());
		try {
			float finalPrice=product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is "+ finalPrice);
			product.setMarketingService(new MarketingEasterStrategy());
			
			
			
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
