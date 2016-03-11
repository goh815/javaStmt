package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl service  = new BankServiceImpl();
		AdminServiceImpl admin = new AdminServiceImpl(100);
		System.out.println("이름,비번 입력");
		System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
		System.out.println("입금");
		System.out.println(service.deposit(scanner.nextInt()));
		
		
		
	}
}
