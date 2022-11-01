package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Code9 {
	public static void main(String[] args) {
		int arr[]= {45,12,56,35,89,45,65,63,84};
		Scanner sc = new Scanner(System.in);
		Arrays.sort(arr);
		System.out.println("After the sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		int res = Arrays.binarySearch(arr,key );
		System.out.println(res);
		if(res<0)
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("Element found  in the position:"+res);
		}
	}

}
