package exercise_3;

public class Negative_First_Positive {

	public static void main(String[] args) {
		int arr[]=new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
//		int count=0,pos;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]<0) {
//				count++;
//			}
//		}
//		System.out.println("count of -ve nums : "+count);
//		int neg=0;
//		pos=count;
//		int a[]=new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]<0)
//				a[neg++]=arr[i];
//			else
//				a[pos++]=arr[i];
//		}
		
		 int j = 0, temp;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                if (i != j) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	                j++;
	            }
	        }
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
