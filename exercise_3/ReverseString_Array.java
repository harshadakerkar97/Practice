package exercise_3;

public class ReverseString_Array {

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
		int temp=0;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
