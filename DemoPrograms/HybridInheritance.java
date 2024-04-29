package DemoPrograms;

// Interface for animals
interface Animal {
    void eat();
}

// Interface for vehicles
interface Vehicle {
    void drive();
}

// Base class for living beings
class LivingBeing {
    void breathe() {
        System.out.println("Living being is breathing...");
    }
}

// Dog class inheriting from LivingBeing and implementing Animal interface
class Dog extends LivingBeing implements Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}

// RobotDog class inheriting from Dog and implementing Vehicle interface
class RobotDog extends Dog implements Vehicle {
    void chargeBattery() {
        System.out.println("Robot dog is charging its battery...");
    }

    @Override
    public void drive() {
        System.out.println("Robot dog is driving...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        RobotDog robotDog = new RobotDog();
        robotDog.breathe();       // Inherited from LivingBeing
        robotDog.eat();           // Inherited from Animal (implemented by Dog)
        robotDog.bark();          // Defined in Dog class
        robotDog.drive();         // Defined in RobotDog class
        robotDog.chargeBattery(); // Defined in RobotDog class
    }
}
