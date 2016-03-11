package forloop;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 합 구하기
 * 예) 10을 입력하면 콘솔에는 1부터 10까지의 합을 55 입니다.
 */
public class InputSum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0 , input = 0;
		System.out.println("숫자 입력");
		input = scanner.nextInt();
		
		for (int i = 1; i <= input; i++) {
			sum +=i; 
		}
		
		System.out.println(sum);
	}
}
