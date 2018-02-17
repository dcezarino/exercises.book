package br.com.myexercises;

import java.util.Scanner;

// The teacher type two grades and the system calculate the average each one.

public class TesteInputOutput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Type your first grade: ");
		int firstValue = scanner.nextInt();

		System.out.println("Informe sua segunda nota");
		int secondValue = scanner.nextInt();

		double sumGrade = (firstValue + secondValue) / 2;

		if (sumGrade > 5) {
			System.out.println("Student approved!" + " - " + "Grade: " + sumGrade);

		} else {
			System.out.println("Student disapproved!" + " - " + "Grade: " + sumGrade);
		}
		scanner.close();

	}

}
