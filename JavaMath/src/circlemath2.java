import java.util.Scanner;
public class circlemath2 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the a radius and I will give you: \n\t*\tcircumference; and \n\t*\tsurface area");
		
		double radius = input.nextInt();
		double pi = Math.PI;
		
		System.out.printf("%.2f = circumference\n", radius * pi * 2);
		System.out.printf("%.2f = surface area\n", radius * radius * pi);
		
	}

}