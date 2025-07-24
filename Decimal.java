import java.util.Scanner;
class Decimal
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter bin value: ");
		int bin=sc.nextInt();
		System.out.println(isDecimal(bin,1,0));
	}
	
	public static int isDecimal (int bin, int prod, int dec)
	{
		if (bin==0) return dec;
		dec+=(bin%10)*prod;
		bin/=10;
		prod*=2;
		return isDecimal (bin,prod,dec);
	}
}
