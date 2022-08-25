package com.Application;

import com.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) {
		super(AccNo, AccNm, AccBal, creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal=" + AccBal + ", getCreditLimit()="
				+ getCreditLimit() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public Class<? extends MMCurrentAcc> getcreditLimit() {
		// TODO Auto-generated method stub
		return null;
	}

	public void withdraw(float creditLimit) {
		// TODO Auto-generated method stub
		
	}

	
	}


