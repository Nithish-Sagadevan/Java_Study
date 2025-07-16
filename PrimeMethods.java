import java.util.Scanner;
class PrimeMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Start: ");
        int start=sc.nextInt();
        System.out.print("End: ");
        int end=sc.nextInt();
        range(start,end);
    }
    
    public static void range(int start,int end){
        for (int i=start; i<=end; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int n){
        if (n<=1) return false;
        for (int i=2; i<=n/2; i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
