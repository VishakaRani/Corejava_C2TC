package com.Application;

import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.ShopFactory;

public class GoShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeAcc=new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return primeAcc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		NormalAcc normalAcc=new GSNormalAcc(AccNo, accNm, charges, deliveryCharges);
		return normalAcc;
	}

}