package whileloop;

import java.util.Scanner;

public class numGolfMain {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		numGolfBean bean = new numGolfBean();
		
		while(true){
		System.out.println("컴퓨터 램덤 수 발생");
		bean.setCom();
		System.out.println("1부터 10까지 숫자 중 하나를 입력");
		bean.player = scanner.nextInt();
		bean.count ++;
		System.out.println(bean.count+"번");
		if (bean.getCom()==bean.getPlayer()){
			System.out.println("맞졌다.");
			break;
		}
		}		

	}

}
