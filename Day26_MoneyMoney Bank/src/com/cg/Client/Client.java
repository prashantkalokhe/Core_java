package com.cg.Client;

import com.cg.Application1.MMBankFactory;
import com.cg.Application1.MMCurrentAcc;
import com.cg.Application1.MMSavingAcc;
import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(121,"prashant",86250,true);
		CurrentAcc c = new MMCurrentAcc(136,"Shaym",66780,12000);
		s.withdraw(7400);
		c.withdraw(5500);
		System.out.println(s);
		System.out.println(c);
	}

}