package lk.ijse.gdse.ds.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        List<Integer> integerList = new LinkedList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println(integerList);

        list.remove(0);
        System.out.println(list);
    }
}
