package com.bank;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SBI implements BankAccount {

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to SBI");
		System.out.println("Your account balance is 25000");
		
	}
  
}
