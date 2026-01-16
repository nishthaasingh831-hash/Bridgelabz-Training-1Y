import java.util.Scanner;
class Perimeter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:-");
		int length=sc.nextInt();
		System.out.println("Enter Width:-");
		int Width=sc.nextInt();
		int perimeter=2*(length+Width);
		System.out.println("Find Perimeter:-"+perimeter);
	}
}	