import java.util.Scanner;
class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        
        for (int i=1; i<=n/2; i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n) System.out.print("Perfect");
        else System.out.print("not perfect");
    }
}
