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
		
		Kaup k = new Kaup(); 
		int Kaup = 0;
		String result ="", name ="";
		double cm = 0.0, kg = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��Է�");
		name = scanner.next();
		System.out.println("�̸���"+name);
		
		System.out.println("Ű �Է�");
		cm = scanner.nextInt(); 
		System.out.println("������ �Է�");
		kg = scanner.nextInt();
		result = k.getKaup(cm, kg);

	}

}
