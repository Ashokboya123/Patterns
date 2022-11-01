package StringsExample;

import java.util.Scanner;
// WAP to replace all special characters with @ symbol

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		s1=s1.toUpperCase();
		for(int i=0; i<s1.length(); i++) {
			if((s1.charAt(i)>='A' && s1.charAt(i)<='Z') ||
			(s1.charAt(i)>='0' && s1.charAt(i)<='9')) {
				
			}
			else
			{
				s1=s1.replace(s1.charAt(i), '@');
			}
		}
		System.out.println(s1);
		
	}

}
