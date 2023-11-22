package lk.ijse.gdse.ds.linkedlist;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);

        System.out.println(list);

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(40);

        System.out.println("set1 :"+set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(10);
        set2.add(40);

        System.out.println("set2 :"+set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(10);
        set3.add(40);

        System.out.println("set3 :"+set3);


    }
}
