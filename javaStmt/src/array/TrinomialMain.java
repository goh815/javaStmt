package array;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trinomial tm = new Trinomial();
		
		
		System.out.println("이름, 국어, 영어, 수학, 점수 입력");
		tm.setName(scanner.next());
		tm.setKor(scanner.nextInt());
		tm.setEng(scanner.nextInt());
		tm.setMath(scanner.nextInt());
				
		System.out.println(tm.getName()+"학생은 "+tm.getResult()+"입니다.");
		
	}
}
