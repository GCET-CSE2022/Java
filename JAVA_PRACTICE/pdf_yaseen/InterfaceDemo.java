interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document...");
    }
}

class Photo implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a photo...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable p1 = new Document();
        Printable p2 = new Photo();

        p1.print();
        p2.print();
    }
}
