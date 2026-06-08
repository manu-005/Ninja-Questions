package com.dsa.problems;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] args) {

        // return true if an array having duplicates, if not return false
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size:");
        int num = sc.nextInt();

        System.out.println(num);
        int[] arr = new int[num];

        System.out.println("enter elements");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        int[] arr2 = {1, 4, 4, 2, 5};

        System.out.println(checkDuplicates(arr2));
    }

    public static boolean checkDuplicates(int[] arr) {

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