import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n:-");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Natural Number");
		}
		else
		{
			System.out.println("Not a Natural Number");
		}
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " is Even");
			}
			else
			{
				System.out.println(i+ " is odd");
			}
		}
	}
}	