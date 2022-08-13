package com.cg.framework;

public abstract class ShopFactory {
	
	abstract public PrimeAcc getNewPrimeAcc(int AccNo,String accNm,float charges,boolean isPrime);
	abstract public NormalAcc getNewNormalAcc(int AccNo,String accNm,float charges,float deliveryCharges);
}