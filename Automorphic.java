import java.util.Scanner;
class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        int square=n*n;
        boolean flag=true;
        while (n>0){
            if ((n%10)!=(square%10)){
                flag=false;
                break;
            }
            n/=10;
            square/=10;
        }
        if (flag) System.out.println("It is Automorphic.");
        else System.out.println("It is not Automorphic.");
    }
}
