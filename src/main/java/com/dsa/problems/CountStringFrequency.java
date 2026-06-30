package com.dsa.problems;

import java.util.*;
import java.util.stream.Collectors;

public class CountStringFrequency {

    public static void main(String[] args) {

        // Convert a List of Strings into a Map with word
        // count using Java Streams (key should word, value should be it's count)

        List<String> strs = Arrays.asList("manoj", "bharat", "manoj", "manoj", "manu", "bharat");

        Map<String, Long> wordCount = strs.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Map<String, Long> re = strs.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(wordCount);
        System.out.println(re);
    }
}
