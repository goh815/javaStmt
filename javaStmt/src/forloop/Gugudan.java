package forloop;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 입력은 받지않음.
 * 2단부터 9단까지으로 출력
 */
public class Gugudan {
	public static void main(String[] args) {
		int hap = 0;
		
			for (int i = 1; i <= 9; i++) {
				System.out.println();
				for (int j = 2; j <9; ++j){
					hap = i * j;
				System.out.print("  "+ j +" * "+ i +" = "+hap+"  " );
				
					
				
			 }			
		}
	}
}
