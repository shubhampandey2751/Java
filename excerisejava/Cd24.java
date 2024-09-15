package excerisejava;

import java.util.*;

public class Cd24 {
    public static void main(String[] args) {
        /*
         * for (int i = 0; i < 50; i++) {
         * System.out.println(i);
         * System.out.println("java is a great");
         * if (i == 2) {
         * System.out.println("ending the loop");
         * break;
         * }
         * }
         */

        /*
         * int i = 0;
         * while (i < 50) {
         * System.out.println(i);
         * System.out.println("java is a great");
         * if (i == 2) {
         * System.out.println("ending the loop");
         * break;
         * }
         * i++;
         */
        for (int i = 0; i < 58; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("java is a great");
        }

    }
}
