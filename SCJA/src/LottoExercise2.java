import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;

import javax.swing.*;

public class LottoExercise2 extends JFrame {

	private JPanel numPanel;
	private JPanel luckyNumPanel;
	private JTextField[] tfNums;
	private JButton generate;
	private JTextField[] luckyStars;

	public LottoExercise2() {
		super("Euromillions");
		numPanel = new JPanel();
		luckyNumPanel = new JPanel();
		
		
		luckyStars = new JTextField[2];
		for (int i = 0; i < 2; i++) {
			luckyStars[i] = new JTextField();
			luckyStars[i].setBackground(Color.ORANGE);
		}

		tfNums = new JTextField[5];
		for (int i = 0; i < 5; i++) {
			tfNums[i] = new JTextField();
		}

		numPanel.setLayout(new GridLayout(1, 6));
		luckyNumPanel.setLayout(new GridLayout(1, 2));
		
		

		for (int i = 0; i < 2; i++) {
			luckyNumPanel.add(luckyStars[i]);
		}

		for (int i = 0; i < 5; i++) {
			numPanel.add(tfNums[i]);
		}

		setLayout(new BorderLayout());
		add(numPanel, BorderLayout.CENTER);
		add(luckyNumPanel, BorderLayout.SOUTH);

		generate = new JButton("Generate");
		ListenForButton lForButton = new ListenForButton();
		generate.addActionListener(lForButton);
		add(generate, BorderLayout.EAST);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 100);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new LottoExercise2();

	}

	private class ListenForButton implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			int[] numbers = new int[5];

			Random genNum = new Random();
			for (int i = 0; i < numbers.length; i++) {
				int num = genNum.nextInt(45) + 1;
				numbers[i] = num;
				for (int j = i - 1; j >= 0; j--) {
					if (num == numbers[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(numbers);
			for (int i = 0; i < 5; i++) {
				tfNums[i].setText("" + numbers[i]);
			}

			int[] luckyStarNumbers = new int[2];
			
			
			Random random1 = new Random();
			for (int i = 0; i < luckyStars.length; i++) {
				int num1 = random1.nextInt(11)+1;
				luckyStarNumbers[i] = num1;
				for (int j = i - 1; j >= 0; j--) {
					if (num1 == luckyStarNumbers[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(luckyStarNumbers);
			
			for (int i = 0; i < 2; i++) {
				
				luckyStars[i].setText("" + luckyStarNumbers[i]);

			}

		}
	}

}
