package Execution;

import AccountManagement.Account;
import AccountManagement.CheckingAccount;
import AccountManagement.SavingsAccount;
import UsersManagement.Client;
import UsersManagement.Employee;
import UsersManagement.User;

public class Execution {

	public static void main(String[] args) {
		
		// 1. Cadastro de um cliente
		Client client = new Client("Jo�o Pedro", "126.567.878-10", "(81) 9.9856-7898", "jp@gmail.com");
		// 2. Cria��o de uma conta corrente para o cliente
		Account account = new  CheckingAccount(client, "12345-7", 1234, "1247-X", 800.00);
		// 3. Realizando um extrato na conta
		System.out.println("Realizando uma opera��o de extrato na conta 1:\n");
		account.getAccountBalance("12345-7", 1234);
		// 4. Realizando um saque na conta
		System.out.println("Realizando uma opera��o de saque na conta 1:\n");
		account.withdrawn(100.00);
		// 5. Realizando um dep�sito na conta
		System.out.println("Realizando uma opera��o de dep�sito na conta 1:\n");
		account.deposit(200.00);
		// 6. Checando novamente o saldo da conta ap�s o dep�sito
		account.getAccountBalance("12345-7", 1234);
		
		System.out.println("\n\n--------------------------------------------------------------------\n\n");
		
		// 7. Criando um cliente novo e uma conta poupan�a
		Client clientTwo = new Client("Maria Marta", "124.564.343-45", "(81) 9.9456-7869", "mariam@gmail.com");
		Account accountTwo = new SavingsAccount(clientTwo, "54321-8", 1235, "1248-X", 500.00);
		// 8. checando o saldo da conta
		accountTwo.getAccountBalance("54321-8", 1235);
		// 9. Usando a conta anterior para fazer uma transfer�ncia para a segunda conta
		System.out.println("Realizando uma opera��o de transfer�ncia da conta 1 para a conta 2:");
		account.transfer(100.00, accountTwo);
		
		// 10. Vendo novamente o saldo da conta 1 e conta 2
		System.out.println("Saldo da conta 1 ap�s a transa��o: ");
		account.getAccountBalance("12345-7", 1234);
		System.out.println("Saldo da conta 2 ap�s a transa��o: ");
		accountTwo.getAccountBalance("54321-8", 1235);
		
		// 11. Criando um terceiro cliente e recuperando seus dados.
		User clientThree = new Client("Marcos Medeiros", "128.456.345-76", "(81) 9.9656-6786", "mmedeiros@gmail.com");
		clientThree.getUserData();
		
		// 12. Criando um funcion�rio e recuperando seus dados.
		User employee = new Employee("Joana Silva", "124.345.658-98", "(81) 9.9765-8675", "joanasilva@gmail.com", "G-3467", 2600.00, "Gerente Banc�ria");
		employee.getUserData();
	}

}
