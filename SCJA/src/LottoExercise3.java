import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;

import javax.swing.*;

public class LottoExercise3 extends JFrame {

	private JPanel numPanel;
	private JTextField[] tfNums;
	private JButton generate;
	
	public LottoExercise3(){
		numPanel = new JPanel();
		tfNums = new JTextField[7];
		for(int i = 0; i < 7; i++){
			tfNums[i] = new JTextField();
		}

		numPanel.setLayout(new GridLayout(1,7));
		
		for(int i = 0; i < 7; i++){
			numPanel.add(tfNums[i]);
		}
		
		setLayout(new BorderLayout());
		add(numPanel,BorderLayout.CENTER);
		
		generate = new JButton("Generate");
		ListenForButton lForButton = new ListenForButton();
		generate.addActionListener(lForButton);
		add(generate, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,100);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new LottoExercise3();

	}
	
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			int[] numbers = new int[5];
			
			Random genNum = new Random();
			for(int i = 0; i < numbers.length; i++){
				int num = genNum.nextInt(50) + 1;
				numbers[i] = num;
				for(int j = i - 1; j >= 0; j--){
					if(num == numbers[j]){
						i--;
						break;
					}
				}		
			}
			Arrays.sort(numbers);
			for(int i = 0; i < 5; i++){
				tfNums[i].setText(""+ numbers[i]);
			}
			
			int star1 = genNum.nextInt(11) + 1;
			int star2;
			do{
				star2 = genNum.nextInt(11) + 1;
			}while(star1 == star2);
			
			tfNums[5].setText(""+ Math.min(star1, star2));
			tfNums[5].setBackground(Color.ORANGE);
			tfNums[6].setText(""+ Math.max(star1, star2));
			tfNums[6].setBackground(Color.ORANGE);
		}
	}
}
