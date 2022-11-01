package Arrays;
//WAP to perform the sum of even numbers and product of odd numbers
public class Code5 {
	public static void main(String[] args) {
		int arr[]= {45,65,85,95,63,52,362,56,45,95};
		int sum=0;
		int product=1;
		for(int i=0; i<arr.length;i++) {
			if((i%2)==0) {
				sum=sum+arr[i];
				
			}
			else
			{
				product=product*arr[i];
			}
		}
		System.out.println("even sum is"+sum+"odd product is"+product);
		
	}

}
