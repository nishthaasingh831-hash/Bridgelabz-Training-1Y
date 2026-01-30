import java.util.Scanner;
class Assignmentop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println(a);
		a+=5;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		a*=5;
		System.out.println(a);
		a/=5;
		System.out.println(a);
	}
}	