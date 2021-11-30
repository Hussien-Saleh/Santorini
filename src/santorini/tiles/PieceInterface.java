package santorini.tiles;

import java.util.ArrayList;
import santorini.utilities.Location;

public interface PieceInterface {
	ArrayList<Location> possibleMoves();
	ArrayList<Location> possiblePlacements();
}
