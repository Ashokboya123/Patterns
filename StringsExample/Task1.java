package StringsExample;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		int alphabeatCount=0;
		int digCount=0;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90) {
				alphabeatCount++;
			}
			  else if(s1.charAt(i)>=97 && s1.charAt(i)<=122) {
					alphabeatCount++;
			  }
			
		  else if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
				digCount++;
			}
			else {
				
			}
			
		}
		System.out.println("number of digits is:"+digCount);
		System.out.println("number of alphabets is:"+alphabeatCount);
	}

}
