interface Animal {
    void eat();
}

class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal cow = new Cow();
        cow.eat();
    }
}
