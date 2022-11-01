package StringsExample;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string name");
	
		String s2=sc.nextLine();
		int space=0;
		int character=0;
		for(int i=0; i<s2.length();i++)
		{
			if(s2.charAt(i)==' ') {
				space=space++;
			}
			else
			{
				character=character++;
			}
		}
		System.out.println(space);
		System.out.println(character);
		System.out.println(s2.length());
		
	}

	
}
