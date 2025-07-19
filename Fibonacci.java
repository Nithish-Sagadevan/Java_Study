import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range: ");
        int range=sc.nextInt();
        int a=0,b=1,c;
        for (int i=1; i<=range; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
