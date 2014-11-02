package test;

public class Grasshopper {
	/**
	 * Initialization of view field with n leaves and grasshopper on leaf 'position'.
	 * 
	 * @param n Number of leaves in row.
	 * @param position
	 * 
	 */
	private int[] leaves ;
	private int pos;
	
	
	public Grasshopper(int n, int position) {
		leaves = new int[n];
		pos = position;		
		//if leaf is not eaten leaves[i] = 0;
		//if leaf is eaten leaves[i] = 0;
	}

	/**
	 * Grasshopper has eaten the current leaf and hopped left.
	 */
	public void eatAndHopLeft() {
		int count = 0;
		
		leaves[pos] = 1;
		
		
		pos = pos - 2;
		
		if(leaves[pos] == 0){
			count++;
		}
		while(leaves[pos]!=0 && count!=2 && pos != 0){
			pos = pos -1;
			if(leaves[pos] == 0){
				count++;
			}
			
			
		}
		
	}

	/**
	 * Grasshopper has eaten the current leaf and hopped right.
	 */
	public void eatAndHopRight() {
		
		int count = 0;
		
		leaves[pos] = 1;
		
		pos = pos + 2;
		
		if(leaves[pos] == 0){
			count++;
		}
		while(leaves[pos]!=0 && count!=2 && pos != leaves.length -1){
			
			pos = pos + 1;
			if(leaves[pos] == 0){
				count++;
			}
			
		}
		
	}

	/**
	 * Return the leaf number that grasshopper is feeding on right now.
	 * 
	 * @return Leaf number that grasshopper is feeding on right now.
	 */
	public int whereAmI() {
		
		return pos;
		
	}

	public static void main(String[] args) {
		Grasshopper g = new Grasshopper(5, 2);
		// 1 2* 3 4 5
		System.out.println(g.whereAmI()); // 2

		g.eatAndHopRight();
		// 1 3 4* 5
		System.out.println(g.whereAmI()); // 4

		g.eatAndHopLeft();
		// 1* 3 5
		System.out.println(g.whereAmI()); // 1

		g.eatAndHopRight();
		// 3 5*
		System.out.println(g.whereAmI()); // 5
	}
}