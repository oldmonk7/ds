package test;

import org.junit.*;

public class Paragraph {
	/**
	 * @param paragraph
	 *            Well formatted paragraph.
	 * @return Returns paragraph with all valid dates changed from MM/DD/YYYY to
	 *         DD/MM/YYYY.
	 */
	public static String changeDateFormat(String paragraph) {
		String result = "";
		String[] arrWords = paragraph.split(" ");
		
		for(int i = 0; i< arrWords.length; i++){
			if(arrWords[i].contains("/")){
				
				String[] arr = arrWords[i].split("/");
				arrWords[i] = arr[1] + "/" + arr[0] + "/" + arr[2];
				
			}
			
			
		}
		for(int i = 0; i<arrWords.length ; i++){
			result = result + arrWords[i] + " ";
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(changeDateFormat("Today is 09/08/2013 and I have to work."));
		// Last time it rained was on 25/07/2013 and today is 09/08/2013.
	}
}