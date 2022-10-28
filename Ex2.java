package hw8;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman Number: ");
		String romeNumb = sc.nextLine();
		String str[] = romeNumb.split("");
		int numbArr[] = convertStringArrToIntArr(str);
		int result = 0;
		for (int i = 1; i < numbArr.length; i++) {
			if (numbArr[i - 1] < numbArr[i]) {
				numbArr[i - 1] = numbArr[i - 1] * (-1);
			}
		}
		for (int j = 0; j < numbArr.length; j++) {
			result = result + numbArr[j];
		}
		System.out.println("The converted integer for " + romeNumb + " is: " + result);
	}

	public static int[] convertStringArrToIntArr(String[] str) {
		int sizeStr = 0;
		for (String string : str) {
			sizeStr++;
		}
		int tempNumbs[] = new int[sizeStr];
		for (int i = 0; i < tempNumbs.length; i++) {
			tempNumbs[i] = convertStringToInt(str[i]);
		}
		return tempNumbs;
	}

	public static int convertStringToInt(String str) {
		switch (str) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		default:
			return 1000;
		}
	}
}
