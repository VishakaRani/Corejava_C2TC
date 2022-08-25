package com.Application;

import com.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
public MMSavingAcc(boolean isSalary) {
		super(isSalary);
}
private static final float MINBAL=0;
private static final String AccNm = null;


public static float getMinbal() {
	return MINBAL;
}

@Override
public String toString() {
	return "MMSavingAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal=" + AccBal + ", isSalary()=" + isSalary()
			+ ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

public Class<? extends MMCurrentAcc> getSalaried() {
	// TODO Auto-generated method stub
	return null;
}


}
