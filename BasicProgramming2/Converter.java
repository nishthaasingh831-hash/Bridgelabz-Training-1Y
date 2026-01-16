import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in kilometers:-");
		double km=sc.nextDouble();
		double Miles=km*1.6;
		System.out.println("Convert Kilometers in to Miles:-"+Miles);
	}
}	