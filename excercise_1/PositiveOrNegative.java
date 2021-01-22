package excercise_1;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		if( n < 0 ) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is positive");
		}
	}

}
