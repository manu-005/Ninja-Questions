package com.dsa.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 7, 6, 5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int reqNum = target - arr[i];

            if (hashMap.containsKey(reqNum)) {

                int[] result = {hashMap.get(reqNum), i};
                return result;
            }
            hashMap.put(arr[i], i);
        }
        return null;
    }
}
