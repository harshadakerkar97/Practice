package exercise_1;

abstract class ABC{
	int a,b;
//	ABC(){
//		
//	}
//	ABC(int a,int b){
//		this.a=a;
//		this.b=b;
//		System.out.println("abc");
//	}
}

class PQR extends ABC{
	int c;

	
//	PQR(int a,int b,int c){
//		super(a,b);
//		this.c=c;
//	}
	PQR() {
		super();
		System.out.println("pqr");
	}
	
}

public class Demo2 {
	public static void main(String[] args) {
//		ABC p=new PQR();
		System.out.println(true);
		try {
			System.out.println("try");
			System.exit(0);
		}catch(Exception e) {
			
		}
		finally {
			System.out.println("finally");
		}
	}
}
