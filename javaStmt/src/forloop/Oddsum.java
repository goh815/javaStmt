package forloop;
/*
*file :  Oddsum.java
*@author 문고훈
*@date 2016. 3. 10
*@story 1부터 10까지 홀수의 합
*
*/
public class Oddsum {
	public static void main(String[] args){
		
		
			int sum=0, i =0;
			System.out.println("1번째 방법");
			for (i = 1; i <= 10; i+=2) {
				 sum +=i;
			}
			System.out.println("1부터 10까지 홀수의 합 " +sum);
			System.out.println("2번째 방법");
			for (i = 0; i < 10; i++) {
				
				if (i % 2 == 1) {
					sum += i;
				}
				
			}
			System.out.println("1부터 10까지 홀수의 합 " +sum);
		}

}
