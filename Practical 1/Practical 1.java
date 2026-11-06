class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    Student(int r, String n, int a, int b, int c) {
        rollNo = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void display() {
        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println();
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vanshika", 88, 90, 85);
        Student s2 = new Student(2, "Vidhi", 80, 80, 80);
        Student s3 = new Student(3, "Sneha", 92, 90, 94);

        s1.display();
        s2.display();
        s3.display();
    }
}

