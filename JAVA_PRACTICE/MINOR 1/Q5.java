//demonstrate polymorphism usingf interface and two implementing classes
interface Animal {
    void sound(); // Method declaration in the interface
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}


public class Q5 {
    public static void main(String[] args) {
        Cat C = new Cat();
        Dog D = new Dog();
        C.sound();
        D.sound();
    }
    
}
