import junit.framework.TestCase;
import chessboard.ChessBoard;

public class ChessBoardPublicTests extends TestCase {
	static final int PLAYER0 = 0;
	static final int PLAYER1 = 1;

	private ChessBoard instance;

	protected void setUp() throws Exception {
		instance = new ChessBoard();
	}

	public void testKingPlayer0() {
		String[] board = { "....k...", "........", "........", "........",
				"........", "........", "....K..." };
		assertEquals("Player 0 has the king only.", 1,
				instance.getCount(board, PLAYER0));
	}

	public void testKingAndQueenPlayer0() {
		String[] board = { "....k...", "........", "........", "........",
				"........", "........", "........", "...QK..." };
		assertEquals("Player 0 has the king and queen.", 2,
				instance.getCount(board, PLAYER0));
	}

	public void test8PawnsAndKingPlayer1() {
		String[] board = { "....k...", "pppppppp", "........", "........",
				"........", "........", "........", "...QK..." };
		assertEquals("Player 1 has 1 king and 8 pawns.", 9,
				instance.getCount(board, PLAYER1));
	}

	public void testNoPlayer0() {
		String[] board = { "....k...", "pppppppp", "........", "........",
				"........", "........", "........", "........" };
		assertEquals("Player 0 has nothing left.", 0,
				instance.getCount(board, PLAYER0));
	}

	public void testFullHouse() {
		String[] board = { "rnbqkbnr", "pppppppp", "........", "........",
				"........", "........", "PPPPPPPP", "RNBQKBNR" };
		assertEquals("Both players have all their pieces.", 16,
				instance.getCount(board, PLAYER0));
	}

}
