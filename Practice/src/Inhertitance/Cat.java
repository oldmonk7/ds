package Inhertitance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The class method" + " in Cat.");
    }
    public void testInstanceMethod() {
    	super.testInstanceMethod();
        System.out.println("The instance method" + " in Cat.");
    }

     
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = (Animal)myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Cat.testClassMethod();
        Animal.testClassMethod();
        myAnimal.testClassMethod();
        
    }
}
