class OverloadingDemo {
    // Method with no parameters
    void display() {
        System.out.println("Display with no parameters");
    }

    // Method with one parameter
    void display(int a) {
        System.out.println("Display with one parameter: " + a);
    }

    // Method with two parameters
    void display(int a, int b) {
        System.out.println("Display with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        demo.display();
        demo.display(10);
        demo.display(20, 30);
    }
}
