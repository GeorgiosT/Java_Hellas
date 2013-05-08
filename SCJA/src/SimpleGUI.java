import javax.swing.JOptionPane;

public class SimpleGUI {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter First Number:");
		String sn = JOptionPane.showInputDialog("Enter Scond number: ");

		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The answer is: " + sum,
				"The Title ", JOptionPane.PLAIN_MESSAGE);
	}

}
