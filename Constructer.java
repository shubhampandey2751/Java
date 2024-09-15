package javaexam1;
class MyMainEmployee{
    private int id;
    private String name;

    public  MyMainEmployee(){                                                         //constructor
        id=45;
        name="your name here"; 
    }

    //public MyMainEmployee(){
 
    public  MyMainEmployee(String myname,int myid){  
        //id=45;
        //name ="shubham";                                                           /constructor
        id=myid;
        name=myname;
    }
    public MyMainEmployee(String myname){  
        //id=45;
        //name ="shubham";                                                              //constructor
        id=56;
        name=myname;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId() {
        return id;
    }
}
public class Constructer {
    public static void main(String[] args) {
        //MyMainEmployee shubham =new MyMainEmployee();
        //MyMainEmployee shubham =new MyMainEmployee("shubham",58);
        MyMainEmployee shubham = new MyMainEmployee("vivek",87);
        //shubham.setName("shubhamwebsite");
        //shubham.setId(48);
        System.out.println(shubham.getId());
        System.out.println(shubham.getName());
    }
}
