package com.blz.generic;

import java.util.Scanner;

public class TestMaximum <T extends Comparable<T>> {
    T x, y, z;
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static <T extends Comparable<T>> T testMaximum(T...values){
        T max=values[0];
        for (T element:values) {
            if (element.compareTo(max)>0)
            max = element;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans;
        do {
            System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
            int ch = s.nextInt();
            switch(ch) {
                case 1:
                {
                    System.out.print("Enter First Value: ");
                    Integer first = s.nextInt();

                    System.out.print("Enter Second Value: ");
                    Integer second = s.nextInt();

                    System.out.print("Enter Third Value: ");
                    Integer third = s.nextInt();

                    System.out.println("Maximum Integer value is : " + TestMaximum.<Integer>testMaximum(first,second,third));

                    break;
                }
                case 2:
                {
                    System.out.print("Enter First Value: ");
                    Float first = s.nextFloat();

                    System.out.print("Enter Second Value: ");
                    Float second = s.nextFloat();

                    System.out.print("Enter Third Value: ");
                    Float third = s.nextFloat();

                    System.out.println("Maximum float value is : " + TestMaximum.<Float>testMaximum(first,second,third));
                    break;
                }
                case 3:
                {
                    System.out.print("Enter First Value: ");
                    String first = s.next();

                    System.out.print("Enter Second Value: ");
                    String second = s.next();

                    System.out.print("Enter Third value ");
                    String third = s.next();

                    System.out.println("Maximum String value is : " + TestMaximum.<String>testMaximum(first, second, third));
                    break;
                }
                default:
                    System.out.println("Enter Choice Between 1 And 3");
            }
            System.out.println("Do you want to continue ? press 1 for continue");
            ans = s.nextInt();
        }while(ans == 1);

    }
}
