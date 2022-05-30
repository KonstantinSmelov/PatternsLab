package neostudy.Factory;

public class Cafe {

    public static void main(String[] args) {

        Coffee cupOfCoffee = Barista.createCoffee(CoffeeType.ESPRESSO);

        cupOfCoffee.takeCup();
        cupOfCoffee.makeCoffee();
        cupOfCoffee.fillCup();
    }
}
