package Files;




public class Painter {
	
	public static void main(String args[]){
	
	String[] canvas = {"WBBBBBB","BBBBBBB","BBBBBBB","BBBBBBB","BBBBBBB"};
	System.out.println(largestBrush(canvas));
		
	}
	
	
	public static int largestBrush(String[] canvas){
		
		int n=canvas.length;
		int m = canvas[0].length();
		int maxn = n;
		int maxm= m;
		for(int i=0; i<n; i++)
		{
			int count=0;
			  for(int j=0;j < m; j++){
				  
				  if(canvas[i].charAt(j)=='B')
				  {
					  count++;
				  }
				  if((canvas[i].charAt(j)=='W')||(j==(m-1))){
					  
					  if(maxm > count && count!=0)
					  {maxm = count;}
					 count=0; 
				  }
				  
				  
			  }
			
			
			
		}
		for(int i=0; i<m; i++)
		{
			int count=0;
			  for(int j=0;j < n; j++){
				  
				  if(canvas[j].charAt(i)=='B')
				  {
					  count++;
				  }
				  if((canvas[j].charAt(i)=='W')||(j==(n-1))){
					  
					  if(maxn > count && count!=0)
					  {maxn = count;}
					 count=0; 
				  }
				  
				  
			  }
			
			
			
		}
		
		if(maxm>=maxn)
			return maxn;
		    return maxm;
		
		
	}
	

}
