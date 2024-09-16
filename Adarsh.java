package Examquestion;
import java.util.*;
class A{
    int a=10;
    void show(){
       System.out.println(a);
    }
}
class B extends A{
   
    void show1(){
       
        System.out.println(super.a);
    }
}
public class Adarsh{
    public static void main(String[] args) {
        B r=new B();
        r.show();
       // r.show1();
    }  
}
    
