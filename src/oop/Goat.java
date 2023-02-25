package oop;

public class Goat extends Cow{
    @Override
    public double getMilk() {
        System.out.println("Работает коза");
        return getWeight()/40;
    }
}
