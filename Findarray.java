import java.util.*;
public class Findarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<n;j++){
                count+=1;
            }
            System.out.println(count);
        }
    }
    
}
