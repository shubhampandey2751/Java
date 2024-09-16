package Excercise;
import java.util.*;
class N extends Thread{
    //public void fun(){
    public void run(){
    //public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("AKHILESH");
                Thread.sleep(1000);
            }
        }  
        catch(InterruptedException i){
        }
    }
}
public class Multithread {
    public static void main(String[] args) throws InterruptedException{
        N t=new N();
        t.start();
        //t.fun();
        //t.fun();
        for(int i=1;i<=5;i++){
            System.out.println("SHUBHAM");
            Thread.sleep(1000);  
        }   
    } 
}
