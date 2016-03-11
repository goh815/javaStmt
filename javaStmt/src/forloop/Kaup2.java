package forloop;

import java.util.Scanner;

/**
 *file : Kaup.java 
 *@author 문고훈
 *@date 2016. 3. 10.
 *@story 키우루 지수 구하기
 *몸무게를 키의 제곱으로 구한 후 10000을 곱하면 지수가 생성된다.
 *이를 키우푸 지수라고 한다
 *키우루 지수 
 *30 초과면 비만
 *24 이상이면 과체중
 *20 이상이면 정상
 *15 이상이면 저체중 
 *13 이상이면 미흡
 *10 이상이면 영양실조 로 판별된다.
 *이름과 키와 몸무게를 입력하면
 *홍길동님은 비만입니다. 라고 출력하는 프로그램 작성하시오
 */
public class Kaup2 {
	/* public static void main(String[] args){
		System.out.println("홍길동님은 비만입니다.");
		
		int Kaup = 0;
		String result ="", name ="";
		double cm = 0.0, kg = 0.0;
		
		Kaup k = new Kaup();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름입력");
		name = scanner.next();
		System.out.println("이름은"+name);
		
		System.out.println("키 입력");
		cm = scanner.nextInt(); 
		System.out.println("몸무게 입력");
		kg = scanner.nextInt();
		result = k.getKaup(cm, kg);
	}*/
	

	private String getKaup(double cm, double kg) {
		
		int Kaup;
		String result;
		Kaup = (int) ((cm/(kg*cm))*10000);
				
		if(Kaup >30){
			result ="비만";
		}else if (Kaup >= 24){
			result ="과체중";
		}else if(Kaup >= 20){
			result ="정상";
		}else if(Kaup >= 15){
			result ="저체중";
		}else if(Kaup >= 13){
			result ="미흡";
		}else if(Kaup >= 10){
			result ="영양실조";
		}else {
			result ="소모증";
		}
		return result;
	}

	@Override
	public String toString() {
		return "키우푸지수[이름"+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
