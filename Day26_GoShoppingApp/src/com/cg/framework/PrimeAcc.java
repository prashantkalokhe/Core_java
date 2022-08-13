package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc 
{
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges=0.0f;
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account no. is : "+this.getAccNo()+" Account Name is : "+this.getAccNm()+ " Charges is "+charges);
	}
	
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s]", isPrime);
	}
	
}