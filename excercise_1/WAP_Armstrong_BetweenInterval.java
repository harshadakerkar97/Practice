package excercise_1;

import java.util.Scanner;

public class WAP_Armstrong_BetweenInterval {
	public static void main(String[] args) {
		int num1,num2,sum,a,temp;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=num1;i<num2;i++){
			sum = 0;
			a=i;
			while(a>0) {
	            temp = a % 10;
	            sum = sum + temp * temp * temp;
	            a=a/10;
	        }
	        if(sum == i){
	            System.out.println(i);
	        }
		}
	}
}
