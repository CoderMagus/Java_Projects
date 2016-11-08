import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int values;
		int numbers = 0;
		int positive = 0;
		int negative = 0;
		int sum = 0;
		float average = 0;
		
		do {
			System.out.print("Enter an integer value, or quit the program with 0: ");
			values = input.nextInt();
			
			if (values < 0) {
				negative++;
				numbers++;
			}
			else if (values > 0) {
				positive++;
				numbers++;
			}
			
			// Find the sum 
			sum += values;
			
			// Find the average
			average = (float)(sum / numbers);
		
		} while (values != 0);
		
		System.out.println("How many positive numbers " + positive
			      + "\nHow many negative numbers " + negative
			      + "\nThe total is " + sum
			      + "\nThe average is " + average);
	}
}
