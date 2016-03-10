package bank;

import java.util.Scanner;

/**
 * 생성자를 만드시오
 * 단, 통장을 만듦과 동시에 은행이름이 통장 바깥에 새겨지며(상수)
 * 계좌번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
 * 계좌 주인의 이름은 새겨지며 비번도 설정합니다
 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
 * */

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 비번 입력");
		//String myName = "";
		
		//int num = 0;
		//num = ab.getAccountNo();
		//System.out.println("");
		
		BankService service = new BankService();
		System.out.println(service.openAccount(scanner.next(), scanner.nextInt());
		
	}

}
