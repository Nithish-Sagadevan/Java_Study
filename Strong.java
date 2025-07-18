import java.util.Scanner;
class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        
        while (n>0){
            int r=n%10;
            int prod=1;
            for (int i=1; i<=r; i++){
                prod*=i;
            }
            sum+=prod;
            n/=10;
        }
        if (org==sum) System.out.println("Strong");
        else System.out.println("not Strong");
    }
}
