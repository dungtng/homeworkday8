package hw8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Ex3 {

	public static void main(String[] args) {
		String strs [] = {"flower","flight"};
		List<String[]> arrOfString = new ArrayList<String []>();
		for (String string : strs) {
			String temp [] = string.split("");
			arrOfString.add(temp);
//			for (String t : temp) {
//				System.out.println(t);
//			}
		}
		for (int i = 0; i < arrOfString.size(); i++) {
			for (String strings : arrOfString.get(i)) {
				System.out.println(strings);
			}
		}
//		for (String[] strings : solution) {
//			System.out.println(strings);
//		}
		
		
	}

//	public static List<String[]> solution(String[] arr) {
//		List <String[]> strs = new ArrayList<String[]>();
//		for (String string : arr) {
//			String temp [] = string.split("");
//			strs.add(temp);
//		}
//		return strs;		
//	}
}
