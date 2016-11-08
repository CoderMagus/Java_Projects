import java.util.Scanner;
import javax.swing.JOptionPane;

public class mathQuiz {
	public static void main(String[] args) {
		
		String fname, inputString;
		int numberOfQuestions;
		int selection;
		int correctCount = 0;
		int answer;
		int number1 = 0;
		int number2 = 0;
		
	    fname = JOptionPane.showInputDialog("Enter your first name: ");
		
		inputString = JOptionPane.showInputDialog("\nHello " + fname 
										+ "\n\tHow many questions would you like:");
		numberOfQuestions = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("\nMake your selection for the Math problems"
										+ "\n\tFor Addition, press (1)"
										+ "\n\tFor Subtraction, press (2)"
										+ "\n\tFor Multiplication, press (3)"
										+ "\n\tFor Division, press (4)");
		selection = Integer.parseInt(inputString);
		
		if (selection == 1) 
			selection = additionProblems(numberOfQuestions, number1, number2);
		/*else if (selection == 2)
			selection = subtractionProblems(number1, number2);
		else if (selection == 3)
			selection = multiplicationProblems(number1, number2);
		else if (selection == 4)
			selection = divisionProblems(number1, number2);*/
		else
			JOptionPane.showMessageDialog(null, "That is not a valid selection!",
								"ERROR!", JOptionPane.ERROR_MESSAGE);
		
		answer = selection;
		
		// Grade the answer and display the result
		if (number1 + number2 == answer) { 
			System.out.println("Your answer is CORRECT!");
			correctCount++;
		}
		else
			System.out.println("Your answer is WRONG\n" + number1 + " + " + number2 
							+ " should be " + (number1 + number2));
	}

	
	public static int additionProblems(int numberOfQuestions, int number1, int number2) {
		int count = 1;
		int answer = 0;
		String inputString;
		
		while (count <= numberOfQuestions) {
			// Generate two random single-digit integers
			number1 = (int)(Math.random() * 150);
			number2 = (int)(Math.random() * 150);
			
			// If number1 < number2, swap number1 with number2
			if (number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			// Prompt the student to answer "What is number1 + number2?"
			inputString = JOptionPane.showInputDialog(null, "What is " + number1 + " + " + number2 + " ? ");
			answer = Integer.parseInt(inputString);
						
			// Increase count
			count++;
		}
		
		return answer;
	}
		
		/*final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		//Scanner input = new Scanner(System.in);
		
		
		while (count <= NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 15);
			int number2 = (int)(Math.random() * 15);
		
			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
		
			// 3. Prompt the student to answer "What is number1 – number2?"
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
		
			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) { 
				System.out.println("Your answer is CORRECT!");
				correctCount++;
			}
			else
				System.out.println("Your answer is WRONG\n" + number1 + " - " + number2 + 
								" should be " + (number1 - number2));
			
			// Increase count
			count++;
			
			// Prepare output
			output += "\n" + number1 + " - " + number2 + " = " + answer 
						+ ((number1 - number2 == answer) ? " CORRECT" : " WRONG");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Total CORRECT is " + correctCount + "\nTest time is "
						   + testTime / 1000 + " seconds\n" + output);*/
}
