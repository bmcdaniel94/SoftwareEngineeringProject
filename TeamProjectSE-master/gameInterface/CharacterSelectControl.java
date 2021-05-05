package gameInterface;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import GUI.CharacterSelectPanel;
import GUI.CreateAccountPanel;
import GUI.LoginPanel;
import clientSubSystem.GameClient;

public class CharacterSelectControl implements ActionListener
{
	private JPanel container; 
	private GameClient client;
	
	public CharacterSelectControl(JPanel container, GameClient client) {
		this.container = container;
		this.client = client; 
	}

	
	public void actionPerformed(ActionEvent e) {
	    // Get the name of the button clicked.
	    String command = e.getActionCommand();

	    
	    // The Login button takes the user to the login panel.
	    if (command.equals("Choose Character 1"))
	    {
	        CharacterData data = new CharacterData("", "Water", 75, 25);
	        try {
				client.sendToServer(data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	    	
	     
	    }
	    
	    // The Create button takes the user to the create account panel.
	    else if (command.equals("Choose Character 2"))
	    {
	        CharacterData data = new CharacterData("", "Fire", 50, 75);
	        try {
				client.sendToServer(data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	    }
	    
	    else if (command.equals("Choose Character 3"))
	    {
	        CharacterData data = new CharacterData("", "Earth", 100, 30);
	        try {
				client.sendToServer(data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	    }
	    
	    else if (command.equals("Choose Character 4"))
	    {
	        CharacterData data = new CharacterData("", "Air", 25, 50);
	        try {
				client.sendToServer(data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	    }
		
	}
	
	public void CharacterSelectSuccess(){
	      CardLayout cardLayout = (CardLayout)container.getLayout();
	      cardLayout.show(container, "5");
		
	}

	
}
