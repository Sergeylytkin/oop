package interfaces;

public class Airplane extends Mashine implements Flying {
    @Override
    public double getSpeed() {
        return 100;
    }
}
