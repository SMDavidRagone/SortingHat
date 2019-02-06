import java.util.Scanner;

public class MC1 {

	public static void main(String[] args){
		
		String thirtyone = "31";
		String thirty = "30";
		String twentyx = ("29 or 29");
		
		
		System.out.println("Choose the number of a month and I will give you the number of days in it");
		
		
		Scanner scanner = new Scanner (System.in);
		int month = scanner.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			System.out.println(thirtyone);
		}
		else if (month == 2)
		{
			System.out.println(twentyx);
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println(thirty);
		}
		else
		{
			System.out.println("Please enter an integer from 1 to 12");
		}
	}
}
