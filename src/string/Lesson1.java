package string;

public class Lesson1 {
    public static void main(String[] args) {
        int x = 0;
        char c ='ы';
        String str = new String("ПЕтров");
        System.out.println(str);
        String str2 = "Сидоров";
        String str3 = str2;
        System.out.println(str2==str3);
        String str4 = new String("Петров");
        String str5 = "Сидоров";//str5==str2
        System.out.println(str2==str5);
        str5 = "не Сидоров";
        System.out.println(str2==str5);
        //str5 = null;
        System.out.println(str5.toUpperCase());
        System.out.println(str5.replace("Си","Фе"));
        str5 = str5.toUpperCase();
        System.out.println(str5.replace("СИ","Фе"));
        System.out.println(str5.substring(0,5));
        System.out.println(str==str4);
        System.out.println(str.equals(str4));
        System.out.println(str.equalsIgnoreCase(str4));
        System.out.printf("Год%s потом %d\n", 1945,x);
        String s = String.format("Год%s потом %d", 1945,x);
        System.out.println(s);
//        for(int _i=0; _i<100000; _i++){
//            s=s+"хм";
//        }
        //System.out.println(s);
        //StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        for(int _i=0; _i<1000000000; _i++){
            sb.append("хм");
        }
        System.out.println(sb);
    }
}
