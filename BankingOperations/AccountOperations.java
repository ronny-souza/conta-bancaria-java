package BankingOperations;

import AccountManagement.Account;

public class AccountOperations extends Account{
	
	
	private String clientName;
	private Account account;
	
	public AccountOperations() {
		
	}
	
	public AccountOperations(String clientName, Account account) {
		this.clientName = clientName;
		this.account = account;
	}
	
	public void extract() {
		System.out.println("********** EXTRATO **********\n");
		System.out.println("   TITULAR DA CONTA: " + this.clientName);
		System.out.println("   AG�NCIA: " + this.account.getAgency());
		System.out.println("   N� DA CONTA: " + this.account.getNumber());
		System.out.println("   SALDO: " + this.account.getBalance());
		System.out.println("\n*****************************");
	}
	
	public void deposit(Double value) {
		System.out.println("********** DEP�SITO **********");
		System.out.println("   TITULAR DA CONTA: " + this.clientName);
		System.out.println("   N� DA CONTA: " + this.account.getNumber());
		System.out.println("   VALOR DO DEP�SITO: " + value);
		System.out.println("   AG�NCIA: " + this.account.getAgency());
		System.out.println("******************************");
	}
	
	public void withdrawn(Double value) {
		System.out.println("********** SAQUE **********");
		System.out.println("   VALOR DO SAQUE: " + value);
		System.out.println("   SALDO DA CONTA: " + this.account.getBalance());
		System.out.println("   AG�NCIA: " + this.account.getAgency());
		System.out.println("   N� DA CONTA: " + this.account.getNumber());
		System.out.println("   CLIENTE: " + this.clientName);
		System.out.println("******************************");
	}
	
	public void withdrawnWithCheckingAccount(Double value) {
		System.out.println("********** SAQUE **********");
		System.out.println("   VALOR DO SAQUE: " + value);
		System.out.println("   SALDO DA CONTA: " + this.account.getBalance());
		System.out.println("   TAXA DE SAQUE: R$ 5.00");
		System.out.println("   AG�NCIA: " + this.account.getAgency());
		System.out.println("   N� DA CONTA: " + this.account.getNumber());
		System.out.println("   CLIENTE: " + this.clientName);
		System.out.println("******************************");
	}
	
	public void transferVoucher(Double value, Account destinationAccount) {
		System.out.println("********** TRANSFER�NCIA **********");
		System.out.println("   VALOR DA TRANSA��O: " + value);
		System.out.println("   AG�NCIA: " + destinationAccount.getAgency());
		System.out.println("   N� DA CONTA: " + destinationAccount.getNumber());
		System.out.println("   TRANSFERIDO PARA: " + destinationAccount.getClient().getName());
		System.out.println("***********************************");
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
}
