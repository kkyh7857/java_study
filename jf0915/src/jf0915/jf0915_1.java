package jf0915;

import java.util.Random;
import java.util.Scanner;

public class jf0915_1 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			int sum = num1 + num2;
			System.out.print(num1+"+"+num2+"= ");
			int input_sum = sc.nextInt();
			if(input_sum == sum) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
				count++;
			}
			if(count == 5) {
				System.out.println("Game Over!!");
				break;
			}
			
		}
	}
}
