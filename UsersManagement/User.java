package UsersManagement;

import BankingOperations.UserOperations;
import Enums.UserType;

public class User {

	private String name;
	private String cpf;
	private String contactNumber;
	private String email;
	private UserType userType;
	
	public User() {
		
	}
	
	public User(String name, String cpf, String contactNumber, String email) {
		this.name = name;
		this.cpf = cpf;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	
	public void getUserData() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserType getUserType() {
		return userType;
	}
	
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
