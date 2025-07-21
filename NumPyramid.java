import java.util.Scanner;
class NumPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int n=sc.nextInt();
        int start=1;
        int space=n-1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=space; j++) System.out.print("  ");
            for (int k=1; k<=start; k++){
                if (k<=i) System.out.print(k+" ");
                else System.out.print((2*i-k)+" ");
            }
            System.out.println();
            space--;
            start+=2;
        }
    }
}
