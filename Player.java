
public class Player {
	private String name;
	private Key key;
	private Lamp lamp;
	private int x;
	private int y;
	
	
	//returns the key the player is currently holding.
	public Key getKey() {
		return key;
	}
	
	//returns the lamp teh player is currently holding
	public Lamp getLamp() {
		return lamp;
	}
	
	//sets the key the player has found
	public void setKey(Key newKey) {
		key = newKey;
	}
	
	//sets the lamp the player has found
	public void setLamp(Lamp newLamp) {
		lamp = newLamp;
	}
	
	//sets a name for the user's avatar
	public void setName(String userName) {
		name = userName;
	}
	
	//checks to see if the player currently has a key
	public boolean hasKey() {
		if(key.equals(null)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//checks to see if the player currently has a lamp
	public boolean hasLamp() {
		if(lamp.equals(null)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	//returns the x coordinate of the space the player currently occupies
	public int getX() {
		return x;
	}
	
	//returns the y coordinate of the space the player currently occupies
	public int getY() {
		return y;
	}
	
	//Prints the entire location of the player 
	public String getLocation() {
		return ("(" + x + "," + y + ")");
	}
	
	//sets the coordinates of the player
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//toString method for displaying the player's current stats.
	public String toString() {
		return ("Player Name: " + name + "\n" +
				"Key: " + this.getKey() + "\n" +
				"Lamp: " + this.getLamp() + "\n" +
				"Current Coordinates: " + this.getLocation());
	}
	
	

}
