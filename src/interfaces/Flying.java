package interfaces;

public interface Flying {
    public final double PI = 3.14;
    public double getSpeed();
    default double calc(double x, double y){
        return x*y;
    }
}
