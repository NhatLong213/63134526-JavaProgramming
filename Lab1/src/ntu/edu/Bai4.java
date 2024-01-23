/**
 * 
 */
package ntu.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào a ,b ,c : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		double delta;
		
		delta = Math.pow(b,2)-4*a*c;
		if(delta < 0)
		{
			System.out.printf("Delta: %.1f\n", delta);
		}
		else 
		{
		System.out.printf("Delta: %.1f\n", delta);
		System.out.printf("sqrt Delta: "+Math.sqrt(delta));
		}

	}

}
