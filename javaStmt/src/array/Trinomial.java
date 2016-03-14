package array;

import java.util.Scanner;

/**
 * @file Trinomial.java
 * @author USER
 * @date 2016. 3. 14.
 * @story
 */
public class Trinomial {
	private String name;
	String result;
	private int kor, eng, math, avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = (int)((kor+eng+math)/3);
	}
	public String getResult() {
		result = (avg>=60)?"합격":"불합격";
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	} 
}
