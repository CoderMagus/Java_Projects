import javax.swing.JOptionPane;

public class payroll {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter employee name: ");
		
		String hoursWeekString = JOptionPane.showInputDialog("Enter how many hours worked in a week: ");
		double hoursWeek = Double.parseDouble(hoursWeekString);
		
		String hourlyPayString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		double hourlyPay = Double.parseDouble(hourlyPayString);
		
		String fedTaxString = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
		double fedTax = Double.parseDouble(fedTaxString);
		
		String stateTaxString = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
		double stateTax = Double.parseDouble(stateTaxString);
		
		double grossPay = hourlyPay * hoursWeek;
		double federalDeduct = fedTax * grossPay;
		double stateDeduct = stateTax * grossPay;
		double totalDeduct = federalDeduct + stateDeduct;
		double netPay = grossPay - totalDeduct;
		
		String output = "Employee name: " + name +
							"\nHours Worked: " + hoursWeek +
							"\nPay Rate: $" + hourlyPay +
							"\nGross Pay: $" + grossPay +
							"\nDeductions: " +
							"\n\tFederal Withholdings: " + federalDeduct +
							"\n\tState Withholdings: " + stateDeduct +
							"\n\tTotal Deductions: " + totalDeduct +
							"\nNet Pay: " + netPay;
		JOptionPane.showMessageDialog(null, output);
	}
}
