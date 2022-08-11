package com.cg.Framework;

public abstract class CurrentAcc extends  BankAcc 
{
	private final float creditLimit;
public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
	super(accNo, accNm, accBal);
	this.creditLimit=creditLimit;
	}
public void withdraw(float amount) 
{
	float accBal=this.getAccBal();
	 if(amount<=creditLimit) 
	 {
		if(amount<accBal) 
		{
			accBal-=amount;
			this.setAccBal(accBal);
			System.out.println(" Account Name Is: "+this.getAccNm()+", Withdrowed Amount Is : "+amount+", Account Balance Is : "+accBal);
			
		}
		else 
		{
			System.out.println("Please Enter less amount:");
		}
		
	}
	else 
	{
		System.out.println("Insufficient balance");
	}
}
@Override
public String toString() {
	return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
}
}