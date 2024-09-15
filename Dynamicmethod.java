package Oopsjava;
class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void name(){
        System.out.println("my name is java");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("aapka swagat hai");
    }
    public void name(){
        System.out.println("my name is java in class two");
    }

}
public class Dynamicmethod{
    public static void main(String[] args) {
//        Phone obj =new Phone();
//        SmartPhone m1core=new SmartPhone();
//        m1core.swagat();
//        m1core.name();
//        obj.name();
//        obj.greet();
        Phone obj = new SmartPhone(); // yes it is allowed
        obj.greet();
        obj.name(); // dynamicmethod
        
    }
}
