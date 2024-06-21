package com.bank;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SwissBank implements BankAccount {

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Swiss Bank");
		System.out.println("Account balance is 1600");
	}
  
}
