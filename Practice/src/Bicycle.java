 public class Bicycle {

    private int cadence = 0;
    int speed = 0;
    int gear = 1;

   public Bicycle(){
	   
   }
    public Bicycle(int cad, int spd, int gear){
    	cadence=cad;
    	speed=spd;
    	this.gear=gear;
    }
    
    int getCadence()
    {
    	return cadence;
    }
    
    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
