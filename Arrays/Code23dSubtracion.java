package Arrays;
import java.util.Scanner;
//WAP to perform subtracion of 2 matrices by collecting inputs dynamically(3r and 3c 3D)
public class Code23dSubtracion {
	public static void main(String[] args) {
		int mat1[][]=new int[3][3];
		int mat2[][]= new int[3][3];
		Scanner sc = new Scanner(System.in);
		int res[][]=new int[3][3];
		System.out.println("matrix-1:");
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[i].length; j++) {
				System.out.println("Enter the value:");
			    mat1[i][j]=sc.nextInt();
			}
	
			}
			System.out.println("matrix-2:");
		for(int i=0; i<mat2.length; i++) {
			for(int j=0; j<mat2[i].length; j++) {
				System.out.println("enter the value:");
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("results:");
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[i].length; j++) {
			res[i][j]=mat1[i][j]-mat2[i][j];
			System.out.print(res[i][j]+" ");
					
			}
			System.out.println();
		}
		
		
		
		
	}

}
