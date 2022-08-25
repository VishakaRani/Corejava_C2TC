package com.client;
import com.Application.MMCurrentAcc;
import com.Application.MMSavingAcc;
import com.Application.MMBankFactory;
public class MMClient {
	public static void main(String[] args) {
		MMBankFactory obj=new MMBankFactory();
		//current Account creation
		
		MMCurrentAcc vish=(MMCurrentAcc) obj.getNewCurrentAcc(123, "Vishaka", 500.0f, 60000);
		vish.withdraw(vish.getCreditLimit());
		
		//Saving Account creation
		
		MMSavingAcc geeta=(MMSavingAcc) obj.getNewSavingAcc(121, "Geeta", 600.0f,true);
		geeta.withdraw(geeta.getSalaried());

	}

	
}

