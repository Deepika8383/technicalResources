public class Q8_A1 {
    public static void main(String[] args) {
        int n=12340856;
        int k=3;
        int no=0;
        while(k!=0){
            int rem=n%10;
            no = no + rem*(int)Math.pow(10, 8-k);
            n/=10;
            k-=1;
        }
        no=no+n;
        System.out.println(no);
    }
    
}
