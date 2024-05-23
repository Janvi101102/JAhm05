package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Country c1 = new Country("India");
	City cty = new City("Surat");
	Person p = new Person("Janvi",c1,cty,19,100000);
	
		System.out.println(p);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calculationTax(p);
		
		
		Country c2 = new Country();
		c2.setCname("India");
		
		City cty1 = new City();
		cty1.setCname("Surat");
		
		Person p1 = new Person();
		p1.setPname("Janvi");
		p1.setC1(c2);
		p1.setCty(cty1);
		
		System.out.println(p1);
		
	}

}
