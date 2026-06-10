package com.dsa.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] str) {

        Map<String, List> map = new HashMap<>();



        for (String s : str) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i : count) {

                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();
            System.out.println("key::" + key);

            if (!map.containsKey(key)) {

                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
