package excercise_1;
import java.util.Scanner;

public class PrimeNo_UsingLoops {
	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		sc.close();
		if(n==0 || n==1 || n==2) {
			System.out.println("Not a prime number");
		}else {
			for(int i=2;i<n/2;i++) {
				if(n%i == 0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Prime number");
			}else {
				System.out.println("Not a prime number");
			}
		}
	}
}
