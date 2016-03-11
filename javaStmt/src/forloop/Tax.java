package forloop;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 다음과 같은 결과물이 
 */
public class Tax {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int input = 0, sum = 0;
	 String name = "";
	 
	 System.out.println("이름입력 하시오");
	 name = scanner.next();
	 
	 System.out.println("연봉을 입력하세요");
	 input  = scanner.nextInt();
	 
	 sum = (int) (input*0.10)/12;
	 
	System.out.println("연봉 "+input+"원을 받으시는 "+name+" 님께서");
	System.out.println("이번닫 납부할 세금은  "+sum+"만원입니다.");
}
}
