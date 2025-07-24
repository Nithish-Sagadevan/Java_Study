import java.util.Scanner;
class AutomorphicRec
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        System.out.println(isAutomorphic(n,n*n));
    }
    public static boolean isAutomorphic(int n, int sq)
    {
		if (n==0) return true;
        if ((n%10) != (sq%10)) return false;
        return isAutomorphic(n/10,sq/10);
    }
}
