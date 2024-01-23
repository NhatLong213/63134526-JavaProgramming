/**
 * 
 */
package ntu.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào chiều dài: ");
		
		double length = scanner.nextDouble();
		
		System.out.print("Nhập vào chiều rộng: ");
		
		double width = scanner.nextDouble();
		
		double S, P;
		P = (length + width)*2;
		S = length * width;
		
		System.out.printf("Chu vi: %.1f \n", P);
		System.out.printf("Diện tích: %.1f\n", S);
		System.out.printf("Cạnh nhỏ nhất: "+ Math.min(length, width));

	}

}
