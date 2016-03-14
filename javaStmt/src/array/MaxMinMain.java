package array;

/**
 * @file MaxMinMain.java
 * @author USER
 * @date 2016. 3. 14.
 * @story 배열의 최대값, 최소값 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
	 int[] arr = {45,80,69,78,98,46,76,49,50,90};
	 MaxMin mm = new MaxMin();
	 
	 mm.setMin(arr);
	 	 System.out.println(mm);
	}
}
