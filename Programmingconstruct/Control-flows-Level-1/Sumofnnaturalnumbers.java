import java.util.Scanner;
class Sumofnnaturalnumbers
{
	public static void main(string args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Not a natural number");
			return;
		}
		int sumloop=0;
		for(int i=1;i<=n;i++);
		{
			Sumloop+=i;
		}
		int sumformulae=n*(n+1)/2;
		System.out.println("Sum using loop:-"+sumloop);
		System.out.println("Sum using formulae:-"+sumformulae);
		if(sumloop==sumformulae)
			{
				System.out.println("Results is correct");
			}
		else
		{
			System.out.println("Results is not correct");
		}
	}
}	
				