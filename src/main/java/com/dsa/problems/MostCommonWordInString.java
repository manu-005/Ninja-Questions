package com.dsa.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWordInString {
    public static void main(String[] args) {

        String str = "mmmmmndhkdndbbbbbb";

      Map.Entry<Character,Long> v =  str.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(v);
    }
}
