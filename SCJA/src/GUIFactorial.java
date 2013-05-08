import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Dimension;

public class GUIFactorial extends JFrame {// We have to create a JFrame first 
	JTextField numberField;
	JTextField answerField;
	JButton calculate;

	public GUIFactorial() {
		super("Factorial Calculator");// standard statements
		setLayout(new FlowLayout());// ......
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// .....

		setSize(440, 80);// standard statement

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();

		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);

		this.setLocation(xPos, yPos);

		setVisible(true);// standard statement
		setResizable(false);
		
		numberField = new JTextField(6);
		numberField.setFocusable(true);
		add(numberField);

		// ----------------------------------------------------------------------
		calculate = new JButton("Calculate");

		TheHandler handler = new TheHandler();// ActionListener method object
		calculate.addActionListener(handler);// assigns the ActionListener
												// method to 'calculate'
		add(calculate);
		// ----------------------------------------------------------------------

		answerField = new JTextField(20);
		add(answerField);

	}

	public static void main(String[] args) {
		new GUIFactorial();

	}

	// ActionListener method
	private class TheHandler implements ActionListener { // implements
		public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(numberField.getText());
			long answer = fact(num);
			answerField.setText("" + answer);
		}

		public long fact(int n) {// calculates factorial
			if (n > 1)
				return n * fact(n - 1);
			else
				return 1L;

		}
	}

}
