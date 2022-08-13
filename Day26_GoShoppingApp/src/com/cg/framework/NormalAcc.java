package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
		private final float deliveryCharges;
		public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
		//providing implementation to abstract method of shop account here //normal account.
	public void bookProduct(float charges)
	{
		System.out.println("Account no. is : "+this.getAccNo()+" Account Name is : "+this.getAccNm()+ " Charges is "+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}
	
}