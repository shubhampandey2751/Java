package excerisejava;

import java.util.*;

public class Cd27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = { 98, 34, 4, 5, 65 };
        /*
         * System.out.println(marks.length);
         * System.out.println(marks[0]);
         * String[] students = { "Shubham", "Rohan", "Vivek" };
         * System.out.println(students[2]);/*
         */

        // Display array by using for loop
        /*
         * for (int i = 0; i < marks.length; i++) {
         * System.out.println(marks[i]);
         * }
         * /*
         */
        for (float element : marks) {
            System.out.println(element);
        }
    }

}
