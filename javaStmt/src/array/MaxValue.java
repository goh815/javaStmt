package array;

class MaxValue{
	public int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public void Max() {
		// TODO Auto-generated method stub
		//this.max = max;
	}
}