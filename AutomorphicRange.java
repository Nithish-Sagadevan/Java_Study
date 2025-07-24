import java.util.Scanner;
class AutomorphicRange 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("enter starting range: ");
        int start=sc.nextInt();
        System.out.print("enter ending range: ");
        int end=sc.nextInt();
        range(start,end);
    }
    public static boolean isAutomorphic(int n, int sq)
    {
		if (n==0) return true;
        if ((n%10) != (sq%10)) return false;
        return isAutomorphic(n/10,sq/10);
    }
    public static void range(int start,int end)
    {
        if (start>end) return;
        if (isAutomorphic(start,start*start))
        System.out.println(start);
        range(start+1,end);
    }
}
