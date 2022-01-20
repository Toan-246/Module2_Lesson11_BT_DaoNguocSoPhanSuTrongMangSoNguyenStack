package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 8, 9, 11, 25, 26, 35};
        Stack<Integer> stack = new Stack<>();

        System.out.println("Mảng ban đầu");

        for (int e : arr) {
            System.out.print(e + "\t");
        }
        for (int e : arr) {
            stack.push(e);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("\nMảng đảo ngược");
        for (int e : arr) {
            System.out.print(e + "\t");
        }
    }
}
