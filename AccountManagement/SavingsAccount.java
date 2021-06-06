package AccountManagement;

import Enums.AccountType;
import UsersManagement.Client;

public class SavingsAccount extends Account{

	public SavingsAccount() {
		this.setAccountType(AccountType.SAVINGACCOUNT);
	}
	
	public SavingsAccount(Client client, String number, Integer password, String agency, Double balance) {
		super(client, number, password, agency, balance);
		this.setAccountType(AccountType.SAVINGACCOUNT);
	}
}
