import java.util.Scanner;

public class computeChange {
	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//receive amount
		System.out.print("Enter an amount in double like, 11.52: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//find number of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//find number of quarters from remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//find number of dimes from remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//find number of nickels from remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//find number of pennies from remaining amount
		int numberOfPennies = remainingAmount;
		
		//display results
		System.out.println("Your amount " + amount + " consists of:\n" +
								"\t" + numberOfDollars + " Dollar/'s\n" +
								"\t" + numberOfQuarters + " Quarter/'s\n" +
								"\t" + numberOfDimes + " Dime/'s\n" +
								"\t" + numberOfNickels + " Nickel/'s\n" +
								"\t" + numberOfPennies + " Pennie/'s\n");
		
	}
}
