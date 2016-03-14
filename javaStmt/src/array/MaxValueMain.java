package array;

/**
 * @file MaxValueMain.java
 * @author USER
 * @date 2016. 3. 14.
 * @story
 */
public class MaxValueMain {
	public static void main(String[] args) {
		int[] arr = {32,26,76,44,66,30};
		MaxValue mv = new MaxValue();
		mv.getMax(arr);
		System.out.println("매열중에서 가장 큰 값은 "+mv.getMax(arr)+"입니다.");
	}
}
