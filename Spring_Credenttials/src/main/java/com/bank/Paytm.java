package com.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Paytm {
	
	 @Autowired
     private BankAccount account;

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Paytm [account=" + account + "]";
	}
	 
	
}
