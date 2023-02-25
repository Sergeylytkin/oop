package list;

import java.util.ArrayList;
//import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[3];
        String[] arr = new String[34];
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3434);
        list.add(783875);
        list.add(89);
        for (int _i = 0; _i < list.size(); _i++) {
            System.out.print(list.get(_i)+" ");
        }
        System.out.println();
        list.add(20000);
        System.out.println(list);
        ArrayList list2 = list;
        list.add(2023);
        System.out.println(list);
        System.out.println(list2);
        list2 = (ArrayList) list.clone();
        list.add(2024);
        System.out.println(list);
        System.out.println(list2);
        //list.add(new Integer(12));
        list.add(Integer.valueOf(12));
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(1));
        System.out.println(list);
        list.set(4,20001);
        System.out.println(list);
        list.add(0,-1);
        System.out.println(list);
        System.out.println(list.indexOf(Integer.valueOf(20001)));
        list.addAll(list);
        System.out.println(list);
    }
}