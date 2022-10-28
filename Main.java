package hw8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number is: ");
		int numb = sc.nextInt();
		double srtNumb = getSquareRoot(numb);
		
		System.out.println("Square root of " + numb + " is: " + srtNumb);
	}

	public static double getSquareRoot(int numb) {
		double sqroot = numb / 2.0;
		int count = 0;
		while (Math.abs(sqroot * sqroot - numb) > 0.01) {
			sqroot = (numb / sqroot + sqroot) / 2.0;
			count ++;
		}
		System.out.println(count);
		return sqroot;
	}
}
		