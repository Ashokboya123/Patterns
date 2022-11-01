package MethodsInJava;
 class calcy{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(float a, float b,float c) {
		return a+b+c;
		
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, double b,double c) {
		return a+b+c;
	}
	double add(double a, int b,float c) {
		return a+b+c;
	}
	float add(int a,float b) {
		return a+b;
	}
	double add(double a,float c) {
		return a+c;
	}
}

public class Program5 {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float m=10.8f,n=61.5f,o=45.6f;
		double p=41.5,q=45.7,r=35.65;
		calcy cal= new calcy();
		System.out.println(cal.add(a, b));
		System.out.println(cal.add(a, b, c));
		System.out.println(cal.add(a, b, c));
		System.out.println(cal.add(a, b, c));
	}

}
