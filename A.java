class A 
{
	public static void main(String[] args) 
	{
		int i=1; // Local variable: inside the method.
		System.out.println(i);
		m1();
		System.out.println(i);
	}
	public static void m1() 
	{
		int i=2; // Local variable
		System.out.println(i);
	}
}