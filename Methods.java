package Oopsjava;
import java.util.*;
public class Methods {
    static int logic(int x,int y){
        //int logic(int x,int y){
        int z;
        if(x>y){
             z=x+y;
            
        }
        else{
            z=(x+y)*5;
        }
        int a=56;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=7;
        int b=6;
        int c;
        //Methods obj=new Methods();
        //c=obj.logic(a,b);

        c=logic(a,b);
        System.out.println(c);
        System.out.println(a+" "+b);

        int a1=3;
        int b1=8;
        int c1;
        //Methods obj1=new Methods();
        //c1=obj1.logic(a1, b1);
        c1=logic(a1,b1);
        System.out.println(c1);

    }
    
}
