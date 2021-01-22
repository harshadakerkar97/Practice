package excercise_1;

import java.util.Scanner;

public class PrimeNumberBetweenInterval {
	public static void main(String[] args) {
		int n1,n2,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter interval: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		sc.close();	
		for(int i=n1;i<n2;i++) {
			count=1;
			if(i == 0 || i == 1 || i == 2)
				continue;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0)
				{
					count=0;
					break;
				}
			}
			if(count==1)
				System.out.print(i+" ");
		}
	}
}
