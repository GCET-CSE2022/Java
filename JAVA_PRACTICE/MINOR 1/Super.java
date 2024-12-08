class Bapi {
    void disp() {
        System.out.println("Hello from Bapi");
    }
}

class Super extends Bapi {
    void display() {
        super.disp(); // Calling the disp method of the parent class
    }

    public static void main(String[] args) {
        Super obj = new Super();
        obj.display();
    }
}
