import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age1:-");
		int age1=sc.nextInt();
		System.out.println("Enter age2:-");
		int age2=sc.nextInt();
		System.out.println("Enter age3:-");
		int age3=sc.nextInt();
		System.out.println("Enter height1:-");
		int h1=sc.nextInt();
		System.out.println("Enter height2:-");
		int h2=sc.nextInt();
		System.out.println("Enter height3:-");
		int h3=sc.nextInt();
		int youngest=age1;
		if(age2<youngest)
			youngest=age2;
		if(age3<youngest)
			youngest=age3;
		
		int tallest=h1;
		if(h2>tallest)
			tallest=h2;
		if(h3>tallest)
			tallest=h3;
		
		System.out.println("Youngest age:"+youngest);
		System.out.println("tallest age:"+tallest);
	}
}
		