import java.util.Scanner;
public class ccc2 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the make and model of the car");
		
		String car1 = input.nextLine();
		
		System.out.println("Enter the tank capacity, miles per gallon, and price per gallon"
							+ " \nand I will give you the cost of driving a car");
		
		double tank = input.nextDouble();
		double mpg = input.nextDouble();
		double ppg = input.nextDouble();
		
		
		System.out.printf("The cost of driving a " + car1 + " is $%.2f\n", tank * mpg * ppg);
		System.out.printf("A " + car1 +" can drive %.2f Miles on a full tank of gas\n", tank * mpg);
		
		
	}

}
