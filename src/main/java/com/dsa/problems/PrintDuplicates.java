package com.dsa.problems;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicates {

    public static void main(String[] args) {

       List<Integer> list =  Arrays.asList(20,55,22,33,45,55,20);

       Set<Integer> result = list.stream().filter(n -> Collections.frequency(list,n) > 1)
               .collect(Collectors.toSet());
        System.out.println(result);
    }
}
