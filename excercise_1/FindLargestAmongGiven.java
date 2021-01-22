package excercise_1;

import java.util.Scanner;

public class FindLargestAmongGiven {
	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int temp=-1;
		for(int i=0;i<5;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("Largest : "+temp);
	}
}
