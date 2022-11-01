package Arrays;

import java.util.Arrays;

public class Code7 {
	public static void main(String[] args) {
		int arr[]= {10,40,20,50,38,1,55,99,75,175,100,125,200,150};
		System.out.println("before sorting");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		Arrays.sort(arr,5,arr.length-1);
		// this sort method is used to sort the given array in ascending order within the 
		//specified positions
		// The sort will start from the specified start position and will go till the specified last position
		// but the last specified will not be considered for sorting
		
		System.out.println("After the sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
