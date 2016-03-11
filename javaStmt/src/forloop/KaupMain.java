/**
 * 
 */
package forloop;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class KaupMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kaup2 k = new Kaup2(); 
		int Kaup = 0;
		String result ="", name ="";
		double cm = 0.0, kg = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름입력");
		name = scanner.next();
		System.out.println("이름은"+name);
		
		System.out.println("키 입력");
		cm = scanner.nextInt(); 
		System.out.println("몸무게 입력");
		kg = scanner.nextInt();
		//result = k.getKaup(cm, kg);

	}

}
