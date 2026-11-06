
class Vehicle {
    void show() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car is a vehicle");
    }
}

// Multilevel Inheritance
class Person {
    void show() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I am a manager");
    }
}

// Hierarchical Inheritance
class Shape {
    void show() {
        System.out.println("I am a shape");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("I am a circle");
    }
}

class Rectangle extends Shape {
    void display() {
        System.out.println("I am a rectangle");
    }
}

public class Practical2 {
    public static void main(String[] args) {

        System.out.println("SINGLE INHERITANCE");
        Car c = new Car();
        c.show();
        c.display();

        System.out.println("\nMULTILEVEL INHERITANCE");
        Manager m = new Manager();
        m.show();
        m.work();
        m.manage();

        System.out.println("\nHIERARCHICAL INHERITANCE");
        Circle ci = new Circle();
        ci.show();
        ci.display();

        Rectangle r = new Rectangle();
        r.show();
        r.display();
    }
}

