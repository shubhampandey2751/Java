/*import java.util.Scanner;
public class evennumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number  : ");
        int a =sc.nextInt();
        int i =0;
        System.out.println("even number is the:");
        while(i<=a){
            System.out.println(2*i);
            i++;
        }   
    }  
}*/
import java.util.*;
public class evennumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a*b;
        System.out.print("Sum of two number is ");
        System.out.println(c);
        System.out.print("Multilply of two number is ");
        System.out.println(d);
    }
}
