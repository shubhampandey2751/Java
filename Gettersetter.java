package Examquestion;
class L{
    private String name;
    private int id;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

}
public class Gettersetter {
   public static void main(String[] args){ 
    L r=new L();
    r.setName("Shubham");
    System.out.println(r.getName());
    r.setId(48);
    System.out.println(r.getId());

    
   } 
}
