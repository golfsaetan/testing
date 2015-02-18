import javax.swing.JOptionPane;
public class Adder{
	public static void main( String args[] ){
		String firstNumber,secondNumber,result ;
		int number1,number2,ans;
		
		firstNumber = JOptionPane.showInputDialog("Enter first integer:");
		secondNumber = JOptionPane.showInputDialog("Enter second integer:" );
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		ans = number1 + number2;
		result = number1 + "+" + number2 + "=" + ans;
		
		JOptionPane.showMessageDialog(null, result, "Results",JOptionPane.INFORMATION_MESSAGE );
	}
}
