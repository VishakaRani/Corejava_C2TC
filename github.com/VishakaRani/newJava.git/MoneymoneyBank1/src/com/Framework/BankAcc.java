package com.Framework;

import com.Application.MMCurrentAcc;

abstract public class BankAcc {
		protected int AccNo;
		protected String AccNm;
		protected float AccBal;
public BankAcc(int  accNo, String accNm, float accBal, String AccNm, float AccBal, int AccNo) {
		this.AccNo = AccNo;
		this.AccNm = AccNm;
		this.AccBal=AccBal;
		}
		public int getAccNo() {
			return AccNo;
		}
	
		public String getAccNm() {
			return AccNm;
		}
		public void setAccNm(String accNm) {
			AccNm = accNm;
		}
		public float getAccBal() {
			return AccBal;
		}
		public void withdraw(Class<? extends MMCurrentAcc> AccBal) {
		}

		@Override
		public String toString() {
			return "BankAcc1 [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal=" + AccBal + "]";
		}
		
		
}
