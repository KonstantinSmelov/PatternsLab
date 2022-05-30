package neostudy.Factory;

public abstract class Coffee {

    public void takeCup() {
        System.out.println("Берём кружку");
    }

    public abstract void makeCoffee();

    public void fillCup() {
        System.out.println("Наливаем кофе");
    }

}
