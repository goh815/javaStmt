package switchcase;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 사칙연산기
 */
public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자, 연산기호, 숫자 입력");
		
		int a = scanner.nextInt(), num1 = 0;
		String opcode = scanner.next();
		int b = scanner.nextInt(), result = 0;
		
		//+-*/ 단 나눗셈을 몫과 나머지로 출력
		switch (opcode) {
		case "+": break;
		case "-": break;
		case "*": break;
		case "/":
			result = a / b;
			num1 = a % b;			
			break;
		default:
			System.out.println("연산기호를 잘못 입력");
			return;
		}
		System.out.println(a + opcode + b+ "="+result+"나머지 값은"+ num1);
	}
}
