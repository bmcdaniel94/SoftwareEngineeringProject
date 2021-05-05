package gameInterface;

import java.io.Serializable;

public class CharacterData implements Serializable{
	  private String username;
	  private String character;
	  private double hp;
	  private int attack;
	  private boolean turn;
	
	  
	 public String getUsername() {
		return username;
	 }

	public String getCharacter() {
		return character;
	}
	
	public double getHp() {
		return hp;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setCharacter(String character) {
		this.character = character;
	} 
	
	public void setHp(double dmg) {
		this.hp = dmg;
	} 
	
	public void setAttack(int attack) {
		this.attack = attack;
	} 
	
	public CharacterData(String username, String character, int hp, int attack) {
		setUsername(username);
		setCharacter(character);
		setHp(hp);
		setAttack(attack);
	}

	public void setTurn(boolean t) {
		this.turn = t;
	}

	public boolean getTurn() {
		return turn;
	}

}
