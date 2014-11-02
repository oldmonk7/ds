class MountainBike extends Bicycle {

    // new fields and methods defining 
	int cadence2;
	
	MountainBike(int cad, int spd, int gear){
		
		super(cad,spd,gear);
	}
	
	void newCadence()
	{
		cadence2=getCadence()+1;
		System.out.println("new cadence= "+cadence2);
	}
			
    // a mountain bike would go here

}