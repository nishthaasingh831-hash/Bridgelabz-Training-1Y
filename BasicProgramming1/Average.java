import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:-");
		double a=sc.nextInt();
		System.out.println("Enter Second Number:-");
		double b=sc.nextInt();
		System.out.println("Enter third Number:-");
		double c=sc.nextInt();
		double average=(a+b+c)/3;
		System.out.println("Find Average of three numbers:-"+average);
	}
}	