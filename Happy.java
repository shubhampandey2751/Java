import java.util.*;
public class Happy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int b=n;
        while(b>9 ){
            while(b>0){
                int d=b%10;
                sum=sum+(int) Math.pow(d,2);
                b=b/10;
            }
            b=sum;
            sum=0;
        }
        if(b==1){
            System.out.println("Happy number : " + n);
        }
        else{
            System.out.println("Not Happy numer : " + n ) ;
        }   
    }   
}
