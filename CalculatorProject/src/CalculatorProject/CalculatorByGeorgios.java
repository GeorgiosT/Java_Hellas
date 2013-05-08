package CalculatorProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorByGeorgios extends JFrame {
	int equals = 0;
	double number = 0.0;
	double secondNum, firstNum, total = 0.0;
	String op = "";
	//declares the instance variables to be used in the calculator

	private JButton jButtonZero;
	private JButton jButtonOne;
	private JButton jButtonTwo;
	private JButton jButtonThree;
	private JButton jButtonFour;
	private JButton jButtonFive;
	private JButton jButtonSix;
	private JButton jButtonSeven;
	private JButton jButtonEight;
	private JButton jButtonNine;
	// declares the numbers buttons

	private JButton jButtonMinus;
	private JButton jButtonMultiply;
	private JButton jButtonAdd;
	private JButton jButtonDivide;
	// declares the calculations buttons

	private JButton jButtonC;
	private JButton jButtonEquals;
	// declares the special functions buttons

	private JTextField jTextField;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	// declares the rest of the components

	public CalculatorByGeorgios() {// constructor

		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		// creates the Panels
		
		jTextField = new JTextField(8);// creates and initializes the textfield
		jTextField.setText("0");
		Font font = new Font("Tahoma", Font.BOLD, 20);
		jTextField.setFont(font);
		jTextField.setHorizontalAlignment(JTextField.RIGHT);
		// sets the TextField's properties

		jPanel1.add(jTextField);
		// adds the TextField to jPanel1

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.MAGENTA);
		// Creates a container 

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(290, 315);
		int w = getSize().width;
		int h = getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;
		setLocation(x, y);// place the frame in the center of the screen
		setTitle("Calculator by Georgios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.setResizable(false);
		// sets the frame's properties

		

		jButtonZero = new JButton("0");
		jButtonOne = new JButton("1");
		jButtonTwo = new JButton("2");
		jButtonThree = new JButton("3");
		jButtonFour = new JButton("4");
		jButtonFive = new JButton("5");
		jButtonSix = new JButton("6");
		jButtonSeven = new JButton("7");
		jButtonEight = new JButton("8");
		jButtonNine = new JButton("9");
		// numbers buttons creation

		jButtonMinus = new JButton("-");
		jButtonDivide = new JButton("/");
		jButtonMultiply = new JButton("*");
		jButtonAdd = new JButton("+");
		// calculations buttons creation

		jButtonC = new JButton("C");
		jButtonEquals = new JButton("=");
		// function buttons creation

		ListenForButton lForButton = new ListenForButton();// Listen for button
															// instance

		jButtonC.addActionListener(lForButton);
		jPanel2.add(jButtonC);

		jButtonZero.addActionListener(lForButton);
		jPanel2.add(jButtonZero);

		jButtonOne.addActionListener(lForButton);
		jPanel2.add(jButtonOne);

		jButtonTwo.addActionListener(lForButton);
		jPanel2.add(jButtonTwo);

		jButtonThree.addActionListener(lForButton);
		jPanel2.add(jButtonThree);

		jButtonFour.addActionListener(lForButton);
		jPanel2.add(jButtonFour);

		jButtonFive.addActionListener(lForButton);
		jPanel2.add(jButtonFive);

		jButtonSix.addActionListener(lForButton);
		jPanel2.add(jButtonSix);

		jButtonSeven.addActionListener(lForButton);
		jPanel2.add(jButtonSeven);

		jButtonEight.addActionListener(lForButton);
		jPanel2.add(jButtonEight);

		jButtonNine.addActionListener(lForButton);
		jPanel2.add(jButtonNine);

		jButtonEquals.addActionListener(lForButton);
		jPanel2.add(jButtonEquals);
		// Assigns Action Listener and adds the buttons to JPanel2

		jPanel2.setLayout(new GridLayout(4, 3));
		// jPanel2 property

		jButtonMinus.addActionListener(lForButton);
		jPanel3.add(jButtonMinus);

		jButtonMultiply.addActionListener(lForButton);
		jPanel3.add(jButtonMultiply);

		jButtonDivide.addActionListener(lForButton);
		jPanel3.add(jButtonDivide);

		jButtonAdd.addActionListener(lForButton);
		jPanel3.add(jButtonAdd);
		// Assign ActionListener and adds the button to JPanel3

		c.add(jPanel1);
		c.add(jPanel2);
		c.add(jPanel3);
		
	}

	public static void main(String args[]) {

		new CalculatorByGeorgios();
		// creates the class's instance which will display the calculator
	}

	// ActionListener implementation
	private class ListenForButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String s = jTextField.getText().trim();
			// creates a string that holds the TextField's input and trims it

			if (e.getSource() == jButtonC) {
				jTextField.setText("");// clear the TextField
				firstNum=0;
				secondNum=0;
			} else if (e.getSource() == jButtonOne) {
				jTextField.setText( "1");

			} else if (e.getSource() == jButtonTwo) {
				jTextField.setText(s + "2");

			} else if (e.getSource() == jButtonThree) {
				jTextField.setText(s + "3");

			} else if (e.getSource() == jButtonFour) {
				jTextField.setText(s + "4");

			} else if (e.getSource() == jButtonFive) {
				jTextField.setText(s + "5");

			} else if (e.getSource() == jButtonSix) {
				jTextField.setText(s + "6");

			} else if (e.getSource() == jButtonSeven) {
				jTextField.setText(s + "7");

			} else if (e.getSource() == jButtonEight) {
				jTextField.setText(s+ "8");

			} else if (e.getSource() == jButtonNine) {
				jTextField.setText(s + "9");

			} else if (e.getSource() == jButtonZero) {
				jTextField.setText(s + "0");

			}

			else if (e.getSource() == jButtonAdd) {
				firstNum = Double.parseDouble(jTextField.getText());
				jTextField.setText("");// clears the TextField after the first
				op = "+";						// input
			} else if (e.getSource() == jButtonMinus) {
				firstNum = Double.parseDouble(jTextField.getText());
				jTextField.setText("");
				op = "-";
			} else if (e.getSource() == jButtonMultiply) {
				firstNum = Double.parseDouble(jTextField.getText());
				jTextField.setText("");
				op = "*";
			} else if (e.getSource() == jButtonDivide) {
				firstNum = Double.parseDouble(jTextField.getText());
				jTextField.setText("");
				op = "/";
			} else if (e.getSource() == jButtonEquals) {// equals
				secondNum = Double.parseDouble(jTextField.getText());
				if (op.equals("+")) {// addition
					total = firstNum + secondNum;
					jTextField.setText("" + total);
					firstNum=0;
					secondNum=0;
				} else if (op.equals("*")) {// multiplication
					total = firstNum * secondNum;
					jTextField.setText("" + total);
					firstNum=0;
					secondNum=0;
				} else if (op.equals("/")) {// division
					total = firstNum / secondNum;
					jTextField.setText("" + total);
					firstNum=0;
					secondNum=0;
				} else if (op.equals("-")) {// subtraction
					total = firstNum - secondNum;
					jTextField.setText("" + total);
					firstNum=0;
					secondNum=0;
				}

				
				

			}
		}
	}
}
