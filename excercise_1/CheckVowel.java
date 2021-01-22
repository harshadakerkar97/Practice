package excercise_1;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		char a;
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		sc.close();
		a=Character.toUpperCase(a);
		switch(a) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("character is Vowel");
			break;
		default:
			System.out.println("Not a vowel");
			break;
		}
	}

}
