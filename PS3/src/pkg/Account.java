package pkg;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			double debt = amount - balance;
			throw new InsufficientFundsException(debt);
			
		}
		return balance;
	}
	public double deposit(double deposit) {
		return balance += deposit;
	}
}
