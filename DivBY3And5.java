import java.util.Scanner;

public class DivBY3And5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 100 :");
		int n = sc.nextInt();
		
		if(n%3==0)
		{
			if(n%5==0)
				System.out.println("FizzzBuzzz");
			else
				System.out.println("Fizz");
		}
		
		else if(n%5==0)
			System.out.println("Buzz");
		else 
			System.out.println(n);
		
		sc.close();
	}
}