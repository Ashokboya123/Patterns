package MethodsInJava;
// Type 1:No input ----No output
class calculator{
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);//30
	}
	
}
public class Program1 {
	public static void main(String[] args) {
		 calculator c = new calculator();
		 c.add();
	}

}
