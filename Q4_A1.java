import java.util.Scanner;

public class Q4_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of range: ");
        int low = sc.nextInt();
        System.out.print("Enter the higher limit of range: ");
        int high = sc.nextInt();
        System.out.println("Prime numbers between " + low + " and " + high + " are: ");
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
