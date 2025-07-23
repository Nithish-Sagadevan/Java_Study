import java.util.Scanner;
class isPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n=sc.nextInt();
		System.out.println("Given num is "+prime(n,n/2));
	}
	public static boolean prime(int n, int i)
	{
		if (i==1) return true;
		if (n<=1 || n%i==0) return false;
		return prime(n,i-1);
	}
}
