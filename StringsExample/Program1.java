package StringsExample;

public class Program1 {
	public static void main(String[] args) {
		String s1="Ramayana";
		String s2="Ramayana";
		String s3="ramayana";
		String s4="mahabharatha";
		if(s1.equalsIgnoreCase(s2)==true) 
		{
			System.out.println("string s1&s2 are comapare and are found to be equal");
		}
		if(s1.equalsIgnoreCase(s3)==true) 
		{
			System.out.println("string s1&s3 are comapare and are found to be equal");
		}
		if(s1.equalsIgnoreCase(s4)==true) 
		{
			System.out.println("string s1&s4 are comapare and are found to be equal");
		}
		else
		{
			System.out.println("strings are compare and are found to be not equal");
		}
		
	}

}
