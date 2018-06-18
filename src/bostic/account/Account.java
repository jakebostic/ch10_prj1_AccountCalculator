package bostic.account;
import java.text.NumberFormat;

import bostic.interfaces.Balancable;
import bostic.interfaces.Depositable;
import bostic.interfaces.Withdrawable;

public class Account implements Balancable, Depositable, Withdrawable {
	
	protected double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

	//get string representing the currency formatted balance
	public String getBalanceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(balance);
	}
}
