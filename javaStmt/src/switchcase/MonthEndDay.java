package switchcase;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 해달 월의 말일을 출력함
 */
public class MonthEndDay {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("년 월 입력");
	int year= scanner.nextInt(), month = scanner.nextInt(),endDay = 0;
	
	switch (month) {
	case 1:	case 3:	case 5: case 7:	case 8:	case 10:
	case 12:endDay = 31; break;
	case 4:	case 6:	case 9:
	case 11:endDay = 30; break;
	case 2:endDay = 29; break;
	default:
		System.out.println("잘못된 값");
		break;
	}
	System.out.println(year+"년 "+month+"월는 "+ endDay+ "가 말일입니다.");
}
}
