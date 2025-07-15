import java.util.Scanner;
class BintoDec 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a bin value: ");
		int bin=sc.nextInt();
	    int dec=0;
		int prod=1;
		
		while (bin>0)
		{
			int bit=bin%10;
			dec=(bit*prod)+dec;
			bin=bin/10;
			prod=prod*2;
		}
	    System.out.print(dec);
	}
}
