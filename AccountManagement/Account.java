package AccountManagement;

import BankingOperations.AccountOperations;
import Enums.AccountType;
import UsersManagement.Client;

public class Account {
	private Client client;
	private Double balance;
	private String agency;
	private String number;
	private Integer password;
	private AccountType accountType;
	private static int totalAccounts;
	private AccountOperations accountOperations;
	
	public Account() {
		totalAccounts++;
	}
	
	public Account(Client client, String number, Integer password, String agency, Double balance) {
		this.client = client;
		this.number = number;
		this.password = password;
		this.agency = agency;
		this.balance = balance;
		this.accountOperations = new AccountOperations(this.client.getName(), this.getAccount());
		totalAccounts++;
	}
	
	public Account getAccount() {
		Account account = new Account();
		account.client = this.client;
		account.number = this.number;
		account.password = this.password;
		account.agency = this.agency;
		account.balance = this.balance;
		account.accountType = this.accountType;
		return account;
	}
	
	public void getAccountBalance(String accountNumber, Integer password) {
		
		if(accountNumber == null || accountNumber.isEmpty() || password <= 0 || password == null) {
			throw new IllegalArgumentException("Dados para consulta inválidos!");
		
		} else if (!accountNumber.equals(this.number) || !password.equals(this.password)) {
			throw new IllegalArgumentException("Dados de acesso incorretos!");
		}
		this.accountOperations.setAccount(this.getAccount());
		this.accountOperations.extract();
	}
	
	public void deposit(Double value) {
		
		if(value == null || value <= 0) {
			throw new IllegalArgumentException("Valor inserido para depósito é inválido!");
		}
		this.balance += value;
		this.accountOperations.setAccount(this.getAccount());
		this.accountOperations.deposit(value);
	}
	
	public void withdrawn(Double value) {
		
		if(value == null || value <= 0) {
			throw new IllegalArgumentException("Valor solicitado para saque é inválido!");
		
		} else if(this.balance < value) {
			throw new IllegalArgumentException("Saldo inferior ao solicitado para saque!");
		}
		
		if(this.getAccount().getAccountType() == AccountType.CHECKINGACCOUNT) {
			this.balance -= value;
			this.accountOperations.setAccount(this.getAccount());
			this.accountOperations.withdrawnWithCheckingAccount(value);
		
		} else {
			this.balance -= value;
			this.accountOperations.setAccount(this.getAccount());
			this.accountOperations.withdrawn(value);
		}
	}
	
	public void depositDestinationAccount(Double value, Account destinationAccount) {

		if(value == null || value <= 0) {
			throw new IllegalArgumentException("Valor inserido para depósito é inválido!");
		}
		
		Double balance = destinationAccount.getBalance();
		balance += value;
		this.accountOperations.setAccount(this.getAccount());
		destinationAccount.setBalance(balance);
		
	}
	
	public void transfer(Double value, Account destinationAccount) {
		
		if(value == null || value <= 0) {
			throw new IllegalArgumentException("Valor solicitado para saque é inválido!");
			
		} else if(this.balance < value) {
			throw new IllegalArgumentException("Saldo inferior ao solicitado para saque!");
		}
		
		destinationAccount.depositDestinationAccount(value, destinationAccount);
		this.balance -= value;
		this.accountOperations.setAccount(this.getAccount());
		this.accountOperations.transferVoucher(value, destinationAccount);
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public String getAgency() {
		return agency;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Client getClient() {
		return client;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
}
