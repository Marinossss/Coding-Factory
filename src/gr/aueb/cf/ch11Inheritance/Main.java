package gr.aueb.cf.ch11Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy", 4);
        Cat cat = new Cat("Luna", 3);

        doSpeak(dog);
        doSpeak(cat);

        System.out.println(dog.toString());
        System.out.println(cat.toString());



    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
