package gameInterface;

import java.io.Serializable;

public class GameLobbyData implements Serializable {
	private String playerNum;
	
	public void setPlayerNum(String playerNum) {
		this.playerNum = playerNum;
	}
	
	public String getPlayerNum() {
		return playerNum;
		
	}
	  
	  // Constructor that initializes the username and password.
	  public GameLobbyData(String playerNum)
	  {
		  setPlayerNum(playerNum);
	  }
}
