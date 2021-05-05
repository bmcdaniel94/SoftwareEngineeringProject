package GUI;

import java.awt.event.ActionListener;

import javax.swing.*;


import clientSubSystem.LoginControl;
import gameInterface.GameLobbyControl;
import java.awt.GridLayout;


public class GameLobbyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel lblFinding;
	
	//setter for error text
	public void setFinding(String finding)
	{
		lblFinding.setText(finding);
	}

	public GameLobbyPanel(GameLobbyControl gl) {
		
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		lblFinding = new JLabel("");
		panel.add(lblFinding);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		
		JButton findGameButton = new JButton("Find Games");
		panel_1.add(findGameButton);
		
		findGameButton.addActionListener((ActionListener) gl);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);

	}
	

}
