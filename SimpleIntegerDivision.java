package LabProgram309;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleIntegerDivision {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		/* Type your code here. */

		int userNum, divNum;
		
		try {
			userNum = scnr.nextInt();
			divNum = scnr.nextInt();
			System.out.println(userNum / divNum);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception: " + e.toString());
		}
	}
}
