package com.cg.Framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalay;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalay=isSalary;
	}
	public void withdraw(float charges)
	{
		System.out.println("Account no. is : "+this.getAccNo()+", Account Name is : "+this.getAccNm()+ ", Account Balance is "+this.getAccBal());
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalay=%s]", isSalay);
	}
	
}