package Arrays;

import java.util.Arrays;
import java.util.Collections;
public class Code8 {
	public static void main(String[] args) {
		Integer arr[]= {10,40,20,50,38,1,55,99,75,175,100,125,200,150};
		System.out.println("before sorting");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		Arrays.sort(arr,Collections.reverseOrder());
		// this sort method is used to sort the given array in descending order  
		// The sort method will accept 2 parameters
		//  it 1st parameter will be the array is of the non-primitive type
		//  2nd it is the method call from the collection class present the java.util package
		
		System.out.println("After the sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
