package com.Application;

import com.Framework.BankFactory;
import com.Framework.CurrentAcc;
import com.Framework.SavingAcc;



	public class MMBankFactory implements BankFactory{
		public SavingAcc getNewSavingAcc(int AccNo,String AccNm,float AccBal,boolean isSalaried ) {
			return null;
		}
		public CurrentAcc getNewCurrentAcc(int AccNo,String AccNm,float AccBal,float creditLimit) {
			return null;
		}
	
	}
		
	


