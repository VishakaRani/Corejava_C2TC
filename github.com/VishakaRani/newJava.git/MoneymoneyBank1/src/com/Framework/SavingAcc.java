package com.Framework;

import com.Application.MMSavingAcc;

public class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float MINBAL = 0;
	protected static final int AccNo = 0;
	private static final String AccNm = null;
	protected static final float AccBal = 0;
	public SavingAcc(boolean isSalary) {
		super(AccNo, AccNm, AccBal, null, 0, 0);
		this.isSalary = isSalary;
	}
	
	public SavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalary) {
		super(AccNo, AccNm, AccBal, AccNm, AccBal, AccNo);
		this.isSalary = isSalary;
	}
	public boolean isSalary() {
		return isSalary;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

}
