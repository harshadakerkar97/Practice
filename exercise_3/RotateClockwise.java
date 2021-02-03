package exercise_3;

public class RotateClockwise {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int temp=a[0];
		int i=0;
//		anti-clockwise
		System.out.println("anti-clockwise");
		for (i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[i]=temp;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nclockwise");
//		clockwise
		int a1[] = {1, 2, 3, 4, 5};
		
		for(int j=0;j<2;j++)
		{
			temp=a1[a1.length-1];
			for (i = a1.length-1; i > 0; i--) {
				a1[i]=a1[i-1];
			}
			a1[i]=temp;
		}
		for (i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		
	}

}
