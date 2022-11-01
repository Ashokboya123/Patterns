package Arrays;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
	for(int i=0; i < arr.length; i++) {
		System.out.println("Enter the marks of student"+(i+1)+" :");
		arr[i] =s.nextInt();
	}
	for(int i=0; i<5; i++) {
		System.out.println("The marks of student "+(i+1)+ "is :"+arr[i]);
	}
	}

}
