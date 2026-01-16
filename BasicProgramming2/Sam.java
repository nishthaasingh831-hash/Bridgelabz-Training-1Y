import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maths Number:-");
		double a=sc.nextInt();
		System.out.println("Enter Physics Number:-");
		double b=sc.nextInt();
		System.out.println("Enter Chemistry Number:-");
		double c=sc.nextInt();
		double average=(a+b+c)/3;
		System.out.println("Find Average of three numbers:-"+average);
	}
}	