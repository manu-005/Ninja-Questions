package com.dsa.problems;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {

    public static void main(String[] args) {

        // return true if an array having duplicates, if not return false

        int[] arr = {1, 4, 2, 5};

        Solution solution = new Solution();

        System.out.println(solution.checkDuplicates(arr));
    }
}

class Solution {

    public boolean checkDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {

            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}