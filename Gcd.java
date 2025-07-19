import java.util.Scanner;
class Gcd{
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a=sc.nextInt();
        System.out.print("Enter num b: ");
        int b=sc.nextInt();
        int c=a<b?a:b;
        
        while (true){
            if (a%c==0 && b%c==0) break;
            c--;
        }
        System.out.println(c);
    }
}
