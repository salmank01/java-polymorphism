public class Main {
    public static void main(String[] args) {
        // Dynamic/Run-time Polymorphism achieved through method overriding
        Woman woman = new Woman();
        Woman mother = new Mother();
        Woman daughter = new Daughter();
        woman.woman();
        mother.woman();
        daughter.woman();

        // Static/Compile-time Polymorphism achieved through method overloading
        Man man = new Man();
        Age age = new Age();
        Hobbies hobbies = new Hobbies();
        man.man("Salman K.");
        age.man(18);
        hobbies.man("Reading", "Drawing");
    }
}
