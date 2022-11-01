package MethodsInJava;
//type 3: No input----output

 class Calcy {
	int add() {
		int a=0;
		int b=10;
		int c=a+b;
		return c;
	}
 }

public class Program3 {
	public static void main(String[] args) {
		Calcy c=new Calcy();
		 c.add();// 0 parameter
		System.out.println(c.add());
		
	}

}
