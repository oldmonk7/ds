package string;

public class Rot90 {

	public static int[][] rot90(int[][] matrix, int n){
		int[][] a = new int[n][n]; 
		for(int i=0; i<n ; i++){
			for(int j=0; j<n; j++){
				a[j][n-i-1] = matrix[i][j];
				
			}
		}
		return a;
	}
	
	
	public static void main(String[] args){
		int n=5;
		int[][] image = new int[n][n];
		for(int i=0;i< n ;i++){
			for(int j=0; j<n; j++){
				image[i][j]=(int)(Math.random()*10);
				System.out.print(image[i][j]);
			}
		System.out.println("");
		}
		image = rot90(image, n);
		for(int i=0;i< n ;i++){
			for(int j=0; j<n; j++){
				System.out.print(image[i][j]);
			}
		System.out.println("");
		}
		
	}
}
