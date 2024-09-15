package excerisejava;

import java.util.*;

public class Cd11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);
        // Question 2
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        grade = (char) (grade - 8);
        System.out.println(grade);

        // Question 3
        int g = sc.nextInt();
        System.out.println(g > 8);

    }

}
