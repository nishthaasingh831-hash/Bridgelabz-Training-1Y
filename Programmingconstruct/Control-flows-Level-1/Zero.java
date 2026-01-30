import java.util.Scanner;
class Zero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("No. is positive");
		}
		else if(a==0)
		{
			System.out.println("No. is zero");
		}
		else if(a<0)
		{
			System.out.println("No. is negative");
		}
	}
}	