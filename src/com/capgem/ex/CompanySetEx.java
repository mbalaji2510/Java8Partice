package com.capgem.ex;

import java.util.HashSet;
import java.util.Set;

public class CompanySetEx {
	
	public static void main(String[] args) {
		
		Set<Company> companyData = new HashSet<>();
		
		companyData.add(new Company(12,"CG","5"));
		companyData.add(new Company(13,"CTS","5"));
		companyData.add(new Company(14,"Hexa","3"));
		companyData.add(new Company(15,"PPIC","2"));
		companyData.add(new Company(13,"CG","5"));
		companyData.add(new Company(13,"CG","5"));
		System.out.println(companyData.size());
		
		for (Company company : companyData) {
			
				
				System.out.println(company.getId()+" "+company.getName());
			
		}
	}

}
