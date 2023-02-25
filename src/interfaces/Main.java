package interfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        Hrono hrono = new Hrono();
        double time = hrono.getTime(100, bird);
        System.out.println("время прилета "+time);
        double time2 = hrono.getTime(100, airplane);
        System.out.println("время прилета "+time2);
//        Flying flying = new Flying() {
//            @Override
//            public double getSpeed() {
//                return 0;
//            }
//        }
    }
}