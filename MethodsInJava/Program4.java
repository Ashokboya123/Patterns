package MethodsInJava;
//Type 4: input-----output

class claculator{
	int add(int a, int b) { //called method
	    int c=a+b;
		return c;
	}
}
public class Program4 {
	public static void main(String[] args) { //calling method
		claculator c=new claculator();
		int res=c.add(10, 25); //parameterized method call
		System.out.println(res);
		
	}

}
