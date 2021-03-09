package ro.ase.csie.cts.g1094.refactor.phase1;

import ro.ase.csie.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.g1094.refactor.exceptions.InvalidPriceException;

public class Product {
		
		public static final int MAX_AGE_ACCOUNT=10;
		public static final float MAX_FIDELITY_DISCOUNT=0.15f;
		
		
		private static float getDiscountValue(float price, float discount) {
			return discount*price;
		}
		
		private static float getPriceWithDiscountandFidelity(float price, float discountValue,float fidelityDiscount)
		{
			return (price - discountValue) - fidelityDiscount * (price -discountValue );
		}
		
		
		public  static float getFidelityDiscount(int accountAge)
		{
			return (accountAge > MAX_AGE_ACCOUNT) ? (float)15/100 : (float)accountAge/100; 
		}
		
		private static float getFinalPrice(float price, float discount,ProductType type,float fidelityDiscount)
		{
			float discountValue=getDiscountValue(price,type.DISCOUNTED.getDiscount());
	    	float finalPrice= (price - (ProductType.DISCOUNTED.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscount() * price));
	    	return finalPrice;
		}
		
		public float ComputePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException
		  {
		
			if(price <=0) {
				throw new InvalidPriceException();
			}
			
			if(accountAge<0)
			{
				throw new InvalidAgeException();
			}
			
		    float finalPrice = 0;
		    float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? (float)15/100 : (float)accountAge/100; 
		    
			switch(productType)
			{
			    case NEW:
			    	finalPrice = price;
			    	finalPrice = getFinalPrice(price,fidelityDiscount, ProductType.NEW,fidelityDiscount);
			    	break;
			    case DISCOUNTED:
			    {	float discountValue=getDiscountValue(price,ProductType.DISCOUNTED.getDiscount());
			    	
			    	break;}
			    case LIMITED_STOCK:
			    	{
			    		float discountValue=getDiscountValue(price,ProductType.LIMITED_STOCK.getDiscount());
			    	finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscount() * price));
			    	break;}
			    case LEGACY:
			    	{
			    		float discountValue=getDiscountValue(price,ProductType.LIMITED_STOCK.getDiscount());
			    	    finalPrice = (price - (ProductType.LEGACY.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LEGACY.getDiscount() * price));
			    	    break;  
			    	}
			    	default:
			    		throw new UnsupportedOperationException("The enum type is not coverred");    		
			}
			
		    return finalPrice;
		  }
	}

