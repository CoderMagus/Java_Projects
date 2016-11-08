import java.util.Scanner;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(two digits): ");
		int guess = input.nextInt();
		
		// get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		// get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.print("The lottery number is " + lottery);
		
		// check the guess
		if (guess == lottery)
			System.out.print("\nExact match: You win 10,000!");
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
			System.out.print("\nMatch all digits: You win 3,000!");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.print("\nMatch one digit: You win 1,000!");
		else
			System.out.print("\nSorry no match");
	}
}
