package abstractMethod;

public class Goat extends Animal{
    public Goat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void run() {
        System.out.println("The horse "+ name + "can run" + ", age "+ age);
    }

    @Override
    void canDrink() {
        System.out.println("The horse "+ name + "can drink" + ", age "+ age);
    }

    @Override
    void canEat() {
        System.out.println("The horse "+ name + "can eat" + ", age "+ age);
    }
}
