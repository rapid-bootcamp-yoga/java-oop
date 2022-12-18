package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Abu");
        cat.run();
        cat.canDrink();

        Cat cat1 = new Cat("Tom");
        cat1.run();
        cat1.canDrink();

        Cat cat2 = new Cat("Kiiten");
        cat2.run();
        cat2.canDrink();

        Horse horse = new Horse("Supersut", 3);
        horse.run();
        horse.canDrink();

        Goat goat = new Goat("Mbek", 4);
        goat.run();
        goat.canEat();
        goat.canDrink();

    }
}
