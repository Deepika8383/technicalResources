import java.util.*;
public class Q7_A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write your valid number");
        int n=sc.nextInt();
        int inv=0;
        int i=1;
        while(n!=0){
            int rem=n%10;
            inv= inv + i*(int)Math.pow(10, rem-1);
            n/=10;
            i++;
        }
        System.out.println(inv);
        sc.close();


    }
    
}
