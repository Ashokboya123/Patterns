package Arrays;
import java.util.Scanner;
public class Array3D {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number of university:");
	int uni =sc. nextInt();
	System.out.println("Enter the total no: of class in each university:");
	int cls = sc.nextInt();
	System.out.println("enter the total no of students in each class:");
	int stu = sc.nextInt();
	int arr[][][]= new int[uni][cls][stu];
	for(int i=0; i<arr.length; i++) {
		System.out.println("inside the university no:"+(i+1));
		for(int j=0; j<arr[i].length; j++) {
			for(int k=0; k<arr[i][j].length; k++) {
				System.out.println("Enter the marks of"+"student"+(k+1)+" "+"from class"+(j+1)+" :");
				arr[i][j][k]=sc.nextInt();
			}
		}
		
	}
	for(int i=0; i<arr.length; i++) {
		System.out.println("inside the university no:"+(i+1));
		for(int j=0; j<arr[i].length; j++) {
			for(int k=0; k<arr[i][j].length; k++) {
				System.out.println(" the marks of"+"student"+(k+1)+" "+"from class"+(j+1)+"is"+arr[i][j][k]);
				
			}
		}
	}
		
	
}
}
