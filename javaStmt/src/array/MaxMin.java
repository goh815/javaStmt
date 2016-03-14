package array;

public class MaxMin {
private int max, min;


public void setMin(int[] arr) {
	//System.out.println("실행");
	int tempMax = arr[0], tempMin =arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		if (tempMax >= arr[i]) {
			max = tempMax;
		}
		
		if(tempMin <= arr[i]){
			min = tempMin;
		}
	} 
	this.max = tempMax;
	this.min = tempMin;
}


@Override
public String toString() {
	//System.out.println("실행2");
	return "최대,최소값 [최대값=" + max + ", 최소값=" + min + "]";
}



}
