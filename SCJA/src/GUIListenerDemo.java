import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIListenerDemo extends JFrame {

	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	JPanel panel1;
	int buttonClicked;

	public GUIListenerDemo() {

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();

		button1 = new JButton("Click me");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		panel1.add(button1);

		textField1 = new JTextField(15);

		ListenForKeys lForKeys = new ListenForKeys();
		textField1.addKeyListener(lForKeys);
		panel1.add(textField1);

		textArea1 = new JTextArea(6, 20);

		JScrollPane scrollbar1 = new JScrollPane(textArea1,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel1.add(scrollbar1);

		ListenForWindow lForWindow = new ListenForWindow();
		addWindowListener(lForWindow);

		ListenForMouse lForMouse = new ListenForMouse();
		addMouseListener(lForMouse);

		add(panel1);// adds the panel with all the components to the frame

		setSize(600, 150);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {

		new GUIListenerDemo();

	}

	private class ListenForWindow implements WindowListener {

		public void windowOpened(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window Activated",
					"The Title ", JOptionPane.PLAIN_MESSAGE);
		}

		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window Closing", "The Title ",
					JOptionPane.PLAIN_MESSAGE);
		}

		public void windowClosed(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window Closed", "The Title ",
					JOptionPane.PLAIN_MESSAGE);
		}

		public void windowIconified(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window Iconified",
					"The Title ", JOptionPane.PLAIN_MESSAGE);
		}

		public void windowDeiconified(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window Restored",
					"The Title ", JOptionPane.PLAIN_MESSAGE);
		}

		public void windowActivated(WindowEvent e) {
			// JOptionPane.showMessageDialog(null, "Window Activated",
			// "The Title ", JOptionPane.PLAIN_MESSAGE);
		}

		public void windowDeactivated(WindowEvent e) {
			// JOptionPane.showMessageDialog(null, "Window Deactivated",
			// "The Title ", JOptionPane.PLAIN_MESSAGE);

		}
	}

	private class ListenForButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				buttonClicked++;
				textArea1.append("Button clicked " + buttonClicked + " times\n");

			}// End of If loop

		}// End of actionPerformed class

	}// End of private inner class

	private class ListenForKeys implements KeyListener {

		public void keyTyped(KeyEvent e) {
			textArea1.append("Key Pressed: " + e.getKeyChar() + "\n");
		}

		public void keyPressed(KeyEvent e) {
		}

		public void keyReleased(KeyEvent e) {
		}

	}// End of private inner class

	private class ListenForMouse implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse pos " + e.getX() + "," + e.getY());
		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {

		}

		public void mouseExited(MouseEvent e) {

		}
	}
}// End of Main Class
