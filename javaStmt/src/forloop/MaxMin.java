package forloop;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 최고점 최저점 구하기
 * 
 * 학생 평균점수를 입력하시면 최고점, 최저점이 출력합니다.
 * 단, 정원은 5명입니다.
 * 평균점수를 입력하세요
 * 
 * 최고점은 100 점이고
 * 최저점은 30 점입니다.
 */

public class MaxMin {
	public static void main(String[] args) {
		
		System.out.println("학생 평균점수를 입력하시면 최고점, 최저점이 출력합니다."
				+"단, 정원은 5명입니다."
				+"평균점수를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0 , min = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("숫자를 입력하시오");
			arr[i] = scanner.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			
			if(arr[j] > max){
			max = arr[j];
			}
			if(arr[j] < min){
			min = arr[j];
			}
		}
		System.out.println("최고점은 "+max+"점이고"
				+"최저점은 "+min+"점 입니다.");
	}

}
