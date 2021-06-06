package UsersManagement;

import BankingOperations.UserOperations;
import Enums.UserType;

public class Client extends User{
	
	UserOperations userOperations = new UserOperations();
	
	public Client() {
		this.setUserType(UserType.CLIENT);
	}
	
	public Client(String name, String cpf, String contactNumber, String email) {
		super(name, cpf, contactNumber, email);
		this.setUserType(UserType.CLIENT);
	}
	
	public Client getClient(){
		Client client = new Client();
		client.setName(this.getName()); 
		client.setCpf(this.getCpf());
		client.setContactNumber(this.getContactNumber());
		client.setEmail(this.getEmail());
		client.setUserType(UserType.CLIENT);
		
		return client;
	}
	
	@Override
	public void getUserData() {
		userOperations.getClientData(this.getClient());
	}
	
}
