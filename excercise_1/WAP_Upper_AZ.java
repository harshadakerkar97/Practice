package excercise_1;

public class WAP_Upper_AZ {

	public static void main(String[] args) {
		for(int i=65;i<91;i++) {
			if(i%5 == 0) {
				System.out.println();
			}
			System.out.print((char)i+" ");
		}
		System.out.println();
		for(int i=97;i<123;i++) {
			if(i%5 == 0) {
				System.out.println();
			}
			System.out.print((char)i+" ");
		}
	}

}
