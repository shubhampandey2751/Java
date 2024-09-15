package Oopsjava;
public class Recursion {
    // factorial(n)=n*n-1*....1
    // factorial(0)=1
    // factorial(5)=5*4*3*2*1 =123
    // factorial(n)=n*factorial(n-1)
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        /*else{
            return n*factorial(n-1);
        }
        /* */
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
       

    } 
    public static void main(String[] args) {
        int n=5;
        //int x=4;
        System.out.println("Factorial: "+factorial(n));
    }
    
}
