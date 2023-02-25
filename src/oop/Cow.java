package oop;

public class Cow extends Animal{
    public double getMilk(){
        System.out.println("Работает корова");
        return super.getWeight()/20;
        //return getWeight();
    }

}
