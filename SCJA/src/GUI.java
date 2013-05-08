import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {

	private JLabel item1;
	private JTextField item2;
	private JButton button1;
	private JButton button2;

	//constructor
	public GUI() {
		super("This is the title bar...");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		item1 = new JLabel("The quick brown fox jumped over the lazy dogs");
		item1.setToolTipText("Every letter used");
		add(item1);

		item2 = new JTextField(20);
		item2.setText("0");
		add(item2);

		// object instance of the event handling class
		TheHandler handler = new TheHandler();// create a handler object based on TheHandler class

		
		// TheHandler class performs all options
		button1 = new JButton("Count");
		button1.addActionListener(handler);
		add(button1);

		//create Anon inner class,which performs all actions
		button2 = new JButton("Count Down");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(item2.getText());
				num--;
				item2.setText("" + num);
			}
		});

		add(button2);
	
		setSize(400, 400);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new GUI();

	}

	// event handling class
	private class TheHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int num = Integer.parseInt(item2.getText());
			num++;
			item2.setText("" + num);

		}
	}

}
