import java.util.Scanner;
class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dec value: ");
        int dec=sc.nextInt();
        System.out.println(isBinary(dec,1,0));
    }
    public static int isBinary(int dec, int place, int bin)
    {
        if (dec==0) return bin;
        bin+=(dec%2)*place;
        dec/=2;
        place*=10;
        return isBinary(dec,place,bin);
    }
}
