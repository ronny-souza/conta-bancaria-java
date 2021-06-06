package AccountManagement;

import Enums.AccountType;
import UsersManagement.Client;

public class CheckingAccount extends Account{

	public CheckingAccount() {
		this.setAccountType(AccountType.CHECKINGACCOUNT);
	}
	
	public CheckingAccount(Client client, String number, Integer password, String agency, Double balance) {
		super(client, number, password, agency, balance);
		this.setAccountType(AccountType.CHECKINGACCOUNT);
	}
	
	@Override
	public void withdrawn(Double value) {
		Double balance = this.getBalance() - 5.0;
		this.setBalance(balance);
		super.withdrawn(value);
	}
}
