package UsersManagement;

import BankingOperations.UserOperations;
import Enums.UserType;

public class Employee extends User{

	private String register;
	private Double wage;
	private String office;
	
	UserOperations userOperations = new UserOperations();
	
	public Employee() {
		this.setUserType(UserType.EMPLOYEE);
	}
	
	public Employee(String name, String cpf, String contactNumber, String email, String register, Double wage, String office) {
		super(name, cpf, contactNumber, email);
		this.register = register;
		this.wage = wage;
		this.office = office;
		this.setUserType(UserType.EMPLOYEE);
	}
	

	public Employee getEmployee(){
		Employee employee = new Employee();
		employee.setName(this.getName()); 
		employee.setCpf(this.getCpf());
		employee.setContactNumber(this.getContactNumber());
		employee.setEmail(this.getEmail());
		employee.setUserType(UserType.EMPLOYEE);
		employee.setRegister(this.getRegister());
		employee.setWage(this.getWage());
		employee.setOffice(this.getOffice());
		return employee;
	}
	
	@Override
	public void getUserData() {
		userOperations.getEmployeeData(this.getEmployee());
	}
	
	public String getRegister() {
		return register;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	public Double getWage() {
		return wage;
	}
	
	public void setWage(Double wage) {
		this.wage = wage;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
}
