package abstractMethod;

public class Horse extends Animal{

    public Horse(String name, int age){
        this.name= name;
        this.age = age;
    }

    @Override
    void run() {
        System.out.println("The horse "+ name + "can run" + ", age "+ age);
    }

    @Override
    void canDrink() {
        System.out.println("The horse "+ name + " can drink");
    }

    @Override
    void canEat() {

    }
}
