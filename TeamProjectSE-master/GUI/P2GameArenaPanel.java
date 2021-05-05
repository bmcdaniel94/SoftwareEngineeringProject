package GUI;

import javax.swing.*;

import gameInterface.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class P2GameArenaPanel extends JPanel {
	
	private JLabel hp2Indicator;
	private JLabel hp1Indicator;
	private JLabel characterTwo = new JLabel();
	private JLabel characterOne = new JLabel();
	
	
	public double getHp1() {
		return Double.parseDouble(hp1Indicator.getText());
	}
	
	public double getHp2() {
		return Double.parseDouble(hp2Indicator.getText());
	}
	
	public void setHp1(double d) {
		String str = String.valueOf(d);
		hp1Indicator.setText(str);
	}
	
	public void setHp2(double d) {
		String str = String.valueOf(d);
		hp2Indicator.setText(str);
	}
	
	public void setChar1(String character1) {
		if(character1.equals("Water")) {

			
			characterOne.setIcon(new ImageIcon(this.getClass().getResource("/waterwiz.png")));
			
		}
		else if(character1.equals("Fire")) {
			characterOne.setIcon(new ImageIcon(this.getClass().getResource("/fireWiz.png")));
			
		}
		else if(character1.equals("Earth")) {
			characterOne.setIcon(new ImageIcon(this.getClass().getResource("/earthWiz.png")));
			
		}
		else if(character1.equals("Air")) {
			characterOne.setIcon(new ImageIcon(this.getClass().getResource("/whiteWiz.png")));
			
		}

	}
	
	public void setChar2(String character2) {
		if(character2.equals("Water")) {

			
			characterTwo.setIcon(new ImageIcon(this.getClass().getResource("/waterwiz.png")));
			
		}
		else if(character2.equals("Fire")) {
			characterTwo.setIcon(new ImageIcon(this.getClass().getResource("/fireWiz.png")));
			
		}
		else if(character2.equals("Earth")) {
			characterTwo.setIcon(new ImageIcon(this.getClass().getResource("/earthWiz.png")));
			
		}
		else if(character2.equals("Air")) {
			characterTwo.setIcon(new ImageIcon(this.getClass().getResource("/whiteWiz.png")));
			
		}
	}
	

	public P2GameArenaPanel(P2GameArenaControl ga2) {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		//---------------------------------------------------------------
		
		//Player 2-------------------------------------------------------
		JLabel player2Label = new JLabel("Player 2");
		panel.add(player2Label);
		
		//Player 1 HP---------------------------------------------------
		JLabel hp1Label = new JLabel("HP: ");
		panel.add(hp1Label);
		hp1Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		hp2Indicator = new JLabel("0");
		panel.add(hp2Indicator);
		hp2Indicator.setHorizontalAlignment(SwingConstants.CENTER);
						
		JPanel panel_14 = new JPanel();
		add(panel_14);
				
		JPanel panel_15 = new JPanel();
		add(panel_15);
				
		JPanel panel_2 = new JPanel();
		add(panel_2);
				
		JPanel panel_7 = new JPanel();
		add(panel_7);
				
				//Player 1------------------------------------------------------
		JLabel player1Label = new JLabel("Player 1");
		panel_7.add(player1Label);
				
				//Player 2 HP----------------------------------------------------
		JLabel hp2Label = new JLabel("HP: ");
		panel_7.add(hp2Label);
		hp2Label.setHorizontalAlignment(SwingConstants.CENTER);
				
		hp1Indicator = new JLabel("0");
		panel_7.add(hp1Indicator);
		hp1Indicator.setHorizontalAlignment(SwingConstants.CENTER);
				
		JPanel panel_8 = new JPanel();
		add(panel_8);
				
		panel_8.add(characterTwo);
				
		JPanel panel_1 = new JPanel();
		add(panel_1);
				
		JPanel panel_13 = new JPanel();
		add(panel_13);
				
		JPanel panel_16 = new JPanel();
		add(panel_16);
				
		JPanel panel_3 = new JPanel();
		add(panel_3);
				
		panel_3.add(characterOne);
				
		JPanel panel_6 = new JPanel();
		add(panel_6);
				
				//Player 1 Buttons----------------------------------------------
		JButton attackButton = new JButton("Attack");
		panel_6.add(attackButton);
		attackButton.addActionListener((ActionListener) ga2);
		
		JButton defendButton = new JButton("Defend");
		panel_6.add(defendButton);
		defendButton.addActionListener((ActionListener) ga2);
		
		JPanel panel_9 = new JPanel();
		add(panel_9);
				
		JPanel panel_10 = new JPanel();
		add(panel_10);
				
		JPanel panel_11 = new JPanel();
		add(panel_11);
				
		JPanel panel_12 = new JPanel();
		add(panel_12);
				
		JButton quitButton = new JButton("Quit Game");
		panel_12.add(quitButton);
		quitButton.addActionListener((ActionListener) ga2);
	}

	
}
