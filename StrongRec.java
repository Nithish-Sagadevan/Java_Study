import java.util.Scanner;
class StrongRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start=sc.nextInt();
        System.out.print("Enter ending range: ");
        int end=sc.nextInt();
        range(start,end);
    }
    
    public static boolean isStrong(int n, int m, int sum){
        if (n==0) return m==sum;
        int a=n%10;
        sum=sum+fact(a);
        return isStrong(n/10,m,sum);
    }
    
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    
    public static void range(int start, int end){
        if (start>end) return;
        if (isStrong(start,start,0)) System.out.println(start);
        range (start+1, end);
    }
}
