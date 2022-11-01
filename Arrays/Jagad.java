package Arrays;
import java.util.Scanner;
public class Jagad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of clases");
		int class_count = sc.nextInt();
		int arr[][]=new int[class_count][];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the total number of students in"+"class"+(i+1));
			int n= sc.nextInt();
			arr[i]=new int[n];
		}
		for(int i=0; i<arr.length;i++) {
			for( int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of student"+(j+1)+"from class"+(i+1)+" :");
			    arr[i][j] = sc.nextInt();
			}
			
			
		}
		for(int i=0; i<arr.length;i++) {
			for( int j=0; j<arr[i].length; j++) {
				System.out.println(" the marks of student"+(j+1)+"from class"+(i+1)+" is"+arr[i][j]);
			    
			}
			
			
		}
		
	}

}
