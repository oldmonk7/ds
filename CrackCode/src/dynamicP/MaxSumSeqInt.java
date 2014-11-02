package dynamicP;

public class MaxSumSeqInt {
	
	public static int findMaxSum(int[] a){
		
		int maxSum = 0;
		int sum = 0;
		for(int i=0; i<a.length; i++){
			
			sum += a[i];
			
			if(sum >= maxSum) {
				
				maxSum = sum;
			}
			else {
			     if(sum < 0){
			       sum = 0;	 
			     }
			     }
			
			
		}
		
		return maxSum;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  a = {5,-9,6,-2,3};
		System.out.println(findMaxSum(a));
		

	}

}
