import java.util.Scanner;

public class degreeConvert {
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius1 = (5.0/9) * fahrenheit - 32;
		System.out.println("Fahrenheit " + fahrenheit + " is " + 
								celsius1 + " in Celsius!");
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit1 = (9.0/5) * celsius + 32;
		System.out.println("Celsius " + celsius + " is " + 
				fahrenheit1 + " in Fahrenheit!");
	}
}
