package exercise_3;

//import java.util.Arrays;

public class Kth_SmallestNumber {

	public static void main(String[] args) {
		int arr[]=new int[]{0, 2, 1, 2, 0};
		int temp=0,k=4;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nsecond min number : "+arr[k-1]);
		
		
		
//		Arrays.sort(arr);
//		System.out.println("second min number : "+arr[temp-1]);
		
	}
}
