package interfaces;

public class Hrono {
    public double getTime(int distance, Flying flying){
        return flying.PI*distance/flying.getSpeed();
    }
}
