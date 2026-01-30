import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int rem=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
	}
}	