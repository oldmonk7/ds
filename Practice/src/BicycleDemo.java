
class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle(1,1,1);
        MountainBike mbike= new MountainBike(10,20,30);

        // Invoke methods on 
        // those objects
        bike1.changeCadence(52);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        mbike.changeCadence(510);
        mbike.newCadence();
        mbike.printStates();
    }
}