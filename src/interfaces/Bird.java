package interfaces;

public class Bird extends Animal implements Flying {
    @Override
    public double getSpeed() {
        return 2;
    }
}
