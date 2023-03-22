import java.util.*;
public class Q3_A1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("how many number you want to test");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("write your number");
            int n=sc.nextInt();
            for(int i=2; i<=n/2; i++){
    
                if(n%i==0){
                    System.out.println("not prime");
                    break;
                }
                else{
                    System.out.println("prime");
                    break;
                }
                
            }
            

        }
    
    }
}
