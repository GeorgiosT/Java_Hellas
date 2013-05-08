import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ShowPicture extends JFrame{
	ImageIcon icon;
	JLabel label;
	JLayeredPane layeredPane;
	
	public ShowPicture(){
		icon = new ImageIcon("AEK.jpg");
		label = new JLabel(icon);
		label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		
		layeredPane = new JLayeredPane();
		layeredPane.setPreferredSize(new Dimension(300, 310));
		
		layeredPane.add(label, new Integer(0));
		
		JButton button = new JButton("Change");
		button.setSize(100, 30);
		layeredPane.add(button, new Integer(1));
		
		ListenForButton lForButton = new ListenForButton();
		button.addActionListener(lForButton);
	
		add(layeredPane);
		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ShowPicture();
	}
	
	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			icon = new ImageIcon("obama.jpg");
			label.setIcon(icon);
		}
	}
}
