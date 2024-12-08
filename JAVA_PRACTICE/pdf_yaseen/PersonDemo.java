class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Displaying details of each Person
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
    }
}
