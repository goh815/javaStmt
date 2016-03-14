package whileloop;

import java.util.Scanner;

public class numGolfMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		numGolfBean bean = new numGolfBean();
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();
		System.out.println("컴퓨터 숫자"+bean.getCom());
		System.out.println("[메뉴] 1.숫자 맞추기 2.종료");
		int key = scanner.nextInt();
		String msg = "";
		switch (key) {
		case 1:
			while (true){			
				System.out.println("1부터 10까지 숫자 중 하나를 입력");
				System.out.println("도전 횟수는 "+(bean.getCount()+1));
				bean.setPlayer(scanner.nextInt());
				bean.setCount();
				
				msg = (bean.getCom()==bean.getPlayer()) ? bean.toString() :"랜덤숫자와 불일치";
				
			}
			
			
		case 2: System.out.println("시스템을 종료 합니다");
		    return;
		default:
			System.out.println("잘못된 수가 입력되었습니다.");
			break;
		}
		System.out.println(msg);
		
		
		
	}

}
