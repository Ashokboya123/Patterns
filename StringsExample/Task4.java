package StringsExample;

import java.util.Scanner;
//WAP to replace all vowels with # symbol
public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='A'||
			   s1.charAt(i)=='E'||
			   s1.charAt(i)=='I'||
			   s1.charAt(i)=='O'||
			   s1.charAt(i)=='U') {
				
			}
			else if(s1.charAt(i)=='a'||
					s1.charAt(i)=='e'||
					s1.charAt(i)=='i'||
					s1.charAt(i)=='o'||
					s1.charAt(i)=='u') {
				s1=s1.replace(s1.charAt(i),'#');
			}
		}
		System.out.println(s1);

}
	
}
