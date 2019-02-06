import java.util.Scanner;
public class math1 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//y=24.95(x)(.6)+3+.75(x-1)
		
		double book_price = 14.97;
		int shipping_init = 3;
		double shipping_price = .75;
		System.out.println("Enter the number of books");
		int books = input.nextInt();
		
		//double total_cost = book_price * books + shipping_init + shipping_price * (books-1);

		
		System.out.printf("$%.2f" + "\n", book_price * books + shipping_init + shipping_price * (books-1));
		//System.out.printf("$%f.2" + "\n", total_cost);
	}

}
