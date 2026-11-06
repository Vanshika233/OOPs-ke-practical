interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

class Machine {
    void start() {
        System.out.println("Machine is starting");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Smart printer is printing");
    }

    public void scan() {
        System.out.println("Smart printer is scanning");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        System.out.println("MULTIPLE INHERITANCE USING INTERFACES");

        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println("\nHYBRID INHERITANCE");

        SmartPrinter s = new SmartPrinter();
        s.start();
        s.print();
        s.scan();
    }
}
