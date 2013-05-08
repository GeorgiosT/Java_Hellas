import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import javax.swing.*;



	public class House extends JFrame{
	public House() {
		super("House");
		setSize(750, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HousePane house = new HousePane();
		add(house);
		setVisible(true);
	}
		public static void main(String[] args) {
			House house = new House();

		}

		}
		
 class HousePane extends JPanel{
	 public void paintComponent(Graphics comp){
	 Graphics2D comp2D = (Graphics2D) comp;
		comp2D.setColor(Color.white);
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Rectangle2D.Float background = new Rectangle2D.Float(0F, 0F,
				(float) getSize().width, (float) getSize().height);
		comp2D.fill(background);
	 
	 
	
		comp2D.setColor(Color.yellow);
		GeneralPath base = new GeneralPath();
		base.moveTo(110F, 474F);
		base.lineTo(639F, 475F);
		base.lineTo(639F, 260F);
		base.lineTo(117F,260F);
		base.lineTo(117F, 474F);
		base.closePath();
		comp2D.fill(base);
		
		comp2D.setColor(Color.red);
		GeneralPath  roof = new GeneralPath();
		roof.moveTo(82F, 260F);
		roof.lineTo(670F, 260F);
		roof.lineTo(370F, 130F);
		roof.lineTo(82F, 260F);
		roof.closePath();
		comp2D.fill(roof);
		
		comp2D.setColor(Color.red);
		GeneralPath  door = new GeneralPath();
		door.moveTo(330F, 475F);
		door.lineTo(330F, 403F);
		door.lineTo(398F, 403F);
		door.lineTo(398F, 475F);
		door.closePath();
		comp2D.fill(door);
		
		comp2D.setColor(Color.cyan);
		GeneralPath  window1 = new GeneralPath();
		window1.moveTo(169F, 431F);
		window1.lineTo(246F, 431F);
		window1.lineTo(246F, 381F);
		window1.lineTo(169F, 381F);
		window1.closePath();
		comp2D.fill(window1);
		
		comp2D.setColor(Color.cyan);
		GeneralPath  window2 = new GeneralPath();
		window2.moveTo(479F, 431F);
		window2.lineTo(556F, 431F);
		window2.lineTo(556F, 381F);
		window2.lineTo(479, 381F);
		window2.closePath();
		comp2D.fill(window2);
		
		
		
		
		
		
		
	   
	   
	   	
	      
	 }
	  
	   
 }
	      
	    
	             
	          
	       
	
	
