package syntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("\"Сергей \"");
        System.out.print("Лыткин\n");
        System.out.print("Сергей");
        System.out.print(" Лы\tтк\tин\\");
        System.out.println();
        int x = 0;
        if(x>0) {
            System.out.println("число положительное");
        }else if(x==0){
            System.out.println("ни то, ни се");
        }else{
            System.out.println("число отрицательное");
        }
        int c = 0;
        while(c<10){
            System.out.println("счетчик="+c);
            //c=c+1;//
            //c++;//
            ++c;
        }
        for(int _i=0; _i<6; _i++){
            if(_i%2==1) {
                System.out.print("император ");
                System.out.println("Петр " + _i);
            }else {
                System.out.print("императрица ");
                System.out.println("Екатерина " + _i);
            }
        }
        int x1 = 2;
        int x2 = 3;
        System.out.println(calc(x1,x2));
        System.out.println("Ураа!!");
    }
    public static int calc(int x, int y){
        //x = 10;
        return x*y;
    }
}