import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



@SuppressWarnings("serial")
public class CGMoveARound extends JFrame {
	public static final int CANVAS_WIDTH = 400;
	public static final int CANVAS_HEIGHT = 140;
	public static final Color LINE_COLOR = Color.WHITE;
	public static final Color CANVAS_BACKGROUND = Color.GREEN;
	
	public static final int OVAL_DIAMETER = 40;
	
	private int x = CANVAS_WIDTH / 2 - 20;
	private int y = CANVAS_HEIGHT / 2 - 20;
	
	private DrawCanvas canvas;
	
	public CGMoveARound(){
		// Set up a panel for the buttons
	      JPanel btnPanel = new JPanel();
	      btnPanel.setLayout(new BorderLayout());
	      JButton btnLeft = new JButton("Move Left ");
	      btnPanel.add(btnLeft,BorderLayout.WEST);
	      btnLeft.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            x -= 10;
	            canvas.repaint();
	            requestFocus(); // change the focus to JFrame to receive KeyEvent
	         }
	      });
	      JButton btnRight = new JButton("Move Right");
	      btnPanel.add(btnRight, BorderLayout.EAST);
	      btnRight.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            x += 10;
	            canvas.repaint();
	            requestFocus(); // change the focus to JFrame to receive KeyEvent
	         }
	      });
	      JButton btnUp = new JButton("  Move Up ");
	      btnPanel.add(btnUp, BorderLayout.NORTH);
	      btnUp.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            y -= 10;
	            canvas.repaint();
	            requestFocus(); // change the focus to JFrame to receive KeyEvent
	         }
	      });
	      
	      JButton btnDown = new JButton("Move Down");
	      btnPanel.add(btnDown, BorderLayout.SOUTH);
	      btnDown.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            y += 10;
	            canvas.repaint();
	            requestFocus(); // change the focus to JFrame to receive KeyEvent
	         }
	      });
	      
	 
	      // Set up a custom drawing JPanel
	      canvas = new DrawCanvas();
	      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	 
	      // Add both panels to this JFrame
	      Container cp = getContentPane();
	      cp.setLayout(new BorderLayout());
	      cp.add(canvas, BorderLayout.CENTER);
	      cp.add(btnPanel, BorderLayout.EAST);
	 
	      // "this" JFrame fires KeyEvent
	      addKeyListener(new KeyAdapter() {
	         @Override
	         public void keyPressed(KeyEvent evt) {
	            switch(evt.getKeyCode()) {
	               case KeyEvent.VK_LEFT:
	               case KeyEvent.VK_A:
	                  x -= 10;
	                  repaint();
	                  break;
	               case KeyEvent.VK_RIGHT:
	               case KeyEvent.VK_D:
	                  x += 10;
	                  repaint();
	                  break;
	               case KeyEvent.VK_DOWN:
	               case KeyEvent.VK_S:
		              y += 10;
		              repaint();
		              break;
	               case KeyEvent.VK_UP:
	               case KeyEvent.VK_W:
		              y -= 10;
		              repaint();
	                  break;
	               
	            }
	         }
	      });
	 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setTitle("Move a Line");
	      pack();  // pack all the components in the JFrame
	      setVisible(true); // show it
	      requestFocus();   // set the focus to JFrame to receive KeyEvent
	   
	}
	
	   class DrawCanvas extends JPanel {
		      @Override
		      public void paintComponent(Graphics g) {
		         super.paintComponent(g);
		         setBackground(CANVAS_BACKGROUND);
		         g.setColor(LINE_COLOR);
		         g.fillOval(x, y, OVAL_DIAMETER, OVAL_DIAMETER); // draw solid circle
		         
		      }
		   }

	public static void main(String[] args) {
		// Run GUI codes on the Event-Dispatcher Thread for thread safety
	      SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new CGMoveARound(); // Let the constructor do the job
	         }
	      });
	}

}
