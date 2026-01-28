import java.util.Scanner;
class Integer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		if(n>=6&&n<=9)
		{
			for(int i=1;i<=10;i++)
			{
				int result=n*i;
				System.out.println(n+ "*" +i+ "=" +result);
			}
		}
			
			else
		{
			System.out.println("Not inside the loop");
		}
	}
}