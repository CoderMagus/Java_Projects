import java.util.Scanner;

public class Decimal2HexConversion {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Get input for decimal integer
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		// Output
		System.out.println("The hex number for decimal " + decimal
						   + " is " + decimalToHex(decimal));
	}
	
	/* Convert a decimal to hex as a string */
	public static String decimalToHex(int decimal) {
		String hex = "";
		
		while (decimal != 0) {
			int hexValue = decimal % 16;
			hex = toHexChar(hexValue) + hex;
			decimal = decimal / 16;
		}
		
		return hex;
	}
	
	/* Convert an integer to a single hex digit in a character */
	public static char toHexChar(int hexValue) {
		if (hexValue <= 9 && hexValue >= 0)
			return (char)(hexValue + '0');
		else  //hexValue <= 15 && hexValue >= 10
			return (char)(hexValue - 10 + 'A');
	}
}
