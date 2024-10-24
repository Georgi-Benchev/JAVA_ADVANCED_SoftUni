package JAVA_ADVANCED.lec_17_Generics.Task5_ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(222);
        list.add(432);
        list.add(123);
        list.add(-123);
        System.out.println(ListUtils.getMax(list));

        List<String> list2 = new ArrayList<>();
        list2.add("100");
        list2.add("222");
        list2.add("432");
        list2.add("123");
        list2.add("-123");
        System.out.println(ListUtils.getMin(list));

        System.out.println(ListUtils.getMin(new ArrayList<String>())); // should throw exception when List is empty


    }
}
