package forloop;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기
 * 예) 2를 입력하면 2단 출력
 * 
 */
public class InputGugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, hap = 0;
		
		System.out.println("숫자를 입력하시오.");
		input = scanner.nextInt();
		
			if (input <=0) {
				System.out.println("종료");	
			}else {
				
				for (int i = input ; i <= input ; i++) {
			
				for (int j =1; j <=9 ; j++) {
				hap = input * j;
				System.out.println(input+" * "+j+" = "+ hap );
				}
			}
		}
		
	}
}
