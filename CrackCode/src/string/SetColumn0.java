package string;

import java.util.ArrayList;
import java.util.List;

public class SetColumn0 {
	
	public static int[][] set0(int[][] matrix, int m, int n){
		ArrayList<Integer> rownum = new ArrayList<Integer>();
		ArrayList<Integer> colnum = new ArrayList<Integer>();
		for(int i=0; i<m ; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j]==0){
					rownum.add(i);
					colnum.add(j);
					
					
				}
				
			}
		}
		int[][] a = new int[m][n];
		for(int i=0; i<m ; i++){
			for(int j=0; j<n; j++){
				if(rownum.contains(i) || colnum.contains(j))
					{a[i][j]=0;}	
			
			else{
				a[i][j]=matrix[i][j];
			}
		}
		}
		return a;
	}

	public static int[][] set0New(int[][] matrix, int m, int n){
		
		
		int[][] a = new int[m][n];
		for(int i=0; i<m ; i++){
			for(int j=0; j<n; j++){
				a[i][j] = matrix[i][j];
			}}
		
		for(int i=0; i<m ; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j]==0){
					for(int row=0;row < n;row++){
						a[i][row]=0;
					}
					for(int col=0; col<m;col++){
						a[col][j]=0;
					}
				}
			
			
		}
		}
		return a;
	}

	
	public static void main(String[] args){
		int m=8,n=13;
		int[][] image = new int[m][n];
		int[][] image1 = new int[m][n];
		for(int i=0;i< m ;i++){
			for(int j=0; j<n; j++){
				image[i][j]=(int)(Math.random()*10);
				System.out.print(image[i][j]+" ");
			}
		System.out.println("");
		}
		System.out.println(" ");
		
		long startTime = System.nanoTime();
		image1 = set0(image, m, n);
		long endTime = System.nanoTime();
		 System.out.println(endTime - startTime);
		
		 startTime = System.nanoTime();
		image = set0New(image, m, n);
		endTime = System.nanoTime();
		 System.out.println(endTime - startTime);
		
		for(int i=0;i< m ;i++){
			for(int j=0; j<n; j++){
				System.out.print(image[i][j]+" ");
			}
		System.out.println("");
		}
		
	}

}


	
	
	
	

