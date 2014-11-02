package dynamicP;

import java.math.BigInteger;


//you can also use imports, for example:
//import java.math.*;
public class Solution {
 public static int solution(int N) {
 
	 BigInteger fact=BigInteger.valueOf(1);
	 
	 for (int i=2; i<=N; i++){
		 fact = fact.multiply(BigInteger.valueOf(i));
		 
		 
	 }

	 return sumOfDigits(fact);
 }

 public static int sumOfDigits(BigInteger fact){
	 
	 BigInteger ten = BigInteger.valueOf(10);
	 
	 BigInteger rem = BigInteger.valueOf(0);
	 
	 BigInteger sum = BigInteger.valueOf(0);
	 
	 while ( fact.compareTo(BigInteger.ZERO) > 0 )  
     {  
		 
		 rem = fact.mod(ten);
		 
		sum = sum.add(rem);
		
		if((sum.compareTo(BigInteger.valueOf(100000000))>0)){return BigInteger.valueOf(-1).intValue();}
		
         fact = fact.divide(ten);
         
         
     }   
	 
	 return sum.intValue();
 }
 
public static void main(String args[]){
	
	System.out.println(solution(2000));
	
}

}
