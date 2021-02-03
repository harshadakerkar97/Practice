package excercise_3;

public class MinMaxFromArray {
	
	public static int[] minNum(int arr[]) {
		int a[]=new int[2];
		int len=arr.length;
		if(len == 1) {
			a[0]=a[1]=arr[0];
			return a;
		}
		if(arr[0]>arr[1]) {
			a[0]=arr[1];
			a[1]=arr[0];
		}else {
			a[1]=arr[1];
			a[0]=arr[0];
		}
		for(int i=2;i<len;i++) {
			if(arr[i]>a[1]) {
				a[1]=arr[i];
			}else if(arr[i] < a[0]) {
				a[0]=arr[i];
			}
		}
		
		return a;
	}
	
	
	public static void main(String[] args) {
		int arr[]=new int[]{ 1,2,4,5,-3,-91 };
		int temp[]=new int[arr.length];
//		System.out.println("Minimum number : "+minNum(arr));
		temp=minNum(arr);
		System.out.println("Minimum number : "+temp[0]);
		System.out.println("Maximum number : "+temp[1]);
	}

}
