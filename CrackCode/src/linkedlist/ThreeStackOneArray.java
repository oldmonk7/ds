package linkedlist;

public class ThreeStackOneArray {
	
	static int[] a = new int[100];
	static int i=-2;
	static int j=-1;
	static int k=0;

	public static void push(int stacknum, int data){
		
		if(stacknum == 1){
			i=i+2;
			a[i] = data;
			
		}
		if(stacknum == 2){
			j=j+2;
			a[j] = data;
			
		}
		if(stacknum == 3){
			k+=2;
			a[k] = data;
			
		}
		
		
		
	}
	
	public static int pop(int stacknum){
		
		if(stacknum == 1){
			if(i >=0){
		
			int temp = a[i];
			a[i] = 0;
			i-=2;
			return temp;
			
			}
			else{
			return 0;
			
			}
		}
		if(stacknum == 2){
			if(j >=1){
				int temp = a[j];
				a[j] = 0;
				j-=2;
				return temp;
			
			}
			else{
				return 0;
			}
		}
		if(stacknum == 3){ 
				if(k >=2){
					int temp = a[k];
					a[k] = 0;
					k-=2;
					return temp;
			
				}
				else{
					return 0;
			
				}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		push(1,1);
		push(2,2);
		push(3,3);
		push(1,4);
		System.out.println(pop(2));
	
	
	}

	
}
