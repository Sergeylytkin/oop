package oop;

public class Animal {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if(name!="")
        this.name = name;
        if(name=="") {
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                throw new RuntimeException();
//            }
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
