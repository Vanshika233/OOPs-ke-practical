class Employee {
    int id;
    String name;
    static int count = 0;

    Employee() {
        this(1, "Vanshika");
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Rahul");

        e1.display();
        e2.display();

        System.out.println("Total Employees: " + Employee.count);
    }
}
