package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import GUI.P1GameArenaPanel;
import GUI.P2GameArenaPanel;
import clientSubSystem.GameClient;

public class P2GameArenaControl implements ActionListener{

	private static JPanel container;
	private GameClient client;

	public P2GameArenaControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}


	public void actionPerformed(ActionEvent e) {

		// Get the name of the button clicked.
		String command = e.getActionCommand();

		// The Cancel button takes the user back to the initial panel.
		if (command.equals("Attack"))
		{
			try {
				client.sendToServer("Attack2");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		else if(command.equals("Defend")) {
			try {
				client.sendToServer("Defend");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		else if(command.equals("Quit Game")) {
			try {
				client.sendToServer("Player 1 Quit");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}

	}


	public static void dmgCalc1(Object arg0) {
		P2GameArenaPanel p2 = (P2GameArenaPanel)container.getComponent(6);
		System.out.println(arg0);
		p2.setHp2(p2.getHp2() - (double) arg0);
		
	}

	public static void dmgCalc3(Object arg0) {
		P2GameArenaPanel p2 = (P2GameArenaPanel)container.getComponent(6);
		System.out.println(arg0);
		p2.setHp1(p2.getHp1() - (double) arg0);
		
	}

	
}