class Student {
    Student() {
        System.out.println("Object is created");
    }

    void display() {
        System.out.println("Student object is working");
    }

    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Practical7 {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();

        s = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
