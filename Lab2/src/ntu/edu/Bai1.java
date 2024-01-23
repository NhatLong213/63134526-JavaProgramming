/**
 * 
 */
package ntu.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nhập vào a ,b: ");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.printf("PTVSN\n");
			}
			else
			{
				System.out.printf("PTVN\n");
			}
		}
		else 
		{
			double x = -b/a;
		System.out.printf("Pt co nghiem: %.1f",x );
		
		}

	}

}
