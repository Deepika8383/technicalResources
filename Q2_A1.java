import java.util.*;
public class Q2_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your marks");
        int num=sc.nextInt();
        if(num>=90){
            System.out.println("Excellent");
        }
        else if(num>=80 && num<90){
            System.out.println("Good");
        }
        else if(num>=70 && num<80){
            System.out.println("fair");
        }
        else if(num>=600 && num<70){
            System.out.println("meet expectations");
        }
        else{
            System.out.println("below par");
        }

        
    }
        
} 
    

