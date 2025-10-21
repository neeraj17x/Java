class Swap2Numbers
{
	public static void main(String ar[])
	{
		int a=15,b=25;
		System.out.println("a="+a+"\tb="+b);
		a=a+b-(b=a);
		System.out.println("a="+a+"\tb="+b);
	}
}