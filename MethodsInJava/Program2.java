package MethodsInJava;
// Type 2: Input----No output
class Claculator1{
	void add(int a, int b) { //called method
		int c=a+b;
		System.out.println(c);
	}
}
public class Program2 {
	public static void main(String[] args) {//calling method
		 Claculator1 c=new Claculator1();
		 c.add(10,20);//parameterized method
	}


}
