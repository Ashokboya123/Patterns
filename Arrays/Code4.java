package Arrays;
//WAP to perform the reversed order array
public class Code4 {
	public static void main(String[] args) {
		int arr[]= {12,45,87,65,42,62,32,65,95,65,63,23};
		int n= arr.length;
		int[]b=new int[n];
		int j=n;
		int m=0;
		for(int i=arr.length-1;i>=0; i--) {
			b[m]=arr[i];
			m++;
			
			
		}
		System.out.println("reversed array is: \n");
		for(int k=0; k<n; k++) {
			System.out.println(b[k]);
			
		}
	
	}

}
