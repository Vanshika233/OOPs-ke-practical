class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    void calculatePay() {
        System.out.println("Employee salary: 20000");
    }
}

class Manager extends Employee {
    void calculatePay() {
        System.out.println("Manager salary: 50000");
    }
}

class Developer extends Employee {
    void calculatePay() {
        System.out.println("Developer salary: 35000");
    }
}

public class Practical4 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("METHOD OVERLOADING");
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(5.5, 4.5));

        System.out.println("\nMETHOD OVERRIDING");

        Employee e;

        e = new Manager();
        e.calculatePay();

        e = new Developer();
        e.calculatePay();
    }
}
