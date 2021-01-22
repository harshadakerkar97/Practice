package excercise_1;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0,a,temp;
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			a=n%10;
			sum+=(a*a*a);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("armstrong");
		else
			System.out.println("Not");
		sc.close();
	}
}
