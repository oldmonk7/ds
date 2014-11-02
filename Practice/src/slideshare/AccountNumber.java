package slideshare;

public class AccountNumber {
	
	public static boolean isValid(int num){
		
		
		int newNum =0;
		int placeValue = 1; 
		int count = 0;
		while(num != 0){
			
			placeValue = placeValue *  10;
			
			int rem = num % 10;
			if(count++ % 2 == 1){
				
			newNum = newNum + placeValue * ((rem * 2) % 9); 
			}
			else{
				
				newNum = newNum + placeValue * rem; 
			}
			num = num/10;
			
		}
		

		int sum = 0;
		
		while(newNum != 0){
			
			sum += newNum % 10;
			newNum = newNum/10;		
			
		}
		
		if(sum % 10 == 0) return true;
		else return false;
		
		
	}

	public static String getFullAccountNumber(String partial){
		
		int partialNum = Integer.parseInt(partial);
		for(int i = 0; i<=9; i++){//assuming checkDigit is from 0 to 9
		if(isValid(10*partialNum+i))
			return (partial+String.valueOf(i));
	    }
	
		return "Not Valid";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFullAccountNumber("12345"));
		System.out.println(isValid(18465));
		System.out.println(isValid(331));
		System.out.println(isValid(5555));
	
		
	}

}
