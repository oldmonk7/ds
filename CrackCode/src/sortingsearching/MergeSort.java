package sortingsearching;

public class MergeSort {

	public static void mergeSort(int[] array){
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length -1 );
	}
	
	public static void mergesort(int[] array, int[] helper, int left, int right){
		
		if(left < right){
		int mid = (left + right)/2;
		
		mergesort(array, helper, left, mid);
		mergesort(array, helper, mid+1, right);
		merge(array, helper, left, mid, right);
		}
		
		
	}
	
	public static void merge(int[] array, int[] helper, int left, int mid, int right){
		
		for(int i=0; i<array.length; i++){ 
			helper[i] = array[i];
			}
		
		int current = left;
		int leftVar = left;
		int rightVar = mid +1;
		
		while(leftVar <= mid && rightVar <= right ){
			
			if (helper[leftVar] <= helper[rightVar]){
				array[current++] = helper[leftVar++];	
			}
			
			else{
				array[current++] = helper[rightVar++];
				
			}
		}
		int remaining = mid - leftVar;
		for(int i=0; i<= remaining; i++){
			array[current++] = helper[leftVar++];
			
		}
		
		
	}
	
	public static void main(String[] args) {
	
		int[] arr = {2,7,4,8,12,34,78,1};
		
		mergeSort(arr);
		
		for(int i : arr){
			System.out.println(i);
		}
		
		
		

	}

}
