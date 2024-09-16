package Excercise;
class Z implements Runnable{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Shubham");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i){

        }
    }

}
public class MultiThreadimplement {
    public static void main(String[] args) throws InterruptedException{
        Z r=new Z();
        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
         
    }
    
}
