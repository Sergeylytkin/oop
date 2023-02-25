package string;

public class Main {
    public static void main(String[] args) {
//        int year = 2023;
//        System.out.println("Год "+year);
//        System.out.println("Год "+year+1);
//        System.out.println(year+1);
//        System.out.println("Год "+(year+1));
//        System.out.printf("Год %s был раньше %s\n" ,year, 2095.01);
//        System.out.printf("Год %s был раньше %g",year, 2095.01);
        char c = 's';
        String str = "Иванов";
        String str2 = new String("Петров");
        String str3 = str;
        String str4 = new String("Петров");
        String str5 = new String("Сидоров");
        str2 = "Не Петров";//str2 = new String("Не Петров");
        String str6 = "Не Петров";

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0,4).replace("в","р"));
        System.out.println(str);
        str = str.substring(0,4).toUpperCase();
        System.out.println(str);
        str = null;
        System.out.println(str);
        //System.out.println(str.substring(0,2));
        int[][] arr = null;
        arr = new int[3][];
        String s = String.format("new year  %s", 2023);
        String s2 = "иван".substring(0,2);
        String s3 = new String("Хахаха").replace("ха","хи");
        System.out.println(s3);
        String s5 = "";
        System.out.println(s5==null);
//        for (int _i=0; _i<100000; _i++){
//            s5=s5+"хм";
//        }

        //StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        for (int _i=0; _i<10000000; _i++){
            sb = sb.append("хм");
        }
        System.out.println(sb);
    }
}
