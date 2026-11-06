class ComplexNumber {
    int real, imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(
            real + c.real,
            imaginary + c.imaginary
        );
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Practical5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        ComplexNumber c3 = c1.add(c2);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        System.out.println("Addition:");
        c3.display();
    }
}
