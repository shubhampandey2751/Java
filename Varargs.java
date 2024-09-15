package Oopsjava;
public class Varargs {
    /*static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c;
    }
    /* */
    
    //static int sum(int ...arr){
        // Available as int [] arr;
    static int sum(int x,int ...arr){
        // int result=0;
        int result=x;
        for(int a:arr){//for a in arr
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");
        //System.out.println();
        System.out.println("the sum of number: "+sum(5));
        //System.out.println("The sum of 4 and 5 is: "+sum(a:4,b:5));
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4,3and 5 is: "+sum(4,5,6));
        System.out.println("The sum of 4,3,6and 5 is: "+sum(5,56,54));
    }
}
