
public class ImpleBike implements BikeInterface {

	    // remainder of this class 
	
	    // implemented as before
	
public void speedUp(int x){
	System.out.println("Speed it up man!"+x);
 }

public static void main(String args[]){
	
	ImpleBike mtb=new ImpleBike();
	mtb.speedUp(12);
}

@Override
public void changeCadence(int newValue) {
	// TODO Auto-generated method stub
	
}

@Override
public void changeGear(int newValue) {
	// TODO Auto-generated method stub
	
}

@Override
public void applyBrakes(int decrement) {
	// TODO Auto-generated method stub
	
}

}
