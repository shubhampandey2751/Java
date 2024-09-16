package Excercise;
class x extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("shubam");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i){

        }
 
    }
}
public class radhe {
    public static void main(String[] args) throws InterruptedException{
        x t=new x();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Ram");
            Thread.sleep(1000);
        }
        
    }
}
