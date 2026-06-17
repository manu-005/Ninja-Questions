package com.dsa.problems;

import java.util.*;

public class TopKFrequentElement {

    public static void main(String[] args) {

        int[] nums = {1, 1,5 ,5,5,5,5,5,5,5,5,5,33,3,3,3,3,3,3,3,3,2,2,3,2,22,2,1, 1, 2, 2, 3, 3, 4};

        int k = 2;

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        System.out.println(frequency.keySet());
        for (int key : frequency.keySet()) {

            int fre = frequency.get(key);

            if (bucket[fre] == null) {

                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {

            if (bucket[pos] != null) {

                for (Integer n : bucket[pos]) {
                    if (counter == k) {
                        break;
                    }
                    res[counter++] = n;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
