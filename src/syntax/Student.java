package syntax;

public class Student {
    private String name;
    private int height;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if(!name.isBlank()) //it's no trend
            this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
