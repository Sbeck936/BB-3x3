
public class Player {
	private int height;
	private String name;
	
	public Player() {

	}
	
	public Player(int height, String name) {
		this.height = height;
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return " Player{Name=" + this.name + ", Height=" + this.height + "}";
	}

}
