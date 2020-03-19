package com.h2kinfosys.learn.dayFive;

public class PreferredCustomer extends Customer {
	
	
	// Validate Method - ZipCode and City with Google Maps
	/*
	 * Same method with different logic in Child Class- Overriding
	 * Rule of Overriding
	 * 1. Access Modifier - Cannot reduce the visibility but you may increase visibility  overriding
	 * 2. Return type - return type should be compatible / co-variant
	 * 3. Method Name - should be exactly same
	 * 4. Parameters/ arguments - exactly same
	 * 5. Method Body - different 
	 * 6. Exception - Co-varient
	 */
	
	@Override
	public boolean validateCustomer(String zipCode, String city)  {
		boolean result = super.validateCustomer(zipCode, city);
		System.out.println("PreferredCustomer validateCustomer Google Map Validation ");
		return result;
	}

}