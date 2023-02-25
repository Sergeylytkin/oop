package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Tom");
        list.add("Bob");
        list.add("Jack");
        list.add("Alisa");
        list.add("Ted");
        System.out.println(list);
        list.remove("Bob");
        System.out.println(list);
        list.add("Bob");
        list.add("Bob");
        list.add("Bob");
        list.add(0,"Bob");
        System.out.println(list);
        list.remove("Bob");
        System.out.println(list);
        //list.add(2023);
        System.out.println(list);
        ArrayList list2 = new ArrayList(list);
        ArrayList list3 = new ArrayList(Arrays.asList("Cat","Dog","Cow","Tom"));
        list.removeAll(list3);
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Человек");
        //list4.add(23);


    }
}
