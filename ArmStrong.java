import java.util.Scanner;
class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        int count=0;
        while (n>0){
            count++;
            n/=10;
        }
        n=org;
        while (n>0){
            int r=n%10;
            int prod=1;
            for (int i=1; i<=count; i++){
                prod*=r;
            }
            sum+=prod;
            n/=10;
        }
        if (org==sum) System.out.println("Armstrong");
        else System.out.println("not Armstrong");
    }
}
