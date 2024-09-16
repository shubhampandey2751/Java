package Excercise1;
class DA{
    private int value;
    public void setvalue(int x){
        value =x;
    }
    public int getvalue(){
        return value;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        DA r=new DA();
        r.setvalue(45);
        System.out.println(r.getvalue());
        
    }
}
