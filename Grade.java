import java.util.Scanner;

public class Grade 
{
	public static void main(String[] args) 
	{
		float p; //float p to accept course points;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the points for the course :");
		p = sc.nextFloat();
		
		if(p<0)
			System.out.println("Impossible...!");
		else if(p>=0 && p<=49)
			System.out.println("Failed");
		else if(p>=50 && p<=59)
			System.out.println("First class");
		else if(p>=60 && p<=69)
			System.out.println("second class");
		else if(p>=70 && p<=79)
			System.out.println("Third class");
		else if(p>=80 && p<=89)
			System.out.println("Fourth class");
		else if(p>=90 && p<=100)
			System.out.println("Fifth class");
		else if(p>100)
			System.out.println("Incredible...!");

		sc.close();
	}
}
