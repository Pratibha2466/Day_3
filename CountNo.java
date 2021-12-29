import java.util.Scanner;

public class CountNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true)
		{
			System.out.println("Enter the number :");
			int n = sc.nextInt();
			
			if(n==0)
				break;
			else
				cnt = cnt+1;
		}
		
		System.out.println("User Entered '" +cnt+ "' Number.");
		
		sc.close();
	}
}