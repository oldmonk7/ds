class BreakWithLabel {
    public static void main(String[] args) {

        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;
        int x = 0;
        int y = 0;
        int i;
        int j = 0;
        boolean foundIt = false;

    for (i = 0; i < arrayOfInts.length; i++) {
	    nested:
		for (j = 0; j < arrayOfInts[i].length;
	         j++) {
	        if (arrayOfInts[i][j] == searchfor) {
	         x=i;
	         y=j;
	            foundIt = true;
	            break nested;
	        }
	    }
    }
	

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + x + ", " + y);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
