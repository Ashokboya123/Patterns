package Arrays;
//WAP to perform addition of 2 matrices
public class Code1 {
	public static void main(String[] args) {
		int mat1 [][]= {{23,24},{34,35}};
		int mat2[][]= {{23,24},{34,35}};
		
		int res [][]=new int[2][2];
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[i].length; j++) {
				res[i][j]=mat1[i][j]+ mat2[i][j];
			}
		}
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
