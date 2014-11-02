package sortingsearching;

public class Quicksort {

	public static void quicksort(int[] array, int left, int right){
		
		int index = partition(array, left, right);
		
		if(left < index-1){
			quicksort(array, left, index-1);
		}
		
		if(index < right){
			quicksort(array, index, right);
		}
	}
	
	public static int partition(int[] array, int left, int right){
		
		int pivot = array[(left + right)/2];
	
		while(left <= right){		
				
		while(array[left] < pivot) {
			left++;
		}		
		
		while(array[right] > pivot){
			right--;
		}
		
		if(left <= right){
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		
		}
		
		return left;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,4,8,12,34,78,1};
		
		quicksort(arr, 0, arr.length-1);
		
		for(int i : arr){
			System.out.println(i);
		}
		
		
	}

}
