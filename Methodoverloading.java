package Oopsjava;
import java.util.*;
public class Methodoverloading {
    static void foo(){
        System.out.println("good morning" + " bro");
    }
    static void foo(int a) {
        System.out.println(" good morning "+ a + " bro");
    }
    static void foo(int a,int b){
        System.out.println(" good morning "+ a + " bro");
        System.out.println(" good morning "+ b + " bro");
    }
    //static int foo(int a,int b,int c){
        static void foo(int a,int b,int c){
        System.out.println(" good morning "+ a + " bro");
        System.out.println(" good morning "+ b + " bro");
        System.out.println(" good morning "+ c + " bro");
        //return 3;

    }

    // or
//
//    static void  foo(int a,int b,int c){
//        System.out.println(" good morning "+ a + " bro");
//        System.out.println(" good morning "+ b + " bro");
//        System.out.println(" good morning "+ c + " bro");
//    }


    /*static void change(int a) {
        a=98;
    }
    static void change2(int [] arr){

        arr[0]=98;
    }
    static void telljoke(){ 
        System.out.println("i invented a new word! \n"+"shubham");
    }
    /* */

    public static void main(String[] args) {
//        telljoke();
//         //case1:Changing the integer
//        int x =45;
//        change(x);  
//        System.out.println("the value of x after running change is: "+x);

        //case 1: Changing the array
        //int [] marks = {52,77,78,65,79,64}; 
        //change2(marks);
        //System.out.println("the value of x after running change is "+ marks[0]);

        //Method overloading
        foo();
        foo(4000);
        foo(7000,80000);
        foo(7000,80000,9000);
        System.out.println(foo(3,4,5));
        // argument are actual 

    }
}
