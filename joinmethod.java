package Excercise;
class P extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }
}
public class joinmethod {
    public static void main(String[] args) {
        P t1=new P();
        P t2=new P();
        P t3=new P();

        t1.setName("Thred1");
        t2.setName("thread2");
        t3.setName("thread3");
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException i){
        }
        t1.start();
        t3.start();
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }

    }
}