class Student {

    int rollNo;
    String name;
    int mark1, mark2, mark3;

    // Constructor
    Student(int r, String n, int m1, int m2, int m3) {
        rollNo = r;
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Calculate total marks
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Display student details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Priya", 90, 88, 92);
        Student s3 = new Student(103, "Aman", 75, 80, 85);

        s1.display();
        s2.display();
        s3.display();
    }
}
