package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String numberString = JOptionPane.showInputDialog("Please enter a number");
String number1String=JOptionPane.showInputDialog("Please enter another number");
int number = Integer.parseInt(numberString);
int number1 = Integer.parseInt(number1String);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Select an operation", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract","Multiply", "Divide",  },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation == 0) {
	add(number,number1);
}
if (operation == 1) {
	subtract(number,number1);
}
if (operation == 2) {
	multiply(number,number1);
}
if (operation == 3) {
	divide(number,number1);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1, int num2) {
	JOptionPane.showMessageDialog(null,num1+" + "+num2+" = "+(num1+num2));
}
static void multiply(double num1, double num2) {
	JOptionPane.showMessageDialog(null,num1+"*"+num2+" = "+(num1*num2));
}
static void divide(double num1, double num2) {
	JOptionPane.showMessageDialog(null,num1+"/"+num2+" = "+(num1/num2));
}
static void subtract(int num1, int num2) {
	JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+(num1-num2));
}
	// 4. Create similar methods for subtraction, multiplication and division.
}