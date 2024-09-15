package Oopsjava;
interface MyCamera{
    void takeSnap();                //method
    void recordVideo();//method
    //private void greet(){
       // System.out.println("good morning");
    //}
    default void record4kVideo(){
        //greet();
        System.out.println("recording in 4k");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..... ");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("taking snap a");
    }
    //public void record4kVideo(){
        //System.out.println("taking snap is");
    //}

    public String[] getNetworks(){
        System.out.println("getting list of Networks");
        String[] networkList={"shubham","harshit","akhil"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+network );
    }
}
public class Default{
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        //ms.greet();
        ms.record4kVideo();
        String[] ar=ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }

    }
}

