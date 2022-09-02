import javax.swing.JOptionPane;

public class addition_gui {
	public static void main(String[] args) {
		
		String firstNumber = JOptionPane.showInputDialog("Enter first nmber: ");
		String secondNumber = JOptionPane.showInputDialog("Enter second number: ");
		
		int num1 = Integer.parseInt(firstNumber);
		int num2 = Integer.parseInt(secondNumber);
		
		int sum = num1+num2;
		JOptionPane.showMessageDialog(null,"The sum of these numbers is: "+sum, "Answer", JOptionPane.PLAIN_MESSAGE);
		
	}
}
