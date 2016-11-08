import java.util.Scanner;

public class KilogramsToPounds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("WELCOME TO THE KILOGRAM-TO-POUND CONVERTER");
		System.out.print("\n\nKgs.\tLbs.");
		System.out.print("\n---\t---\n");
		
		for (int kilograms = 1; kilograms <= 199; kilograms++) {
			double pounds = kilograms * 2.20;
			
			String s = String.format(kilograms + "\t%.2f", pounds);
			System.out.println(s);
		}
	}
}
