import java.util.*;
public class Q5_A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write your number");
        int n =sc.nextInt();
        int count = 0;
        while(n != 0){
            count++;
            n/=10;
        }


        System.out.println(count);

    }

    
}
