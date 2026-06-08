package com.dsa.problems;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {

        int s1Len = s1.length();
        int s2Len = s2.length();

        if (s1Len != s2Len) {
            return false;
        } else {

            int[] count = new int[26];

            for (int i = 0; i < s1Len; i++) {
                count[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s2Len; i++) {
                count[s2.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
