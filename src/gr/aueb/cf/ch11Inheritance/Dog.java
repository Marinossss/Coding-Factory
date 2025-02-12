package gr.aueb.cf.ch11Inheritance;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I am a dog.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
