import java.util.Scanner;
class Interest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal:-");
		int principal=sc.nextInt();
		System.out.println("Enter rate:-");
		int rate=sc.nextInt();
		System.out.println("Enter time:-");
		int time=sc.nextInt();
		int interest=(principal*rate*time)/100;
		System.out.println("Find the Simple Interest:-"+interest);
	}
}	