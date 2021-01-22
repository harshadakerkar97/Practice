package excercise_1;

import java.util.Scanner;

public class ArmstrongOfUnknownLength {
	public static void main(String[] args) {
		int n,sum=0,temp=0,len=0,a;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			len++;
			n=n/10;
		}
		n=temp;
		System.out.println(n);
		while(temp>0) {
			a=temp%10;
			sum+=Math.pow(a, len);
			temp=temp/10;
		}
		System.out.println("sum = "+sum);
		if(n==sum)
			System.out.println("armstrong");
		else
			System.out.println("not");
	}
}
