package Arrays;
// WAP to perform addition and average using array approach
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many value want to do add?:");
		int n = sc.nextInt();
		int sum =0;
		int arr[]=new int[n];
		System.out.println("Enter your numbers:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		double sum1 = sum;
		System.out.println("sum is:"+sum);
		System.out.println("Average is:"+sum1/n);
	}

}
