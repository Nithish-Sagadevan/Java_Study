import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        
        boolean flag=true;
        for(int i=2; i<=n/2; i++){
            if (n%i==0){
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("Given number is a Prime Number");
        else System.out.println("Given number is not a Prime Number");
    }
}
