package com.hexa.java8;

public class DefaultEx implements InterFace1,Interface2 {

	
	
	public static void main(String[] args) {
		
		DefaultEx ex = new DefaultEx();
		ex.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		InterFace1.super.display();
	}

}
