package org.dell;

public class CompanyInfo extends Company {
	
	public void companyYear() {
		
		System.out.println("year : 2014");
	}

	@Override
	void companyNo() {
		
		System.out.println(" no : 88708574532");
	}
	
	public static void main(String[] args) {
		CompanyInfo jk = new CompanyInfo();
		jk.companyId();
		jk.companyName();
		jk.companyNo();
		jk.companyYear();
		
	}

}
