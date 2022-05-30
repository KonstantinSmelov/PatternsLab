package neostudy.Factory;

public class Barista {

    public static Coffee createCoffee(CoffeeType coffeeType) {

        return switch (coffeeType) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
        };
    }
}
