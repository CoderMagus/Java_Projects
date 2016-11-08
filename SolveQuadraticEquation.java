import javax.swing.JOptionPane;

public class SolveQuadraticEquation {
	public static void main(String[] args) {
		double a, b, c, discriminant, root1, root2;
		String inputString;
		
		// Get a, b, and c from user
		inputString = JOptionPane.showInputDialog("ax^2 + bx + c = 0\nEnter a: ");
		a = Double.parseDouble(inputString);
		inputString = JOptionPane.showInputDialog("ax^2 + bx + c = 0\nEnter b: ");
		b = Double.parseDouble(inputString);
		inputString = JOptionPane.showInputDialog("ax^2 + bx + c = 0\nEnter c: ");
		c = Double.parseDouble(inputString);
		
		// Discriminant formula
		discriminant = ((Math.pow(b, 2)) - (4 * a * c));
		
		// If discriminant is positive, 0, or negative
		if (discriminant > 0) {
			root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
			JOptionPane.showMessageDialog(null, String.format(
								"\nThe discriminant is positive, there is TWO REAL roots:\n%.6f\n%.6f" 
								, root1, root2));
		}
		else if (discriminant == 0) {
			root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			JOptionPane.showMessageDialog(null, String.format(
								"\nThe discriminant is 0, there is ONE REAL root:\n%.6f" 
								, root1));
		}
		else 
			JOptionPane.showMessageDialog(null, "\nThe discriminant is negative, there is NO REAL root.");
	
	}
}
