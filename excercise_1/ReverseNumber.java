package excercise_1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n,sum=0,rev,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		temp=n;
		sc.close();
		while(n!=0) {
			rev=n%10;
			sum=sum*10+rev;
			n/=10;
		}
		System.out.println("Reverse number : "+sum);
		if(temp==sum) {
			System.out.println("number is palinrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
}
