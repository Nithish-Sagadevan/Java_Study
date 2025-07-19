import java.util.Scanner;
class DectoBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a dec value: ");
        int dec=sc.nextInt();
        int bin=0;
        int p=1;
        while (dec>0){
            int bit=dec%2;
            bin=bit*p+bin;
            dec/=2;
            p*=10;
        }
        System.out.println(bin);
    }
}
