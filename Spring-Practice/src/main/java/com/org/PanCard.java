package com.org;

public class PanCard {
	private String number;
	private int pincode;
    public PanCard() {
    	System.out.println("It has been called");
    }
	public PanCard(String number, int pincode) {
		System.out.println("PanCard(String number, String pincode) is called");
		this.number = number;
		this.pincode = pincode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "PanCard [number=" + number + ", pincode=" + pincode + "]";
	}
	
	

}
