import java.util.Scanner;
public class circlemath {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the a radius and I will give you: \n\t*\tcircumference; and \n\t*\tsurface area");
		
		//String response1 = input.nextLine();
		String rString;
		
			boolean done = false;
			while(done == false) {
		try { 
		
			rString = input.nextLine();
			int radius= Integer.parseInt(rString);
			done = true;
			double pi = Math.PI;
		
			System.out.printf("%.2f = circumference\n", radius * pi * 2);
			System.out.printf("%.2f = surface area\n", radius * radius * pi);
		
		} catch (Exception e) { System.out.println("Sorry I need a number");
		
			System.out.println("Enter the a radius and I will give you: \n\t*\tcircumference; and \n\t*\tsurface area");
			
				rString = input.nextLine();
				int radius= Integer.parseInt(rString);
				done = true;
				double pi = Math.PI;
		
				System.out.printf("%.2f = circumference\n", radius * pi * 2);
				System.out.printf("%.2f = surface area\n", radius * radius * pi);
		}
		
		}
	}
}