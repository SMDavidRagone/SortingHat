import java.util.Scanner;
public class Game1 {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int guesses = 3;
		int sn = (int)(Math.random() * 100) + 1; //secret number between 0 and 100
		System.out.println(sn);
		
		
		System.out.println("This is a number guess game. "
				+ "\nPlease enter a number between 0 and 100."
				+ "\nYou have " + guesses + " guesses.");
		int guess1 = input.nextInt();
		
		//let sn = (int)(Math.random() *100) + 1;
		
		if (guess1 == sn) {
			System.out.println("you win");
		}else{
			System.out.println("guess again");
			int guess2 = input.nextInt();
			if (guess2 == sn) {
				System.out.println("You win");
			}else{
				System.out.println("guess again");
				int guess3 = input.nextInt();
				if (guess3 == sn) {
					System.out.println("You win");
				}else{
					System.out.println("You lose");
				}
				}
			}
			
		}
		//static= you can only have one copy of something
		
	}
