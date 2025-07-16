import java.util.Scanner;
class AlternatePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Start: ");
        int start=sc.nextInt();
        System.out.print("End: ");
        int end=sc.nextInt();
        int count=0;
        
        for (int i=start; i<=end; i++){
            if (i<=1) continue;
            int n=i;
            boolean flag=true;
            for (int j=2; j<=n/2; j++){
                if (n%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag && (++count%2)==0){
                System.out.println(n);
            }
        }
    }
}
