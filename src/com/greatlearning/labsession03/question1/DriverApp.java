package com.greatlearning.labsession03.question1;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression");
		String input = sc.next();

		BalancingBracketsStack bs = new BalancingBracketsStack();
		if (input.length() % 2 == 1) {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		} else {
			if (bs.validate(input))
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("Invalid Expression,Unbalanced String");
		}
		sc.close();
	}

}
