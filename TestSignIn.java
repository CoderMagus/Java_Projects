import javax.swing.JOptionPane;

public class TestSignIn {
	public static void main(String[] args) {
		String inputString;
		String[] fname;
		String[] userName;
		String[] passWord;
		
		inputString = JOptionPane.showInputDialog("Enter your (first) name: ");
		for (String i = 0; )
		
		userName = JOptionPane.showInputDialog("Welcome " + fname
										+ "\nEnter your Username: ");
		passWord = JOptionPane.showInputDialog("Enter your Password: ");
		
		JOptionPane.showMessageDialog(null, fname + "\nUsername is: " + userName
										+ "\nPassword is: " + passWord);
	}
}
