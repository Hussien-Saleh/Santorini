package santorini.players;

import santorini.tiles.Cube;
import santorini.tiles.Piece;
import santorini.tiles.Pyramid;

public class Player {
	private String name;
	private Piece t1;
	private Piece t2;
	
	public Player() { 
		
	}

	 public Player(String name, int t) {
		 this.name = name;
		 if (t == 1) {
			 t1 = new Cube();
			 t2 = new Cube();
		 }
		 if (t == 2) {
			 t1 = new Pyramid();
			 t2 = new Pyramid();
		 }
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Piece getT1() {
		return t1;
	}

	public void setT1(Piece t1) {
		this.t1 = t1;
	}

	public Piece getT2() {
		return t2;
	}

	public void setT2(Piece t2) {
		this.t2 = t2;
	}
}
