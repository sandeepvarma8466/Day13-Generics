package com.blz.generic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to check max of three variables");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b and c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        TestMaximum.testMaximum(a,b,c);
    }
}
