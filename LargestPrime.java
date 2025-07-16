import java.util.Scanner;
class LargestPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Start: ");
        int start=sc.nextInt();
        System.out.print("End: ");
        int end=sc.nextInt();
        
        for (int i=end; i>=start; i--){
            if (i<=1) continue;
            int n=i;
            boolean flag=true;
            for (int j=2; j<=n/2; j++){
                if (n%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(n);
                break;
            }
        }
    }
}
