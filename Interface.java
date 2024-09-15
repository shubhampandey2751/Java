package Oopsjava;
interface Bicycle{
    //int a=68;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface  hornBicycle{

    void blowhorn();
    void blowhorn1();
    
}
class Avoncycle implements Bicycle,hornBicycle{
    void blowHorn(){
        System.out.println("Pee Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("comman");
    }
    public void blowhorn(){
        System.out.println("Ram");
    }
    public void blowhorn1(){
        System.out.println("Seeta");
    }

}
public class Interface {
    public static void main(String[] args) {
        Avoncycle obj=new Avoncycle();
        obj.applyBrake(5);
        System.out.println(obj.a);
        obj.blowHorn();
        //obj.a=98;
        //System.out.println(obj.a);
        
    }
    
}
