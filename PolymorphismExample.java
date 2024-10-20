class Calculator {
    // Overloading: same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    // Overriding: subclass provides its own implementation of a method
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Method overloading
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
        System.out.println("Sum: " + calc.add(1, 2, 3));

        // Method overriding
        Animal myAnimal = new Cat();
        myAnimal.sound();
    }
}
