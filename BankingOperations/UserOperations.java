package BankingOperations;

import UsersManagement.Client;
import UsersManagement.Employee;

public class UserOperations {

	public void getEmployeeData(Employee employee) {
		System.out.println("********** DADOS DO FUNCIONÁRIO **********\n");
		System.out.println("   TITULAR: " + employee.getName());
		System.out.println("   CPF: " + employee.getCpf());
		System.out.println("   TELEFONE: " + employee.getContactNumber());
		System.out.println("   E-MAIL: " + employee.getEmail());
		System.out.println("********** DADOS DO CONTRATO **********\n");
		System.out.println("   MATRÍCULA: " + employee.getRegister());
		System.out.println("   SALÁRIO: " + employee.getWage());
		System.out.println("   CARGO: " + employee.getOffice());
		System.out.println("\n*****************************");
	}
	
	public void getClientData(Client client) {
		System.out.println("********** DADOS DO CLIENTE **********\n");
		System.out.println("   TITULAR: " + client.getName());
		System.out.println("   CPF: " + client.getCpf());
		System.out.println("   TELEFONE: " + client.getContactNumber());
		System.out.println("   E-MAIL: " + client.getEmail());
		System.out.println("\n*****************************");
	}
}
