package Oopsjava;
// this is a reference
class Ekclass {
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int c) { // int a
        // a=v;
        // or
        this.a = c;
        //this.a=a;
        System.out.println("he is a good boy"+c);
    }

    public int returnone() {
        return 1;
    }
}
class Shubham extends Ekclass{
    Shubham(int c){
        super(c);
        System.out.println("i am a constructor"+c);
    }
}
public class Thisandsuper{
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
        Shubham d = new Shubham(8);
    }
}
