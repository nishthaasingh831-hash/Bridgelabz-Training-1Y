import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("No. is natural");
		}
		else 
		{
			System.out.println("No. is not natural");
		}
		System.out.println("enter n");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("Sum of n natural numbers="+sum);
	}
}	
		