// ============================================
// Inheritance Example ~ BMW Car System
// Author ~ Vikas Kumar
// Topic ~ OOP ~ Inheritance ~ Polymorphism
// ============================================

// Parent class ~ Vehicle
class Vehicle {
    // Base method ~ General vehicle info
    public void info() {
        System.out.println("BMW");
    }
}

// Child class 1 ~ Inherits Vehicle
class Wheel extends Vehicle {
    // Override ~ Wheel specific info
    @Override
    public void info() {
        System.out.println("4 wheel");
    }
}

// Child class 2 ~ Inherits Vehicle
class Colour extends Vehicle {
    // Override ~ Colour specific info
    @Override
    public void info() {
        System.out.println("Blue");
    }
}

// Main class ~ Program starts here
class CarBmw {
    public static void main(String[] args) {

        // Creating objects
        Vehicle v1 = new Vehicle();
        Vehicle w1 = new Wheel();
        Vehicle c1 = new Colour();

        // Calling overridden methods
        v1.info(); // Vehicle info
        w1.info(); // Wheel info
        c1.info(); // Colour info
    }
}
```

---

**GitHub Description~**
```
Java OOP ~ Inheritance example using BMW Car 
system. Demonstrates method overriding with 
parent class Vehicle and child classes 
Wheel and Colour.
