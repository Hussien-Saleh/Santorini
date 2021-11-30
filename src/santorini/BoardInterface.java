package santorini;

import santorini.exceptions.InvalidMoveException;
import santorini.exceptions.InvalidPlacementException;
import santorini.players.Player;
import santorini.tiles.Piece;
import santorini.utilities.Location;

public interface BoardInterface {
	int SIDE = 5;
	
	void move(Piece piece, Location newLocation) throws InvalidMoveException;
	void place(Piece piece, Location newLocation) throws InvalidPlacementException;
	boolean isGameOver();
	boolean isWinner(Player player);
	boolean hasNoMoves(Player player);
	Player getWinner();
	boolean canMove(Piece piece, Location location);
	boolean canPlace(Piece piece, Location location);
	Player getTurn();
	String [][] display();
}