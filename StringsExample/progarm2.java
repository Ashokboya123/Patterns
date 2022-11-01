package StringsExample;

public class progarm2 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Ramayana");
		StringBuffer s2 = new StringBuffer("Ramayana");
		StringBuffer s3 = new StringBuffer("ramayana");
		StringBuffer s4 = new StringBuffer("mahabharatha");
		
		System.out.println(s1);
		System.out.println(s2);
		boolean b = s1.equals(s2);//the object values were being compared
		System.out.println(b);
		String ss1 = s1.toString(); // converted the mutable to immutable for content comparison
		String ss2 = s1.toString();
		String ss3 = s1.toString();
		String ss4 = s1.toString();
		if(ss1.equals(ss2)== true) 
		{
			System.out.println("string s1&s2 are comapare and are found to be equal");
		}
		if(ss1.equals(ss3)== true)
		{
	
			System.out.println("string s1&s3 are comapare and are found to be equal");
		}
		if(ss1.equals(ss4)== true) 
		{
			System.out.println("string s1&s4 are comapare and are found to be equal");
		}
		else
		{
			System.out.println("strings are comapard and are found to be not equal");
		}
	}

}
