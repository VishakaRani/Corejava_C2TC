package com.Framework;

abstract public interface BankFactory {
	public SavingAcc getNewSavingAcc(int AccNo,String AccNm,float AccBal,boolean isSalaried );
	public CurrentAcc getNewCurrentAcc(int AccNo,String AccNm,float AccBal,float creditLimit);

}
