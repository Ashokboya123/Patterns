package Arrays;

import java.util.Scanner;

public class program2D {
	public static void main(String[] args) {
		int arr[][] = new int[2][5];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of student"+(j+1)+"from class :"+(i+1)+" :");
				arr[i][j] = s.nextInt();
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(" The marks of student"+(j+1)+"from class :"+(i+1)+" is"+arr[i][j]);
				
			}
			
		}
		
	}

}
