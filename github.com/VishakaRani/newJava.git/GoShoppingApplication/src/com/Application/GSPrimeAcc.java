package com.Application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super();
	}
	public void bookProduct(Class<? extends GSPrimeAcc> class1)
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+getClass());
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNo() + ", getCharges()=" + getClass() + "]";
	}
	private String isPrime() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getAccNo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}