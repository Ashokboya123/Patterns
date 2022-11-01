package StringsExample;

public class Program6a {
	public static void main(String[] args) {
		String s1 = new String("ramyana");
		String s2 = new String("ramyana");
		
		if(s1==s2)
		{
			System.out.println("Addresses are equal");
		}
		else
		{
			System.out.println("Addresses are not equal");
		}
	}

}
