package Arrays;
import java.util.Scanner;
public class JaggadArrays {
	public static void main(String[] args) {
		int arr [][]= new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		Scanner s = new Scanner(System.in);
		for( int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of student"+(j+1)+" "+"from class :"+(i+1)+" :");
				arr[i][j]= s.nextInt();
			}
		}
		for( int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(" the marks of student"+(j+1)+" "+"from class :"+(i+1)+" is "+arr[i][j]);
		
			}
		}
		
		
	}

}
