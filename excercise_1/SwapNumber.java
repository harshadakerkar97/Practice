package excercise_1;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After 1st swap : "+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After 2nd swap : "+num1+" "+num2);
		sc.close();
	}
}
