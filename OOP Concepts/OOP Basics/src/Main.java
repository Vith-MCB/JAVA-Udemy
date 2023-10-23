// Class: Defines a basic structure
class Animal {
    String name;

    // Constructor: Initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Method: Display basic info
    public void introduce() {
        System.out.println("I am an animal named " + name);
    }
}

// Inheritance: Cat is a subclass of Animal
class Cat extends Animal {
    String breed;

    // Constructor: Initialize name and breed
    public Cat(String name, String breed) {
        super(name); // Call the parent class constructor
        this.breed = breed;
    }

    // Method Overriding: Customize the introduce method
    @Override
    public void introduce() {
        System.out.println("I am a cat named " + name + " of breed " + breed);
    }
}

// Static vs Instance Variables
class Counter {
    static int staticCount = 0;
    int instanceCount = 0;

    public Counter() {
        staticCount++;
        instanceCount++;
    }
}

// Composition: A Person has an Address
class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city);
    }
}

// Encapsulation: Using private fields and public methods
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

// Polymorphism: Using a common interface
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        // Inheritance and Method Overriding
        Cat cat = new Cat("Whiskers", "Siamese");
        cat.introduce();

        // Static vs Instance Variables
        // Create Counter objects to demonstrate variable behavior
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        // Access static and instance variables from Counter objects
        System.out.println("Static Count: " + Counter.staticCount);
        System.out.println("Instance Count: " + counter1.instanceCount);

        // Composition
        Address address = new Address("123 Main St", "Cityville");
        // Create a Person object that contains the Address
        Person person = new Person("Alice", address);
        person.displayInfo();

        // Encapsulation
        BankAccount account = new BankAccount(1000); // Create a BankAccount object with an initial balance
        // Deposit and withdraw money using encapsulated methods
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Account Balance: " + account.getBalance());

        // Polymorphism
        // Create Circle and Square objects that implement the Shape interface
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        // Calculate and display the area using polymorphism
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
