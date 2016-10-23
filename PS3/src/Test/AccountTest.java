package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import pkg.Account;
import pkg.InsufficientFundsException;

public class AccountTest {

	@Test
	public void withdrawTest() throws InsufficientFundsException {
		int id = 1122;
		double balance = 20000;
		Account accountPass = new Account(id, balance);
		double goodBalance = accountPass.withdraw(10000);
		assertEquals(goodBalance, 10000, .01);

		accountPass.setAnnualInterestRate(4.5);
		accountPass.getAnnualInterestRate();
		accountPass.getDateCreated();
		accountPass.getMonthlyInterestRate();
	}

	@Test
	public void depositTest() {
		int id = 1122;
		double balance = 20000;
		Account accountPass = new Account(id, balance);
		double goodBalance = accountPass.deposit(3000);
		assertEquals(goodBalance, 23000, .01);
	}

	@Test(expected = InsufficientFundsException.class)
	public void withdrawFail() throws InsufficientFundsException {

		Account accountFail = new Account();
		accountFail.setId(1122);
		accountFail.setBalance(20000);
		accountFail.setAnnualInterestRate(4.5);
	
		double actualNbr = accountFail.deposit(3000);
		double expectNbr = 25000;
		assertEquals(actualNbr, expectNbr, .01);
		
		System.out.print("The balance of the account ID " 
		+ accountFail.getId() + "is " + "$" 
		+ accountFail.getBalance() + " and the monthly interest rate is " 
		+ accountFail.getMonthlyInterestRate() + "% " + "and the account was created on " 
		+ accountFail.getDateCreated());
		System.out.println();
	}
}
