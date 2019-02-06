import java.util.Scanner;
import java.util.InputMismatchException;
public class ccc3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String make;
		System.out.println("I need some info for calculating \n"
						+ "\tcost per mile \n"
						+ "\tprice of gas per gallon.");
		
		//QExtra make and model
		System.out.println("Enter the make and model of the car");
		make = input.nextLine();
		//Q1 fuel tank capacity
		System.out.println("Enter the fuel tank capacity");
		String stuffComingIn = input.nextLine();
		double tank = Double.parseDouble(stuffComingIn);
		//Q2 miles per gallon
		System.out.println("Enter the miles per gallon");
		double mpg = input.nextDouble();
		//Q3 price per gallon
		System.out.println("Enter the price per gallon");
		double ppg = input.nextDouble();
		
		//calc1
		System.out.printf("A " + make +" can drive %.2f Miles on a full tank of gas\n", tank * mpg);
		//calc2
		System.out.printf("the cost of driving a " + make + " for 100 miles is $%.2f\n", 100 / mpg * ppg);
		//calc3
		System.out.printf("The cost of driving a " + make + " from a full tank of gas until it is empty is $%.2f\n", tank * mpg * ppg);
		
		// ******Old Stuff
		boolean done = false;
		while(!done)
		{
			try {
		
		
		
		//double howFarOnTannk = mpg * tank;
		
		done = true;
		
		
			} catch (Exception e) {
			System.out.println("I'm sorry I needed a number, try again or type quit");
			System.out.println("Here is the problem..." + e.toString());
			}
		}
		
		}
 // end of main
		
		//This Method gets a double, does error checking and
		// returns either the value or a negative if there's an error
	public static double getDouble( String question, Scanner cScanner )
	{
			double theNumber = -1.0;
			boolean done = false;
			System.out.println( question );
			while(!done)
			{
				try {
			
			String stuffComingIn = cScanner.nextLine();
			theNumber = Double.parseDouble(stuffComingIn);
			
			if(theNumber <= 0.0) {
				System.out.println("Please enter a positive number");
			} else {
				done = true; // this gets us out of the loop
			}
			
				} catch (Exception e) {
				System.out.println("I'm sorry I needed a number, try again or type quit");
				System.out.println("Here is the problem..." + e.toString());
				}
			}
				return theNumber;
		}
	} //end of class		
		
		
	