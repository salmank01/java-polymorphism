public class Man { // Polymorphism by method overloading
    void man(String name) {
        System.out.println("My name is " + name);
    }
}

class Age extends Man {
    void man(int age) {
        System.out.println("I am " + age + " years old");
    }
}

class Hobbies extends Man {
    void man(String hobbyOne, String hobbyTwo) {
        System.out.println("I like " + hobbyOne + " and " + hobbyTwo);
    }
}
