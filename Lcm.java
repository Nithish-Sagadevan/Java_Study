import java.util.Scanner;
class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a=sc.nextInt();
        System.out.print("Enter num b: ");
        int b=sc.nextInt();
        int c=a>b?a:b;
        
        int i=c;
        while (true) {
            if (c%a==0 && c%b==0) break;
            c+=i;
        }
        System.out.println(c);
    }
}
