package Arrays;
// sorting the array using built-in methods
import java.util.Arrays;
public class Code6 {
	public static void main(String[] args) {
		int arr[]= {10,40,20,50,38};
		System.out.println("before sorting");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		Arrays.sort(arr);//sort is used to sort the given array in ascending order
		System.out.println("After the sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
