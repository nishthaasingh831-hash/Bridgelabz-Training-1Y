import java.util.Scanner;
class Fizzbuzz
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=20;
		if(number<0)
		{
			system.out.println("Invalid");
			return;
		}
		String result[]=new int[number];
		for(i=0;i<number;i++)
		{
			if(i%3==0&i%5==0);
			{
			   result[i+1]="Fizzbuzz";
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
				result[i+1]="buzz";
			}
			else
			{
				result[i]=String.valueof(i);
			}
			for(int i=0;i<result.length;i++)
			{
				System.out.println("Position"+(i+1) + "=" +result[i]);
			}
		}
	}
}
				
			
			