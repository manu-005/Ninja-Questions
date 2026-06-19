package com.dsa.problems;

import java.util.*;

public class MergeList{

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(22);
        list2.add(10);
        list2.add(202);

        list1.add(77);
        list1.add(12);
        list1.add(22);

        Set<Integer> merged = new HashSet<>();

        merged.addAll(list2);
        merged.addAll(list1);

        System.out.println(merged);
    }
}
