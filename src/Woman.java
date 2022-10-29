public class Woman { // Polymorphism by method overriding
    void woman() {
        System.out.println("I am a wahman");
    }

}

class Mother extends Woman {
    void woman() {
        System.out.println("I am a mother of 3 kids");
    }
}

class Daughter extends Woman {
    void woman() {
        System.out.println("I am a daughter of one mother :D");
    }
}
