import java.util.*;
public class Q6_A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write yout number");
        int n=sc.nextInt();
        int rev = 0;
        while(n!=0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        System.out.print(rev);
        
    }
    
    
    
}
