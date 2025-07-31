import java.util.Scanner;
class AlternatePal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start=sc.nextInt();
        System.out.print("Enter ending range: ");
        int end=sc.nextInt();
        range(start, end);
    }
    public static void range(int start, int end){
        if (start>end) return;
        if (start>10 && isPal(start,start,0)) System.out.println(start);
        range(start+2,end);
    }
    public static boolean isPal(int n, int m, int sum){
        if (n==0) return m==sum;
        sum=(sum*10)+n%10;
        return isPal(n/10, m, sum);
    }
}
