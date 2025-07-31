import java.util.Scanner;
class ArmStrongRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        System.out.println();
        int count=count(n);
        System.out.println(isArmstrong(n,n,0,count));
    }
    public static int count(int n){
        if (n==0) return 0;
        return 1+count(n/10);
    }
    public static boolean isArmstrong(int n, int m, int sum, int count){
        if (n==0) return m==sum;
        sum+=(int)Math.pow(n%10,count);
        return isArmstrong(n/10,m,sum,count);
    }
}
