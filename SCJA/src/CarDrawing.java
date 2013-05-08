import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;



@SuppressWarnings("serial")
public class CarDrawing extends JFrame {
	public CarDrawing() {
		super("CAR");
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarPane map = new CarPane();
		add(map);
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CarDrawing frame = new CarDrawing();
	}
}

@SuppressWarnings("serial")
class CarPane extends JPanel {
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp;
		comp2D.setColor(Color.white);
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Rectangle2D.Float background = new Rectangle2D.Float(0F, 0F,
				(float) getSize().width, (float) getSize().height);
		comp2D.fill(background);
		
		
		//Draw car
		GradientPaint gp = new GradientPaint(0F, 0F, Color.yellow, 350F, 350F,
				Color.orange, true);
		comp2D.setPaint(gp);
		GeneralPath fl = new GeneralPath();
		fl.moveTo(10F, 200F);
		fl.lineTo(200F, 200F);
		fl.lineTo(200F, 180F);
		fl.lineTo(170F, 160F);
		fl.lineTo(100F, 160F);
		fl.lineTo(10F, 180F);
		fl.closePath();
		comp2D.fill(fl);
		
		// Draw ovals
		comp2D.setColor(Color.black);
		BasicStroke pen2 = new BasicStroke();
		comp2D.setStroke(pen2);
		Ellipse2D.Float e1 = new Ellipse2D.Float(160, 185, 30, 30);
		Ellipse2D.Float e2 = new Ellipse2D.Float(40,185,30,30);
		comp2D.fill(e1);
		comp2D.fill(e2);
		

	}

}
