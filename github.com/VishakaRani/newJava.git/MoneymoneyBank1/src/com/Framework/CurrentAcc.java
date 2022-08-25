package com.Framework;

abstract public class CurrentAcc extends BankAcc {
	private  float creditLimit ;
	public CurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) {
		super(AccNo, AccNm, AccBal, AccNm, creditLimit, AccNo);
		this.creditLimit = creditLimit;
	}
	public void CurrentAcc1(int AccNo,String AccNm,float AccBal,float creditLimit) {
		
		
	}

	public float getCreditLimit() {
			return creditLimit;
		}
	@Override
	public String toString() {
		return "CurrentAcc1 [creditLimit=" + creditLimit + "]";
	}
	
	}
