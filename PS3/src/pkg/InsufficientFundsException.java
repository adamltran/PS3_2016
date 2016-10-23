package pkg;

import java.io.*;

public class InsufficientFundsException extends Exception {

	private double notEnough;
	
	public InsufficientFundsException(double notEnough) {
		this.notEnough = notEnough;
		System.out.printf("You are short %.2f", notEnough);
	}
	
	public double getNotEnough() {
		return notEnough;
	}

}
